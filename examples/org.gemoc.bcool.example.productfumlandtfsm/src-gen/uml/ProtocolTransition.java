package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.Operation;
import uml.Transition;

@SuppressWarnings("all")
public class ProtocolTransition extends Transition {
  public EOperation refers_to_operation;
  
  public EOperation associated_actions;
  
  public EOperation belongs_to_psm;
  
  public EOperation getReferreds;
  
  public EReference postCondition;
  
  public EReference preCondition;
  
  public EReference referred;
  
  public EClass Transition;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute kind;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference ownedMember;
  
  public EReference importedMember;
  
  public EReference member;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference effect;
  
  public EReference guard;
  
  public EReference redefinedTransition;
  
  public EReference source;
  
  public EReference target;
  
  public EReference trigger;
  
  public EReference container;
  
  public EReference postCondition;
  
  public EReference preCondition;
  
  public EReference referred;
  
  public EReference postCondition;
  
  public EReference preCondition;
  
  public EReference referred;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference effect;
  
  public EReference trigger;
  
  public EOperation getEAnnotation;
  
  public EOperation has_owner;
  
  public EOperation not_own_self;
  
  public EOperation addKeyword;
  
  public EOperation applyStereotype;
  
  public EOperation createEAnnotation;
  
  public EOperation destroy;
  
  public EOperation getKeywords;
  
  public EOperation getApplicableStereotype;
  
  public EOperation getApplicableStereotypes;
  
  public EOperation getAppliedStereotype;
  
  public EOperation getAppliedStereotypes;
  
  public EOperation getAppliedSubstereotype;
  
  public EOperation getAppliedSubstereotypes;
  
  public EOperation getModel;
  
  public EOperation getNearestPackage;
  
  public EOperation getRelationships;
  
  public EOperation getRelationships;
  
  public EOperation getRequiredStereotype;
  
  public EOperation getRequiredStereotypes;
  
  public EOperation getSourceDirectedRelationships;
  
  public EOperation getSourceDirectedRelationships;
  
  public EOperation getStereotypeApplication;
  
  public EOperation getStereotypeApplications;
  
  public EOperation getTargetDirectedRelationships;
  
  public EOperation getTargetDirectedRelationships;
  
  public EOperation getValue;
  
  public EOperation hasKeyword;
  
  public EOperation hasValue;
  
  public EOperation isStereotypeApplicable;
  
  public EOperation isStereotypeApplied;
  
  public EOperation isStereotypeRequired;
  
  public EOperation removeKeyword;
  
  public EOperation setValue;
  
  public EOperation unapplyStereotype;
  
  public EOperation allOwnedElements;
  
  public EOperation mustBeOwned;
  
  public EOperation visibility_needs_ownership;
  
  public EOperation has_qualified_name;
  
  public EOperation has_no_qualified_name;
  
  public EOperation createDependency;
  
  public EOperation createUsage;
  
  public EOperation getLabel;
  
  public EOperation getLabel;
  
  public EOperation getNamespace;
  
  public EOperation allNamespaces;
  
  public EOperation allOwningPackages;
  
  public EOperation isDistinguishableFrom;
  
  public EOperation getQualifiedName;
  
  public EOperation separator;
  
  public EOperation getClientDependencies;
  
  public EOperation members_distinguishable;
  
  public EOperation cannot_import_self;
  
  public EOperation cannot_import_ownedMembers;
  
  public EOperation createElementImport;
  
  public EOperation createPackageImport;
  
  public EOperation getImportedElements;
  
  public EOperation getImportedPackages;
  
  public EOperation getOwnedMembers;
  
  public EOperation excludeCollisions;
  
  public EOperation getNamesOfMember;
  
  public EOperation importMembers;
  
  public EOperation getImportedMembers;
  
  public EOperation membersAreDistinguishable;
  
  public EOperation redefinition_consistent;
  
  public EOperation non_leaf_redefinition;
  
  public EOperation redefinition_context_valid;
  
  public EOperation isConsistentWith;
  
  public EOperation isRedefinitionContextValid;
  
  public EOperation state_is_external;
  
  public EOperation join_segment_guards;
  
  public EOperation state_is_internal;
  
  public EOperation outgoing_pseudostates;
  
  public EOperation join_segment_state;
  
  public EOperation fork_segment_state;
  
  public EOperation state_is_local;
  
  public EOperation initial_transition;
  
  public EOperation fork_segment_guards;
  
  public EOperation containingStateMachine;
  
  public EOperation redefinitionContext;
  
  public EOperation refers_to_operation;
  
  public EOperation associated_actions;
  
  public EOperation belongs_to_psm;
  
  public EOperation getReferreds;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EAttribute name;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference ownedMember;
  
  public EReference importedMember;
  
  public EReference member;
  
  public EAttribute isLeaf;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference effect;
  
  public EReference guard;
  
  public EAttribute kind;
  
  public EReference redefinedTransition;
  
  public EReference source;
  
  public EReference target;
  
  public EReference trigger;
  
  public EReference container;
  
  public EReference postCondition;
  
  public EReference preCondition;
  
  public EReference referred;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass Namespace;
  
  public EClass RedefinableElement;
  
  public EClass Transition;
  
  public EDataType refers_to_operation();
  
  public EDataType associated_actions();
  
  public EDataType belongs_to_psm();
  
  public Operation getReferreds();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
