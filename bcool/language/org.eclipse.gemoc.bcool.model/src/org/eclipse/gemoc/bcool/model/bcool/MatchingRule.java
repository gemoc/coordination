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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.MatchingRule#getFilterEventExpressions <em>Filter Event Expressions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.MatchingRule#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getMatchingRule()
 * @model
 * @generated
 */
public interface MatchingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Event Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.bcool.model.bcool.EventExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Event Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Event Expressions</em>' containment reference list.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getMatchingRule_FilterEventExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventExpression> getFilterEventExpressions();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(GExpression)
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getMatchingRule_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.bcool.model.bcool.MatchingRule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(GExpression value);

} // MatchingRule
