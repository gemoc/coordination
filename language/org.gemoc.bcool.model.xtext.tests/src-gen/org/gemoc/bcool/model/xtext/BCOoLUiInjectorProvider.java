/*
* generated by Xtext
*/
package org.gemoc.bcool.model.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BCOoLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.gemoc.bcool.model.xtext.ui.internal.BCOoLActivator.getInstance().getInjector("org.gemoc.bcool.model.xtext.BCOoL");
	}
	
}
