/*
* generated by Xtext
*/
package fr.mines_nantes.atlanmod.giraffe.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.mines_nantes.atlanmod.giraffe.services.GiraffeDSLGrammarAccess;

public class GiraffeDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private GiraffeDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.mines_nantes.atlanmod.giraffe.ui.contentassist.antlr.internal.InternalGiraffeDSLParser createParser() {
		fr.mines_nantes.atlanmod.giraffe.ui.contentassist.antlr.internal.InternalGiraffeDSLParser result = new fr.mines_nantes.atlanmod.giraffe.ui.contentassist.antlr.internal.InternalGiraffeDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeploymentDefinitionsAccess().getArtifactsAlternatives_3_0(), "rule__DeploymentDefinitions__ArtifactsAlternatives_3_0");
					put(grammarAccess.getRequerimentsAccess().getAlternatives(), "rule__Requeriments__Alternatives");
					put(grammarAccess.getProvidersAccess().getAlternatives(), "rule__Providers__Alternatives");
					put(grammarAccess.getAuthAccess().getAlternatives(), "rule__Auth__Alternatives");
					put(grammarAccess.getDependencyAccess().getAlternatives(), "rule__Dependency__Alternatives");
					put(grammarAccess.getArtifactAccess().getAlternatives(), "rule__Artifact__Alternatives");
					put(grammarAccess.getConfArtifactAccess().getAlternatives(), "rule__ConfArtifact__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives(), "rule__EFloat__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getNativeProvTypeAccess().getAlternatives(), "rule__NativeProvType__Alternatives");
					put(grammarAccess.getNativeRequirementAccess().getAlternatives(), "rule__NativeRequirement__Alternatives");
					put(grammarAccess.getNativeDistributionAccess().getAlternatives(), "rule__NativeDistribution__Alternatives");
					put(grammarAccess.getSrvSignalAccess().getAlternatives(), "rule__SrvSignal__Alternatives");
					put(grammarAccess.getFileTypeAccess().getAlternatives(), "rule__FileType__Alternatives");
					put(grammarAccess.getMonitoringTypeAccess().getAlternatives(), "rule__MonitoringType__Alternatives");
					put(grammarAccess.getGiraffeMetaModelAccess().getGroup(), "rule__GiraffeMetaModel__Group__0");
					put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
					put(grammarAccess.getDeploymentDefinitionsAccess().getGroup(), "rule__DeploymentDefinitions__Group__0");
					put(grammarAccess.getDeploymentAccess().getGroup(), "rule__Deployment__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVirtualMachineAccess().getGroup(), "rule__VirtualMachine__Group__0");
					put(grammarAccess.getVirtualMachineAccess().getGroup_3(), "rule__VirtualMachine__Group_3__0");
					put(grammarAccess.getProviderAccess().getGroup(), "rule__Provider__Group__0");
					put(grammarAccess.getOtherProviderAccess().getGroup(), "rule__OtherProvider__Group__0");
					put(grammarAccess.getPasswordAccess().getGroup(), "rule__Password__Group__0");
					put(grammarAccess.getKeyAccess().getGroup(), "rule__Key__Group__0");
					put(grammarAccess.getCredentialAccess().getGroup(), "rule__Credential__Group__0");
					put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
					put(grammarAccess.getInstallAccess().getGroup(), "rule__Install__Group__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getConfigAccess().getGroup(), "rule__Config__Group__0");
					put(grammarAccess.getConfigBlockAccess().getGroup(), "rule__ConfigBlock__Group__0");
					put(grammarAccess.getCodeAccess().getGroup(), "rule__Code__Group__0");
					put(grammarAccess.getCodeExternalAccess().getGroup(), "rule__CodeExternal__Group__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getScriptCommandAccess().getGroup(), "rule__ScriptCommand__Group__0");
					put(grammarAccess.getScriptBlockAccess().getGroup(), "rule__ScriptBlock__Group__0");
					put(grammarAccess.getNodesetAccess().getGroup(), "rule__Nodeset__Group__0");
					put(grammarAccess.getSetupAccess().getGroup(), "rule__Setup__Group__0");
					put(grammarAccess.getDeployAccess().getGroup(), "rule__Deploy__Group__0");
					put(grammarAccess.getExecutionAccess().getGroup(), "rule__Execution__Group__0");
					put(grammarAccess.getExecutionAccess().getGroup_4(), "rule__Execution__Group_4__0");
					put(grammarAccess.getEFloatAccess().getGroup_0(), "rule__EFloat__Group_0__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getCPUAccess().getGroup(), "rule__CPU__Group__0");
					put(grammarAccess.getGiraffeMetaModelAccess().getImportsAssignment_0(), "rule__GiraffeMetaModel__ImportsAssignment_0");
					put(grammarAccess.getGiraffeMetaModelAccess().getEnvironmentAssignment_1(), "rule__GiraffeMetaModel__EnvironmentAssignment_1");
					put(grammarAccess.getGiraffeMetaModelAccess().getDeploymentdefinitionsAssignment_2(), "rule__GiraffeMetaModel__DeploymentdefinitionsAssignment_2");
					put(grammarAccess.getGiraffeMetaModelAccess().getDeploymentAssignment_3(), "rule__GiraffeMetaModel__DeploymentAssignment_3");
					put(grammarAccess.getEnvironmentAccess().getAuthsAssignment_3(), "rule__Environment__AuthsAssignment_3");
					put(grammarAccess.getEnvironmentAccess().getResourcesAssignment_4(), "rule__Environment__ResourcesAssignment_4");
					put(grammarAccess.getEnvironmentAccess().getDependenciesAssignment_5(), "rule__Environment__DependenciesAssignment_5");
					put(grammarAccess.getEnvironmentAccess().getVirtualmachinesAssignment_6(), "rule__Environment__VirtualmachinesAssignment_6");
					put(grammarAccess.getEnvironmentAccess().getProvidersAssignment_7(), "rule__Environment__ProvidersAssignment_7");
					put(grammarAccess.getDeploymentDefinitionsAccess().getArtifactsAssignment_3(), "rule__DeploymentDefinitions__ArtifactsAssignment_3");
					put(grammarAccess.getDeploymentDefinitionsAccess().getNodesetsAssignment_4(), "rule__DeploymentDefinitions__NodesetsAssignment_4");
					put(grammarAccess.getDeploymentAccess().getSetupsAssignment_2(), "rule__Deployment__SetupsAssignment_2");
					put(grammarAccess.getDeploymentAccess().getDeploysAssignment_3(), "rule__Deployment__DeploysAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getVirtualMachineAccess().getNameAssignment_1(), "rule__VirtualMachine__NameAssignment_1");
					put(grammarAccess.getVirtualMachineAccess().getSoAssignment_3_0(), "rule__VirtualMachine__SoAssignment_3_0");
					put(grammarAccess.getVirtualMachineAccess().getDistributionAssignment_3_1(), "rule__VirtualMachine__DistributionAssignment_3_1");
					put(grammarAccess.getVirtualMachineAccess().getVersionAssignment_3_2(), "rule__VirtualMachine__VersionAssignment_3_2");
					put(grammarAccess.getVirtualMachineAccess().getAuthAssignment_5(), "rule__VirtualMachine__AuthAssignment_5");
					put(grammarAccess.getVirtualMachineAccess().getDepAssignment_7(), "rule__VirtualMachine__DepAssignment_7");
					put(grammarAccess.getRequerimentsAccess().getNativeAssignment_0(), "rule__Requeriments__NativeAssignment_0");
					put(grammarAccess.getRequerimentsAccess().getOtherAssignment_1(), "rule__Requeriments__OtherAssignment_1");
					put(grammarAccess.getProviderAccess().getTypeAssignment_1(), "rule__Provider__TypeAssignment_1");
					put(grammarAccess.getProviderAccess().getNameAssignment_2(), "rule__Provider__NameAssignment_2");
					put(grammarAccess.getProviderAccess().getAuthMethodAssignment_4(), "rule__Provider__AuthMethodAssignment_4");
					put(grammarAccess.getProviderAccess().getResourcesAssignment_6(), "rule__Provider__ResourcesAssignment_6");
					put(grammarAccess.getProviderAccess().getVmAssignment_8(), "rule__Provider__VmAssignment_8");
					put(grammarAccess.getProviderAccess().getHostAssignment_10(), "rule__Provider__HostAssignment_10");
					put(grammarAccess.getOtherProviderAccess().getTypeAssignment_1(), "rule__OtherProvider__TypeAssignment_1");
					put(grammarAccess.getOtherProviderAccess().getNameAssignment_2(), "rule__OtherProvider__NameAssignment_2");
					put(grammarAccess.getOtherProviderAccess().getAuthMethodAssignment_4(), "rule__OtherProvider__AuthMethodAssignment_4");
					put(grammarAccess.getOtherProviderAccess().getResourcesAssignment_6(), "rule__OtherProvider__ResourcesAssignment_6");
					put(grammarAccess.getOtherProviderAccess().getVmAssignment_8(), "rule__OtherProvider__VmAssignment_8");
					put(grammarAccess.getOtherProviderAccess().getHostAssignment_10(), "rule__OtherProvider__HostAssignment_10");
					put(grammarAccess.getOtherProviderAccess().getImportsAssignment_12(), "rule__OtherProvider__ImportsAssignment_12");
					put(grammarAccess.getPasswordAccess().getTypeAssignment_1(), "rule__Password__TypeAssignment_1");
					put(grammarAccess.getPasswordAccess().getNameAssignment_2(), "rule__Password__NameAssignment_2");
					put(grammarAccess.getPasswordAccess().getUsernameAssignment_4(), "rule__Password__UsernameAssignment_4");
					put(grammarAccess.getPasswordAccess().getPasswordAssignment_6(), "rule__Password__PasswordAssignment_6");
					put(grammarAccess.getKeyAccess().getTypeAssignment_1(), "rule__Key__TypeAssignment_1");
					put(grammarAccess.getKeyAccess().getNameAssignment_2(), "rule__Key__NameAssignment_2");
					put(grammarAccess.getKeyAccess().getKeyFileAssignment_4(), "rule__Key__KeyFileAssignment_4");
					put(grammarAccess.getCredentialAccess().getTypeAssignment_1(), "rule__Credential__TypeAssignment_1");
					put(grammarAccess.getCredentialAccess().getNameAssignment_2(), "rule__Credential__NameAssignment_2");
					put(grammarAccess.getCredentialAccess().getCredentialFileAssignment_4(), "rule__Credential__CredentialFileAssignment_4");
					put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
					put(grammarAccess.getResourceAccess().getCpuAssignment_3(), "rule__Resource__CpuAssignment_3");
					put(grammarAccess.getResourceAccess().getMemoryAssignment_5(), "rule__Resource__MemoryAssignment_5");
					put(grammarAccess.getResourceAccess().getDiskAssignment_7(), "rule__Resource__DiskAssignment_7");
					put(grammarAccess.getResourceAccess().getRelaxAssignment_9(), "rule__Resource__RelaxAssignment_9");
					put(grammarAccess.getInstallAccess().getTypeAssignment_1(), "rule__Install__TypeAssignment_1");
					put(grammarAccess.getInstallAccess().getNameAssignment_2(), "rule__Install__NameAssignment_2");
					put(grammarAccess.getInstallAccess().getDepNameAssignment_4(), "rule__Install__DepNameAssignment_4");
					put(grammarAccess.getInstallAccess().getDepVersionAssignment_6(), "rule__Install__DepVersionAssignment_6");
					put(grammarAccess.getServiceAccess().getTypeAssignment_1(), "rule__Service__TypeAssignment_1");
					put(grammarAccess.getServiceAccess().getSrvActionAssignment_2(), "rule__Service__SrvActionAssignment_2");
					put(grammarAccess.getServiceAccess().getNameAssignment_3(), "rule__Service__NameAssignment_3");
					put(grammarAccess.getServiceAccess().getServiceNameAssignment_5(), "rule__Service__ServiceNameAssignment_5");
					put(grammarAccess.getFileAccess().getTypeAssignment_1(), "rule__File__TypeAssignment_1");
					put(grammarAccess.getFileAccess().getFileTypeAssignment_2(), "rule__File__FileTypeAssignment_2");
					put(grammarAccess.getFileAccess().getNameAssignment_3(), "rule__File__NameAssignment_3");
					put(grammarAccess.getFileAccess().getLocationAssignment_5(), "rule__File__LocationAssignment_5");
					put(grammarAccess.getConfigAccess().getTypeAssignment_1(), "rule__Config__TypeAssignment_1");
					put(grammarAccess.getConfigAccess().getNameAssignment_2(), "rule__Config__NameAssignment_2");
					put(grammarAccess.getConfigAccess().getLocalFileAssignment_4(), "rule__Config__LocalFileAssignment_4");
					put(grammarAccess.getConfigAccess().getDestFileAssignment_5(), "rule__Config__DestFileAssignment_5");
					put(grammarAccess.getConfigBlockAccess().getTypeAssignment_1(), "rule__ConfigBlock__TypeAssignment_1");
					put(grammarAccess.getConfigBlockAccess().getNameAssignment_2(), "rule__ConfigBlock__NameAssignment_2");
					put(grammarAccess.getConfigBlockAccess().getDestFileAssignment_4(), "rule__ConfigBlock__DestFileAssignment_4");
					put(grammarAccess.getConfigBlockAccess().getConfigAssignment_6(), "rule__ConfigBlock__ConfigAssignment_6");
					put(grammarAccess.getCodeAccess().getTypeAssignment_1(), "rule__Code__TypeAssignment_1");
					put(grammarAccess.getCodeAccess().getNameAssignment_2(), "rule__Code__NameAssignment_2");
					put(grammarAccess.getCodeAccess().getCodeAssignment_5(), "rule__Code__CodeAssignment_5");
					put(grammarAccess.getCodeExternalAccess().getTypeAssignment_1(), "rule__CodeExternal__TypeAssignment_1");
					put(grammarAccess.getCodeExternalAccess().getNameAssignment_2(), "rule__CodeExternal__NameAssignment_2");
					put(grammarAccess.getCodeExternalAccess().getClassAssignment_4(), "rule__CodeExternal__ClassAssignment_4");
					put(grammarAccess.getCodeExternalAccess().getMethodAssignment_6(), "rule__CodeExternal__MethodAssignment_6");
					put(grammarAccess.getScriptAccess().getTypeAssignment_1(), "rule__Script__TypeAssignment_1");
					put(grammarAccess.getScriptAccess().getNameAssignment_2(), "rule__Script__NameAssignment_2");
					put(grammarAccess.getScriptAccess().getScriptFileAssignment_4(), "rule__Script__ScriptFileAssignment_4");
					put(grammarAccess.getScriptCommandAccess().getTypeAssignment_1(), "rule__ScriptCommand__TypeAssignment_1");
					put(grammarAccess.getScriptCommandAccess().getNameAssignment_2(), "rule__ScriptCommand__NameAssignment_2");
					put(grammarAccess.getScriptCommandAccess().getScriptCommandAssignment_4(), "rule__ScriptCommand__ScriptCommandAssignment_4");
					put(grammarAccess.getScriptBlockAccess().getTypeAssignment_1(), "rule__ScriptBlock__TypeAssignment_1");
					put(grammarAccess.getScriptBlockAccess().getNameAssignment_2(), "rule__ScriptBlock__NameAssignment_2");
					put(grammarAccess.getScriptBlockAccess().getBlockAssignment_5(), "rule__ScriptBlock__BlockAssignment_5");
					put(grammarAccess.getNodesetAccess().getNameAssignment_1(), "rule__Nodeset__NameAssignment_1");
					put(grammarAccess.getNodesetAccess().getRangeAssignment_3(), "rule__Nodeset__RangeAssignment_3");
					put(grammarAccess.getSetupAccess().getNameAssignment_2(), "rule__Setup__NameAssignment_2");
					put(grammarAccess.getSetupAccess().getProviderAssignment_4(), "rule__Setup__ProviderAssignment_4");
					put(grammarAccess.getSetupAccess().getNumberMachinesAssignment_6(), "rule__Setup__NumberMachinesAssignment_6");
					put(grammarAccess.getSetupAccess().getAutoscaleAssignment_8(), "rule__Setup__AutoscaleAssignment_8");
					put(grammarAccess.getSetupAccess().getPredictiveAssignment_10(), "rule__Setup__PredictiveAssignment_10");
					put(grammarAccess.getDeployAccess().getNameAssignment_1(), "rule__Deploy__NameAssignment_1");
					put(grammarAccess.getDeployAccess().getSetupsAssignment_4(), "rule__Deploy__SetupsAssignment_4");
					put(grammarAccess.getDeployAccess().getTimeoutAssignment_6(), "rule__Deploy__TimeoutAssignment_6");
					put(grammarAccess.getDeployAccess().getExecutionsAssignment_8(), "rule__Deploy__ExecutionsAssignment_8");
					put(grammarAccess.getExecutionAccess().getNameAssignment_1(), "rule__Execution__NameAssignment_1");
					put(grammarAccess.getExecutionAccess().getCodeAssignment_3(), "rule__Execution__CodeAssignment_3");
					put(grammarAccess.getExecutionAccess().getConfigAssignment_4_1(), "rule__Execution__ConfigAssignment_4_1");
					put(grammarAccess.getExecutionAccess().getNodesAssignment_6(), "rule__Execution__NodesAssignment_6");
					put(grammarAccess.getExecutionAccess().getSeqAssignment_8(), "rule__Execution__SeqAssignment_8");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.mines_nantes.atlanmod.giraffe.ui.contentassist.antlr.internal.InternalGiraffeDSLParser typedParser = (fr.mines_nantes.atlanmod.giraffe.ui.contentassist.antlr.internal.InternalGiraffeDSLParser) parser;
			typedParser.entryRuleGiraffeMetaModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GiraffeDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GiraffeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
