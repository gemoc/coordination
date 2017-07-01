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
import org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;
import org.eclipse.gemoc.bcool.model.bcool.BcoolPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BCoolLibraryItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolLibraryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS);
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_LIBRARY__RELATION_DEFINITIONS);
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_LIBRARY__RELATION_DECLARATIONS);
			childrenFeatures.add(BcoolPackage.Literals.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS);
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
	 * This returns BCoolLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BCoolLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BCoolLibrary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BCoolLibrary_type") :
			getString("_UI_BCoolLibrary_type") + " " + label;
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

		switch (notification.getFeatureID(BCoolLibrary.class)) {
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS:
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS:
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS:
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS:
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
				(BcoolPackage.Literals.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS,
				 BcoolFactory.eINSTANCE.createExpressionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.BCOOL_LIBRARY__RELATION_DEFINITIONS,
				 BcoolFactory.eINSTANCE.createRelationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.BCOOL_LIBRARY__RELATION_DECLARATIONS,
				 BcoolFactory.eINSTANCE.createRelationDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS,
				 BcoolFactory.eINSTANCE.createExpressionDeclaration()));
	}

}
