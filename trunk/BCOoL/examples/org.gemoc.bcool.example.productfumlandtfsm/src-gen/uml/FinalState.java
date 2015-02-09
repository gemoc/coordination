package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.State;

@SuppressWarnings("all")
public class FinalState extends State {
  public EOperation no_exit_behavior;
  
  public EOperation no_outgoing_transitions;
  
  public EOperation no_regions;
  
  public EOperation cannot_reference_submachine;
  
  public EOperation no_entry_behavior;
  
  public EOperation no_state_behavior;
  
  public EClass State;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isComposite;
  
  public EAttribute isOrthogonal;
  
  public EAttribute isSimple;
  
  public EAttribute isSubmachineState;
  
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
  
  public EReference container;
  
  public EReference incoming;
  
  public EReference outgoing;
  
  public EReference connection;
  
  public EReference connectionPoint;
  
  public EReference deferrableTrigger;
  
  public EReference doActivity;
  
  public EReference entry;
  
  public EReference exit;
  
  public EReference redefinedState;
  
  public EReference stateInvariant;
  
  public EReference submachine;
  
  public EReference region;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference connection;
  
  public EReference connectionPoint;
  
  public EReference deferrableTrigger;
  
  public EReference doActivity;
  
  public EReference entry;
  
  public EReference exit;
  
  public EReference region;
  
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
  
  public EOperation containingStateMachine;
  
  public EOperation getIncomings;
  
  public EOperation getOutgoings;
  
  public EOperation isContainedInState;
  
  public EOperation isContainedInRegion;
  
  public EOperation entry_or_exit;
  
  public EOperation submachine_states;
  
  public EOperation composite_states;
  
  public EOperation destinations_or_sources_of_transitions;
  
  public EOperation submachine_or_regions;
  
  public EOperation isComposite;
  
  public EOperation isOrthogonal;
  
  public EOperation isSimple;
  
  public EOperation isSubmachineState;
  
  public EOperation redefinitionContext;
  
  public EOperation no_exit_behavior;
  
  public EOperation no_outgoing_transitions;
  
  public EOperation no_regions;
  
  public EOperation cannot_reference_submachine;
  
  public EOperation no_entry_behavior;
  
  public EOperation no_state_behavior;
  
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
  
  public EReference container;
  
  public EReference incoming;
  
  public EReference outgoing;
  
  public EReference connection;
  
  public EReference connectionPoint;
  
  public EReference deferrableTrigger;
  
  public EReference doActivity;
  
  public EReference entry;
  
  public EReference exit;
  
  public EAttribute isComposite;
  
  public EAttribute isOrthogonal;
  
  public EAttribute isSimple;
  
  public EAttribute isSubmachineState;
  
  public EReference redefinedState;
  
  public EReference stateInvariant;
  
  public EReference submachine;
  
  public EReference region;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass Namespace;
  
  public EClass RedefinableElement;
  
  public EClass Vertex;
  
  public EClass State;
  
  public EDataType no_exit_behavior();
  
  public EDataType no_outgoing_transitions();
  
  public EDataType no_regions();
  
  public EDataType cannot_reference_submachine();
  
  public EDataType no_entry_behavior();
  
  public EDataType no_state_behavior();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
