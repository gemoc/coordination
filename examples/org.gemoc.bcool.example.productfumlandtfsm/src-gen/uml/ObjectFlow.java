package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.ActivityEdge;

@SuppressWarnings("all")
public class ObjectFlow extends ActivityEdge {
  public EOperation input_and_output_parameter;
  
  public EOperation no_executable_nodes;
  
  public EOperation transformation_behavior;
  
  public EOperation selection_behavior;
  
  public EOperation compatible_types;
  
  public EOperation same_upper_bounds;
  
  public EOperation target;
  
  public EOperation is_multicast_or_is_multireceive;
  
  public EAttribute isMulticast;
  
  public EAttribute isMultireceive;
  
  public EReference selection;
  
  public EReference transformation;
  
  public EClass ActivityEdge;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isMulticast;
  
  public EAttribute isMultireceive;
  
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
  
  public EReference guard;
  
  public EReference inPartition;
  
  public EReference interrupts;
  
  public EReference inStructuredNode;
  
  public EReference target;
  
  public EReference source;
  
  public EReference redefinedEdge;
  
  public EReference weight;
  
  public EReference inGroup;
  
  public EReference selection;
  
  public EReference transformation;
  
  public EReference selection;
  
  public EReference transformation;
  
  public EAttribute isMulticast;
  
  public EAttribute isMultireceive;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference guard;
  
  public EReference weight;
  
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
  
  public EOperation source_and_target;
  
  public EOperation input_and_output_parameter;
  
  public EOperation no_executable_nodes;
  
  public EOperation transformation_behavior;
  
  public EOperation selection_behavior;
  
  public EOperation compatible_types;
  
  public EOperation same_upper_bounds;
  
  public EOperation target;
  
  public EOperation is_multicast_or_is_multireceive;
  
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
  
  public EReference guard;
  
  public EReference inPartition;
  
  public EReference interrupts;
  
  public EReference inStructuredNode;
  
  public EReference target;
  
  public EReference source;
  
  public EReference redefinedEdge;
  
  public EReference weight;
  
  public EReference inGroup;
  
  public EAttribute isMulticast;
  
  public EAttribute isMultireceive;
  
  public EReference selection;
  
  public EReference transformation;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass RedefinableElement;
  
  public EClass ActivityEdge;
  
  public EDataType input_and_output_parameter();
  
  public EDataType no_executable_nodes();
  
  public EDataType transformation_behavior();
  
  public EDataType selection_behavior();
  
  public EDataType compatible_types();
  
  public EDataType same_upper_bounds();
  
  public EDataType target();
  
  public EDataType is_multicast_or_is_multireceive();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
