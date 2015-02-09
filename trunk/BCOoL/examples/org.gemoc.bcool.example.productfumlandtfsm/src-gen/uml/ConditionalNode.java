package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.StructuredActivityNode;

@SuppressWarnings("all")
public class ConditionalNode extends StructuredActivityNode {
  public EOperation result_no_incoming;
  
  public EOperation no_input_pins;
  
  public EOperation one_clause_with_executable_node;
  
  public EOperation matching_output_pins;
  
  public EOperation executable_nodes;
  
  public EOperation clause_no_predecessor;
  
  public EReference clause;
  
  public EAttribute isAssured;
  
  public EAttribute isDeterminate;
  
  public EReference result;
  
  public EClass StructuredActivityNode;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isLocallyReentrant;
  
  public EAttribute mustIsolate;
  
  public EAttribute isAssured;
  
  public EAttribute isDeterminate;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference activity;
  
  public EReference inGroup;
  
  public EReference inInterruptibleRegion;
  
  public EReference inStructuredNode;
  
  public EReference incoming;
  
  public EReference outgoing;
  
  public EReference redefinedNode;
  
  public EReference inPartition;
  
  public EReference handler;
  
  public EReference context;
  
  public EReference input;
  
  public EReference localPostcondition;
  
  public EReference localPrecondition;
  
  public EReference output;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference ownedMember;
  
  public EReference importedMember;
  
  public EReference member;
  
  public EReference containedEdge;
  
  public EReference containedNode;
  
  public EReference inActivity;
  
  public EReference subgroup;
  
  public EReference superGroup;
  
  public EReference edge;
  
  public EReference structuredNodeInput;
  
  public EReference structuredNodeOutput;
  
  public EReference variable;
  
  public EReference node;
  
  public EReference clause;
  
  public EReference result;
  
  public EReference clause;
  
  public EReference result;
  
  public EAttribute isAssured;
  
  public EAttribute isDeterminate;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference handler;
  
  public EReference localPostcondition;
  
  public EReference localPrecondition;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference edge;
  
  public EReference structuredNodeInput;
  
  public EReference structuredNodeOutput;
  
  public EReference variable;
  
  public EReference node;
  
  public EReference clause;
  
  public EReference result;
  
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
  
  public EOperation redefinition_consistent;
  
  public EOperation non_leaf_redefinition;
  
  public EOperation redefinition_context_valid;
  
  public EOperation isConsistentWith;
  
  public EOperation isRedefinitionContextValid;
  
  public EOperation containingActivity;
  
  public EOperation getContext;
  
  public EOperation allActions;
  
  public EOperation allOwnedNodes;
  
  public EOperation containingBehavior;
  
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
  
  public EOperation nodes_and_edges;
  
  public EOperation not_contained;
  
  public EOperation output_pin_edges;
  
  public EOperation edges;
  
  public EOperation input_pin_edges;
  
  public EOperation sourceNodes;
  
  public EOperation targetNodes;
  
  public EOperation result_no_incoming;
  
  public EOperation no_input_pins;
  
  public EOperation one_clause_with_executable_node;
  
  public EOperation matching_output_pins;
  
  public EOperation executable_nodes;
  
  public EOperation clause_no_predecessor;
  
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
  
  public EAttribute isLeaf;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference activity;
  
  public EReference inGroup;
  
  public EReference inInterruptibleRegion;
  
  public EReference inStructuredNode;
  
  public EReference incoming;
  
  public EReference outgoing;
  
  public EReference redefinedNode;
  
  public EReference inPartition;
  
  public EReference handler;
  
  public EReference context;
  
  public EReference input;
  
  public EAttribute isLocallyReentrant;
  
  public EReference localPostcondition;
  
  public EReference localPrecondition;
  
  public EReference output;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference ownedMember;
  
  public EReference importedMember;
  
  public EReference member;
  
  public EReference containedEdge;
  
  public EReference containedNode;
  
  public EReference inActivity;
  
  public EReference subgroup;
  
  public EReference superGroup;
  
  public EReference edge;
  
  public EAttribute mustIsolate;
  
  public EReference structuredNodeInput;
  
  public EReference structuredNodeOutput;
  
  public EReference variable;
  
  public EReference node;
  
  public EReference clause;
  
  public EAttribute isAssured;
  
  public EAttribute isDeterminate;
  
  public EReference result;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass RedefinableElement;
  
  public EClass ActivityContent;
  
  public EClass ActivityNode;
  
  public EClass ExecutableNode;
  
  public EClass Action;
  
  public EClass Namespace;
  
  public EClass ActivityGroup;
  
  public EClass StructuredActivityNode;
  
  public EDataType result_no_incoming();
  
  public EDataType no_input_pins();
  
  public EDataType one_clause_with_executable_node();
  
  public EDataType matching_output_pins();
  
  public EDataType executable_nodes();
  
  public EDataType clause_no_predecessor();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
