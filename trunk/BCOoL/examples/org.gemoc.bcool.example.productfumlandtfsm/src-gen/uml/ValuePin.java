package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.InputPin;

@SuppressWarnings("all")
public class ValuePin extends InputPin {
  public EOperation no_incoming_edges;
  
  public EOperation compatible_type;
  
  public EReference value;
  
  public EClass InputPin;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isControlType;
  
  public EAttribute ordering;
  
  public EAttribute isOrdered;
  
  public EAttribute isUnique;
  
  public EAttribute lower;
  
  public EAttribute upper;
  
  public EAttribute isControl;
  
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
  
  public EReference lowerValue;
  
  public EReference upperValue;
  
  public EReference value;
  
  public EReference value;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference upperBound;
  
  public EReference lowerValue;
  
  public EReference upperValue;
  
  public EReference value;
  
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
  
  public EOperation upper_ge_lower;
  
  public EOperation lower_ge_0;
  
  public EOperation value_specification_no_side_effects;
  
  public EOperation value_specification_constant;
  
  public EOperation lower_is_integer;
  
  public EOperation upper_is_unlimitedNatural;
  
  public EOperation setLower;
  
  public EOperation setUpper;
  
  public EOperation compatibleWith;
  
  public EOperation includesMultiplicity;
  
  public EOperation is;
  
  public EOperation isMultivalued;
  
  public EOperation getLower;
  
  public EOperation lowerBound;
  
  public EOperation getUpper;
  
  public EOperation upperBound;
  
  public EOperation control_pins;
  
  public EOperation not_unique;
  
  public EOperation outgoing_edges_structured_only;
  
  public EOperation no_incoming_edges;
  
  public EOperation compatible_type;
  
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
  
  public EAttribute isOrdered;
  
  public EAttribute isUnique;
  
  public EAttribute lower;
  
  public EReference lowerValue;
  
  public EAttribute upper;
  
  public EReference upperValue;
  
  public EAttribute isControl;
  
  public EReference value;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass RedefinableElement;
  
  public EClass ActivityContent;
  
  public EClass ActivityNode;
  
  public EClass TypedElement;
  
  public EClass ObjectNode;
  
  public EClass MultiplicityElement;
  
  public EClass Pin;
  
  public EClass InputPin;
  
  public EDataType no_incoming_edges();
  
  public EDataType compatible_type();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
