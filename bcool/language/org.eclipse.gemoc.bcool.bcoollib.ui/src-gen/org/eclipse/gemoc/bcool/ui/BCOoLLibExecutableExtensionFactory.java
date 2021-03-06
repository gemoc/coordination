/*******************************************************************************
 * Copyright (c) 2015, 2017  I3S Laboratory  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.eclipse.gemoc.bcool.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.gemoc.bcool.ui.internal.BCOoLLibActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BCOoLLibExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BCOoLLibActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BCOoLLibActivator.getInstance().getInjector(BCOoLLibActivator.ORG_ECLIPSE_GEMOC_BCOOL_BCOOLLIB);
	}
	
}
