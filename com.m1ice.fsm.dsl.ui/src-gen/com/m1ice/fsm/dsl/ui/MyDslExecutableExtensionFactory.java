/*
 * generated by Xtext 2.14.0
 */
package com.m1ice.fsm.dsl.ui;

import com.google.inject.Injector;
import com.m1ice.fsm.dsl.ui.internal.DslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DslActivator activator = DslActivator.getInstance();
		return activator != null ? activator.getInjector(DslActivator.COM_M1ICE_FSM_DSL_MYDSL) : null;
	}

}
