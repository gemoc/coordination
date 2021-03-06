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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bflow.bFlow.Flows#getOper <em>Oper</em>}</li>
 *   <li>{@link org.eclipse.gemoc.bflow.bFlow.Flows#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.gemoc.bflow.bFlow.Flows#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bflow.bFlow.BFlowPackage#getFlows()
 * @model
 * @generated
 */
public interface Flows extends EObject
{
	/**
	 * Returns the value of the '<em><b>Oper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oper</em>' attribute.
	 * @see #setOper(String)
	 * @see org.eclipse.gemoc.bflow.bFlow.BFlowPackage#getFlows_Oper()
	 * @model
	 * @generated
	 */
	String getOper();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.bflow.bFlow.Flows#getOper <em>Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oper</em>' attribute.
	 * @see #getOper()
	 * @generated
	 */
	void setOper(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.bflow.bFlow.modelinput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see org.eclipse.gemoc.bflow.bFlow.BFlowPackage#getFlows_Params()
	 * @model
	 * @generated
	 */
	EList<modelinput> getParams();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(BCoolCompositionRule)
	 * @see org.eclipse.gemoc.bflow.bFlow.BFlowPackage#getFlows_Operator()
	 * @model required="true"
	 * @generated
	 */
	BCoolCompositionRule getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.bflow.bFlow.Flows#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BCoolCompositionRule value);

} // Flows
