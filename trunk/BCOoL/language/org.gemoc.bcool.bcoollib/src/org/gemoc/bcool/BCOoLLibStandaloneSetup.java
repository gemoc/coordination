/*
* generated by Xtext
*/
package org.gemoc.bcool;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BCOoLLibStandaloneSetup extends BCOoLLibStandaloneSetupGenerated{

	public static void doSetup() {
		new BCOoLLibStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
