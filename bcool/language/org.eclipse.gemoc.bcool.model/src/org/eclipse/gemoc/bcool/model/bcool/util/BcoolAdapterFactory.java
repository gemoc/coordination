/**
 */
package org.eclipse.gemoc.bcool.model.bcool.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary;
import org.eclipse.gemoc.bcool.model.bcool.BCoolOperator;
import org.eclipse.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.eclipse.gemoc.bcool.model.bcool.BCoolSpecification;
import org.eclipse.gemoc.bcool.model.bcool.BcoolPackage;
import org.eclipse.gemoc.bcool.model.bcool.CoordinationRule;
import org.eclipse.gemoc.bcool.model.bcool.EventExpression;
import org.eclipse.gemoc.bcool.model.bcool.EventRelation;
import org.eclipse.gemoc.bcool.model.bcool.ExpressionDeclaration;
import org.eclipse.gemoc.bcool.model.bcool.ExpressionDefinition;
import org.eclipse.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.eclipse.gemoc.bcool.model.bcool.ImportLibStatement;
import org.eclipse.gemoc.bcool.model.bcool.MatchingRule;
import org.eclipse.gemoc.bcool.model.bcool.NamedElement;
import org.eclipse.gemoc.bcool.model.bcool.RelationDeclaration;
import org.eclipse.gemoc.bcool.model.bcool.RelationDefinition;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.bcool.model.bcool.BcoolPackage
 * @generated
 */
public class BcoolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BcoolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BcoolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BcoolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BcoolSwitch<Adapter> modelSwitch =
		new BcoolSwitch<Adapter>() {
			@Override
			public Adapter caseBCoolOperator(BCoolOperator object) {
				return createBCoolOperatorAdapter();
			}
			@Override
			public Adapter caseBCoolCompositionRule(BCoolCompositionRule object) {
				return createBCoolCompositionRuleAdapter();
			}
			@Override
			public Adapter caseBCoolSpecification(BCoolSpecification object) {
				return createBCoolSpecificationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseImportLibStatement(ImportLibStatement object) {
				return createImportLibStatementAdapter();
			}
			@Override
			public Adapter caseMatchingRule(MatchingRule object) {
				return createMatchingRuleAdapter();
			}
			@Override
			public Adapter caseCoordinationRule(CoordinationRule object) {
				return createCoordinationRuleAdapter();
			}
			@Override
			public Adapter caseEventExpression(EventExpression object) {
				return createEventExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionDefinition(ExpressionDefinition object) {
				return createExpressionDefinitionAdapter();
			}
			@Override
			public Adapter caseEventRelation(EventRelation object) {
				return createEventRelationAdapter();
			}
			@Override
			public Adapter caseRelationDefinition(RelationDefinition object) {
				return createRelationDefinitionAdapter();
			}
			@Override
			public Adapter caseBCoolLibrary(BCoolLibrary object) {
				return createBCoolLibraryAdapter();
			}
			@Override
			public Adapter caseImportInterfaceStatement(ImportInterfaceStatement object) {
				return createImportInterfaceStatementAdapter();
			}
			@Override
			public Adapter caseExpressionDeclaration(ExpressionDeclaration object) {
				return createExpressionDeclarationAdapter();
			}
			@Override
			public Adapter caseRelationDeclaration(RelationDeclaration object) {
				return createRelationDeclarationAdapter();
			}
			@Override
			public Adapter caseBCoolOperatorArg(BCoolOperatorArg object) {
				return createBCoolOperatorArgAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.BCoolOperator <em>BCool Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BCoolOperator
	 * @generated
	 */
	public Adapter createBCoolOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule <em>BCool Composition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule
	 * @generated
	 */
	public Adapter createBCoolCompositionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.BCoolSpecification <em>BCool Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BCoolSpecification
	 * @generated
	 */
	public Adapter createBCoolSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.ImportLibStatement <em>Import Lib Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.ImportLibStatement
	 * @generated
	 */
	public Adapter createImportLibStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.MatchingRule <em>Matching Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.MatchingRule
	 * @generated
	 */
	public Adapter createMatchingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.CoordinationRule <em>Coordination Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.CoordinationRule
	 * @generated
	 */
	public Adapter createCoordinationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.EventExpression <em>Event Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.EventExpression
	 * @generated
	 */
	public Adapter createEventExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.ExpressionDefinition <em>Expression Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.ExpressionDefinition
	 * @generated
	 */
	public Adapter createExpressionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.EventRelation <em>Event Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.EventRelation
	 * @generated
	 */
	public Adapter createEventRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.RelationDefinition <em>Relation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.RelationDefinition
	 * @generated
	 */
	public Adapter createRelationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary <em>BCool Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary
	 * @generated
	 */
	public Adapter createBCoolLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.ImportInterfaceStatement <em>Import Interface Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.ImportInterfaceStatement
	 * @generated
	 */
	public Adapter createImportInterfaceStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.ExpressionDeclaration <em>Expression Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.ExpressionDeclaration
	 * @generated
	 */
	public Adapter createExpressionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.RelationDeclaration <em>Relation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.RelationDeclaration
	 * @generated
	 */
	public Adapter createRelationDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.bcool.model.bcool.BCoolOperatorArg <em>BCool Operator Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.bcool.model.bcool.BCoolOperatorArg
	 * @generated
	 */
	public Adapter createBCoolOperatorArgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BcoolAdapterFactory