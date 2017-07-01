/**
 */
package org.eclipse.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.RelationDeclaration#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getRelationDeclaration()
 * @model
 * @generated
 */
public interface RelationDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' reference list.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getRelationDeclaration_FormalParameters()
	 * @model
	 * @generated
	 */
	EList<EObject> getFormalParameters();

} // RelationDeclaration
