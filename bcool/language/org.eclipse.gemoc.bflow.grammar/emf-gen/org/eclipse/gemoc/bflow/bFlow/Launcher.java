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
/**
 */
package org.eclipse.gemoc.bflow.bFlow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bflow.bFlow.Launcher#getLauncherURI <em>Launcher URI</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bflow.bFlow.BFlowPackage#getLauncher()
 * @model
 * @generated
 */
public interface Launcher extends EObject
{
	/**
	 * Returns the value of the '<em><b>Launcher URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launcher URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher URI</em>' attribute.
	 * @see #setLauncherURI(String)
	 * @see org.eclipse.gemoc.bflow.bFlow.BFlowPackage#getLauncher_LauncherURI()
	 * @model
	 * @generated
	 */
	String getLauncherURI();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.bflow.bFlow.Launcher#getLauncherURI <em>Launcher URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher URI</em>' attribute.
	 * @see #getLauncherURI()
	 * @generated
	 */
	void setLauncherURI(String value);

} // Launcher
