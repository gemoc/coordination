/**
 */
package org.gemoc.bcool.model.bcool.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.RelationDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.RelationDeclarationImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationDeclarationImpl extends NamedElementImpl implements RelationDeclaration {
	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formalParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.RELATION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EDataTypeUniqueEList<String>(String.class, this, BcoolPackage.RELATION_DECLARATION__FORMAL_PARAMETERS);
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BcoolPackage.RELATION_DECLARATION__FORMAL_PARAMETERS:
				return getFormalParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BcoolPackage.RELATION_DECLARATION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BcoolPackage.RELATION_DECLARATION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BcoolPackage.RELATION_DECLARATION__FORMAL_PARAMETERS:
				return formalParameters != null && !formalParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (formalParameters: ");
		result.append(formalParameters);
		result.append(')');
		return result.toString();
	}

} //RelationDeclarationImpl
