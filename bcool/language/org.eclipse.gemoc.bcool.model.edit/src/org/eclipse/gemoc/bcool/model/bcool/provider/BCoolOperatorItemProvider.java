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
package org.eclipse.gemoc.bcool.model.bcool.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gemoc.bcool.model.bcool.BCoolOperator;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;
import org.eclipse.gemoc.bcool.model.bcool.BcoolPackage;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.gemoc.bcool.model.bcool.BCoolOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BCoolOperatorItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolOperatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES);
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS);
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_OPERATOR__GLOBAL_DS_ES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BCoolOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BCoolOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BCoolOperator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BCoolOperator_type") :
			getString("_UI_BCoolOperator_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BCoolOperator.class)) {
			case BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES:
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS:
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES,
				 BcoolFactory.eINSTANCE.createBCoolCompositionRule()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS,
				 BcoolFactory.eINSTANCE.createEventExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.BCOOL_OPERATOR__GLOBAL_DS_ES,
				 CompleteOCLCSFactory.eINSTANCE.createDefPropertyCS()));
	}

}
