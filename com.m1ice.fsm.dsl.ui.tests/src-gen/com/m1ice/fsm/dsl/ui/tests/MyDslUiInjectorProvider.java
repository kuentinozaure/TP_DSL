/*
 * generated by Xtext 2.14.0
 */
package com.m1ice.fsm.dsl.ui.tests;

import com.google.inject.Injector;
import com.m1ice.fsm.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("com.m1ice.fsm.dsl.MyDsl");
	}

}
