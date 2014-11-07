/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.EventRelation#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.EventRelation#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getEventRelation()
 * @model
 * @generated
 */
public interface EventRelation extends NamedElement {
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
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getEventRelation_ActualParameters()
	 * @model
	 * @generated
	 */
	EList<String> getActualParameters();

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(RelationDeclaration)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getEventRelation_Declaration()
	 * @model required="true"
	 * @generated
	 */
	RelationDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.EventRelation#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(RelationDeclaration value);

} // EventRelation
