/*
 * generated by Xtext
 */
package fr.mines_nantes.atlanmod.giraffe.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GiraffeDSLGenerator implements IGenerator {
	
	String providers = ''
	String artifacts = ''
	String confartifacts = ''
	String setups = ''
	String deploys = ''
	Resource globalRes
	String header = '''
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class GiraffeDSL {
	static Map<String,Object> provider;
	'''
	String foot = '''
}
	'''
	String mainClass = header

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		globalRes = resource
		
		for (p:resource.allContents.toIterable.filter(Provider)) {
			providers = providers + p.compile.toString
		}
		for (op:resource.allContents.toIterable.filter(OtherProvider)) {
				providers = providers + op.compile.toString
		}
		for (op:resource.allContents.toIterable.filter(Artifact)) {
				artifacts = artifacts + op.compile.toString
		}
		for (op:resource.allContents.toIterable.filter(ConfArtifact)) {
				confartifacts = confartifacts + op.compile.toString
		}
		for (op:resource.allContents.toIterable.filter(Setup)) {
				setups = setups + op.compile.toString
		}
		for (op:resource.allContents.toIterable.filter(Deploy)) {
				deploys = deploys + op.compile.toString
		}
	
		mainClass = mainClass + providers + artifacts + confartifacts + setups + deploys
		mainClass = mainClass + foot
		
		fsa.generateFile(
			"GiraffeDSL.java",
				mainClass
		)
	}
	
	def compile(Deploy d) '''
	@Deploy(name="«d.name»")
	public Map<String, Object> getDeploy«d.name.toFirstUpper»() {
		List<Map<String, Object>> executions = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> configs = new ArrayList<Map<String, Object>>();
		Map<String, Object> setUps = new HashMap<String, Object>();
		Map<String, Object> deploy = new HashMap<String, Object>();
		«FOR s: d.setups»
			setUps.put("«s.name»", getSetUp«s.name.toFirstUpper»());
		«ENDFOR»
		deploy.put("setups", setUps);
		deploy.put("timeout", «d.timeout»);
		«FOR exec: d.executions»
			Map<String, Object> execution = new HashMap<String, Object>();
			Map<String, Object> appArtifact = new HashMap<String, Object>();
			appArtifact.put("type", "«exec.code.type»");
			appArtifact.put("artifact", getArtifact«exec.code.name.toFirstUpper»());
			execution.put("action", appArtifact);
			«FOR conf : exec.config»
				Map<String, Object> config = new HashMap<String, Object>();
				config.put("name", "«conf.name»");
				config.put("artifact", getConfArtifact«conf.name.toFirstUpper»());
				configs.add(config);
			«ENDFOR»
			execution.put("configs", configs);
			execution.put("range", «exec.nodes.range»);
			execution.put("sequence", "«exec.seq»");
			executions.add(execution);
		«ENDFOR»
		deploy.put("executions", executions);
		return deploy;
	} 
	'''
	
	def compile(Setup s) '''
	@SetUp(name="«s.name»")
	public Map<String, Object> getSetUp«s.name.toFirstUpper»() {
		Map<String, Object> setUp = new HashMap<String, Object>();
		setUp.put("provider", "«s.provider.name»");
		setUp.put("machines", «s.numberMachines»);
		setUp.put("autoscale", «s.autoscale»);
		setUp.put("predictive", «s.predictive»);
		return setUp;
	} 
	'''
	
	def compile(Artifact a) '''
	@Artifact(name="«a.name»")
	public Map<String, Object> getArtifact«a.name.toFirstUpper»() {
		Map<String, Object> artifact = new HashMap<String, Object>(); 
		«IF a.type == 'code'»
			«FOR co : globalRes.allContents.toIterable.filter(Code)»
				«IF co.name == a.name»
					artifact.put("code", "«co.code»");
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«IF a.type == 'code-external'»
			«FOR co : globalRes.allContents.toIterable.filter(CodeExternal)»
				«IF co.name == a.name»
					artifact.put("class", «co.class_»);
					artifact.put("method", «co.method»);
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«IF a.type == 'script'»
			«FOR sc : globalRes.allContents.toIterable.filter(Script)»
				«IF sc.name == a.name»
					artifact.put("file", «sc.scriptFile»);
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«IF a.type == 'script-command'»
			«FOR sc : globalRes.allContents.toIterable.filter(ScriptCommand)»
				«IF sc.name == a.name»
					artifact.put("command", "«sc.scriptCommand»");
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«IF a.type == 'script-block'»
			«FOR sc : globalRes.allContents.toIterable.filter(ScriptBlock)»
				«IF sc.name == a.name»
					artifact.put("block", "«sc.block»");
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		return artifact;
	}
	'''
	
	def compile(ConfArtifact ca) '''
	@Artifact(name="«ca.name»")
	public Map<String, Object> getConfArtifact«ca.name.toFirstUpper»() {
		Map<String, Object> artifact = new HashMap<String, Object>(); 
		«IF ca.type == 'config'»
			«FOR conf : globalRes.allContents.toIterable.filter(Config)»
				«IF conf.name == ca.name»
					artifact.put("local", «conf.localFile»);
					artifact.put("remote", «conf.destFile»);
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«IF ca.type == 'config-block'»
			«FOR conf : globalRes.allContents.toIterable.filter(ConfigBlock)»
				«IF conf.name == ca.name»
					artifact.put("local", «conf.config»);
					artifact.put("remote", «conf.destFile»);
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		return artifact;
	}
	'''
	
	def compile(Provider p) '''
  	@Provider(name="«p.name»")
  	public Map<String, Object> getProvider«p.name.toFirstUpper»() {
  		Map<String, Object> providerFeatures = new HashMap<String, Object>();
  		Map<String, String> vMachine = new HashMap<String, String>();
  		Map<String, String> dependency = new HashMap<String, String>();
  		List<String> requirements = new ArrayList<String>();
  		List<Map<String, String>> dependencies = new ArrayList<Map<String, String>>();
  		providerFeatures.put("providerType", new String("«p.type»"));
  		providerFeatures.put("authType", new String("«p.authMethod.type»"));
  		«IF p.authMethod.type == 'password'»
  			«FOR pass : globalRes.allContents.toIterable.filter(Password)»
  				«IF pass.name == p.authMethod.name»
  					providerFeatures.put("authUser", new String("«pass.username»"));
  					providerFeatures.put("authPassword", new String("«pass.password»"));
  				«ENDIF»
  			«ENDFOR»
  		«ENDIF»
  		«IF p.authMethod.type == 'key'»
  			«FOR k : globalRes.allContents.toIterable.filter(Key)»
  				«IF k.name == p.authMethod.name»
  					providerFeatures.put("authKey", new String("«k.keyFile»"));
  				«ENDIF»
  			«ENDFOR»
  		«ENDIF»
  		«IF p.authMethod.type == 'credential'»
  			«FOR c : globalRes.allContents.toIterable.filter(Credential)»
  				«IF c.name == p.authMethod.name»
  					providerFeatures.put("authCredential", new String("«c.credentialFile»"));
  				«ENDIF»
  			«ENDFOR»
  		«ENDIF»
  		providerFeatures.put("cpu", new String("«p.resources.cpu»"));
  		providerFeatures.put("memory", new String("«p.resources.memory»"));
  		providerFeatures.put("disk", new String("«p.resources.disk»"));
  		providerFeatures.put("resRelax", new String("«p.resources.relax»"));
  		vMachine.put("so", "«p.vm.so»");
  		vMachine.put("distribution", "«p.vm.distribution»");
  		vMachine.put("version", "«p.vm.version»");
  		vMachine.put("authtype", "«p.vm.auth.type»");
  		«IF p.vm.auth.type == 'password'»
  			«FOR pass : globalRes.allContents.toIterable.filter(Password)»
  				«IF pass.name == p.vm.auth.name»
  					vMachine.put("user", "«pass.username»");
  					vMachine.put("password", "«pass.password»");
  				«ENDIF»
  			«ENDFOR»
  		«ENDIF»
  		«IF p.vm.auth.type == 'key'»
  			«FOR k : globalRes.allContents.toIterable.filter(Key)»
  				«IF k.name == p.vm.auth.name»
  					vMachine.put("key", "«k.keyFile»");
  				«ENDIF»
  			«ENDFOR»
  		«ENDIF»
  		«IF p.vm.auth.type == 'credential'»
  			«FOR c : globalRes.allContents.toIterable.filter(Credential)»
  				«IF c.name == p.vm.auth.name»
  					vMachine.put("credential", "«c.credentialFile»");
  				«ENDIF»
  			«ENDFOR»
  		«ENDIF»
  		providerFeatures.put("vm", vMachine);
  		
  		«FOR de: p.vm.dep»	
  			«FOR dep : globalRes.allContents.toIterable.filter(Dependency)»
  				«IF dep.name == de.name»
	  				«IF dep.type == 'install'»
	  					«FOR install : globalRes.allContents.toIterable.filter(Install)»
	  						«IF dep.name == install.name»
	  							dependency.put("name", "«install.name»");
	  							dependency.put("type", "install");
	  							dependency.put("package", "«install.depName»");
	  							dependency.put("version", "«install.depVersion»");
	  						«ENDIF»
	  					«ENDFOR»
	  				«ENDIF»
	  				«IF dep.type == 'service'»
	  					«FOR service : globalRes.allContents.toIterable.filter(Service)»
	  						«IF dep.name == service.name»
	  							dependency.put("name", "«service.name»");
	  							dependency.put("type", "service");
	  							dependency.put("action", "«service.srvAction»");
	  							dependency.put("srvName", "«service.serviceName»");
	  						«ENDIF»
	  					«ENDFOR»		
	  				«ENDIF»
	  				«IF dep.type == 'file'»
	  					«FOR file : globalRes.allContents.toIterable.filter(File)»
	  						«IF dep.name == file.name»
	  							dependency.put("name", "«file.name»");
	  							dependency.put("type", "file");
	  							dependency.put("type", "«file.fileType»");
	  							dependency.put("location", "«file.location»");
	  						«ENDIF»
	  					«ENDFOR»
	  				«ENDIF»
	  				dependencies.add(dependency);
  				«ENDIF»
  			«ENDFOR»
  		«ENDFOR»
  		providerFeatures.put("dependencies", dependencies);
  		return providerFeatures;
  	}
  	'''
  	
	def compile(OtherProvider op) '''
  	@Provider
  	public static Map<String, Object> getProvider«op.name.toFirstUpper»() {
  		Map<String, Object> providerFeatures = new HashMap<String, Object>();
  		providerFeatures.put("providerName", new String("«op.name»"));
  		providerFeatures.put("authName", new String("«op.authMethod.name»"));
  		return providerFeatures;
  	} 
	'''
}
