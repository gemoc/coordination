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
package org.eclipse.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCool Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.BCoolOperator#getBcoolCompositionRules <em>Bcool Composition Rules</em>}</li>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.BCoolOperator#getGlobalEventExpressions <em>Global Event Expressions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.BCoolOperator#getGlobalDSEs <em>Global DS Es</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator()
 * @model
 * @generated
 */
public interface BCoolOperator extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bcool Composition Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcool Composition Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcool Composition Rules</em>' containment reference list.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator_BcoolCompositionRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<BCoolCompositionRule> getBcoolCompositionRules();

	/**
	 * Returns the value of the '<em><b>Global Event Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.bcool.model.bcool.EventExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Event Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Event Expressions</em>' containment reference list.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator_GlobalEventExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventExpression> getGlobalEventExpressions();

	/**
	 * Returns the value of the '<em><b>Global DS Es</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global DS Es</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global DS Es</em>' containment reference list.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getBCoolOperator_GlobalDSEs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefPropertyCS> getGlobalDSEs();

} // BCoolOperator
