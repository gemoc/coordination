/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.ExpressionDeclaration#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getExpressionDeclaration()
 * @model
 * @generated
 */
public interface ExpressionDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' attribute list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getExpressionDeclaration_FormalParameters()
	 * @model
	 * @generated
	 */
	EList<String> getFormalParameters();

} // ExpressionDeclaration
