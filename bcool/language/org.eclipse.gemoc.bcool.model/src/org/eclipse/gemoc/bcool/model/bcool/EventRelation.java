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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.EventRelation#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.EventRelation#getActualParameters <em>Actual Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getEventRelation()
 * @model
 * @generated
 */
public interface EventRelation extends NamedElement {
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
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getEventRelation_Declaration()
	 * @model required="true"
	 * @generated
	 */
	RelationDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.bcool.model.bcool.EventRelation#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(RelationDeclaration value);

	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' reference list.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getEventRelation_ActualParameters()
	 * @model
	 * @generated
	 */
	EList<EObject> getActualParameters();

} // EventRelation
