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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.bcool.model.bcool.RelationDefinition#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getRelationDefinition()
 * @model
 * @generated
 */
public interface RelationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(RelationDeclaration)
	 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage#getRelationDefinition_Definition()
	 * @model required="true"
	 * @generated
	 */
	RelationDeclaration getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.bcool.model.bcool.RelationDefinition#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(RelationDeclaration value);

} // RelationDefinition
