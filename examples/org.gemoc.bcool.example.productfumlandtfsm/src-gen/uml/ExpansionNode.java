package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.ObjectNode;

@SuppressWarnings("all")
public class ExpansionNode extends ObjectNode {
  public EOperation region_as_input_or_output;
  
  public EReference regionAsInput;
  
  public EReference regionAsOutput;
  
  public EClass ObjectNode;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isControlType;
  
  public EAttribute ordering;
  
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
  
  public EReference type;
  
  public EReference inState;
  
  public EReference selection;
  
  public EReference upperBound;
  
  public EReference regionAsInput;
  
  public EReference regionAsOutput;
  
  public EReference regionAsInput;
  
  public EReference regionAsOutput;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference upperBound;
  
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
  
  public EOperation input_output_parameter;
  
  public EOperation selection_behavior;
  
  public EOperation object_flow_edges;
  
  public EOperation region_as_input_or_output;
  
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
  
  public EReference type;
  
  public EReference inState;
  
  public EAttribute isControlType;
  
  public EAttribute ordering;
  
  public EReference selection;
  
  public EReference upperBound;
  
  public EReference regionAsInput;
  
  public EReference regionAsOutput;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass RedefinableElement;
  
  public EClass ActivityContent;
  
  public EClass ActivityNode;
  
  public EClass TypedElement;
  
  public EClass ObjectNode;
  
  public EDataType region_as_input_or_output();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}