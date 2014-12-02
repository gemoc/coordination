/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.EventExpression#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.EventExpression#getActualParameters <em>Actual Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getEventExpression()
 * @model
 * @generated
 */
public interface EventExpression extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(ExpressionDeclaration)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getEventExpression_Declaration()
	 * @model required="true"
	 * @generated
	 */
	ExpressionDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.EventExpression#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(ExpressionDeclaration value);

	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' attribute list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getEventExpression_ActualParameters()
	 * @model
	 * @generated
	 */
	EList<String> getActualParameters();

} // EventExpression
