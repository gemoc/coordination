/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.MatchingRule#getFilterEventExpressions <em>Filter Event Expressions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.MatchingRule#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getMatchingRule()
 * @model
 * @generated
 */
public interface MatchingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Event Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.EventExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Event Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Event Expressions</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getMatchingRule_FilterEventExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventExpression> getFilterEventExpressions();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getMatchingRule_Condition()
	 * @model dataType="org.eclipse.ocl.examples.pivot.String"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.MatchingRule#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // MatchingRule
