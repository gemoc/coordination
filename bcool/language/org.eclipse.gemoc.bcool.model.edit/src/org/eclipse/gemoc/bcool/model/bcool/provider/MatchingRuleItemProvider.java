/**
 */
package org.eclipse.gemoc.bcool.model.bcool.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;
import org.eclipse.gemoc.bcool.model.bcool.BcoolPackage;
import org.eclipse.gemoc.bcool.model.bcool.MatchingRule;

/**
 * This is the item provider adapter for a {@link org.eclipse.gemoc.bcool.model.bcool.MatchingRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchingRuleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingRuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BcoolPackage.Literals.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS);
			childrenFeatures.add(BcoolPackage.Literals.MATCHING_RULE__CONDITION);
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
	 * This returns MatchingRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MatchingRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MatchingRule_type");
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

		switch (notification.getFeatureID(MatchingRule.class)) {
			case BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS:
			case BcoolPackage.MATCHING_RULE__CONDITION:
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
				(BcoolPackage.Literals.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS,
				 BcoolFactory.eINSTANCE.createEventExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGNavigationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGIntegerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGDoubleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGBraceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGEnumLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGXorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGAdditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGMultiplicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BcoolPackage.Literals.MATCHING_RULE__CONDITION,
				 org.eclipse.gemoc.gexpressions.GexpressionsFactory.eINSTANCE.createGNegationExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BcoolEditPlugin.INSTANCE;
	}

}
