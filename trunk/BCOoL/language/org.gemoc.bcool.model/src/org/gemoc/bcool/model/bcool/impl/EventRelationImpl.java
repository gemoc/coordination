/**
 */
package org.gemoc.bcool.model.bcool.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.EventRelation;
import org.gemoc.bcool.model.bcool.RelationDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.EventRelationImpl#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.EventRelationImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventRelationImpl extends NamedElementImpl implements EventRelation {
	/**
	 * The cached value of the '{@link #getActualParameters() <em>Actual Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actualParameters;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected RelationDeclaration declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.EVENT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActualParameters() {
		if (actualParameters == null) {
			actualParameters = new EDataTypeUniqueEList<String>(String.class, this, BcoolPackage.EVENT_RELATION__ACTUAL_PARAMETERS);
		}
		return actualParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (RelationDeclaration)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BcoolPackage.EVENT_RELATION__DECLARATION, oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(RelationDeclaration newDeclaration) {
		RelationDeclaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.EVENT_RELATION__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BcoolPackage.EVENT_RELATION__ACTUAL_PARAMETERS:
				return getActualParameters();
			case BcoolPackage.EVENT_RELATION__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
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
			case BcoolPackage.EVENT_RELATION__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				getActualParameters().addAll((Collection<? extends String>)newValue);
				return;
			case BcoolPackage.EVENT_RELATION__DECLARATION:
				setDeclaration((RelationDeclaration)newValue);
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
			case BcoolPackage.EVENT_RELATION__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				return;
			case BcoolPackage.EVENT_RELATION__DECLARATION:
				setDeclaration((RelationDeclaration)null);
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
			case BcoolPackage.EVENT_RELATION__ACTUAL_PARAMETERS:
				return actualParameters != null && !actualParameters.isEmpty();
			case BcoolPackage.EVENT_RELATION__DECLARATION:
				return declaration != null;
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
		result.append(" (actualParameters: ");
		result.append(actualParameters);
		result.append(')');
		return result.toString();
	}

} //EventRelationImpl
