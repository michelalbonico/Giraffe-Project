/*
 * generated by Xtext
 */
package fr.mines_nantes.atlanmod.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.mines_nantes.atlanmod.dsl.ui.internal.GiraffeDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GiraffeDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GiraffeDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GiraffeDSLActivator.getInstance().getInjector(GiraffeDSLActivator.FR_MINES_NANTES_ATLANMOD_DSL_GIRAFFEDSL);
	}
	
}
