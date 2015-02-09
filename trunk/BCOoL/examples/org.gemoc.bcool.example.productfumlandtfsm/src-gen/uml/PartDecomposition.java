package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.InteractionUse;

@SuppressWarnings("all")
public class PartDecomposition extends InteractionUse {
  public EOperation commutativity_of_decomposition;
  
  public EOperation assume;
  
  public EOperation parts_of_internal_structures;
  
  public EClass InteractionUse;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EReference covered;
  
  public EReference enclosingOperand;
  
  public EReference enclosingInteraction;
  
  public EReference generalOrdering;
  
  public EReference actualGate;
  
  public EReference argument;
  
  public EReference refersTo;
  
  public EReference returnValue;
  
  public EReference returnValueRecipient;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference generalOrdering;
  
  public EReference actualGate;
  
  public EReference argument;
  
  public EReference returnValue;
  
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
  
  public EOperation gates_match;
  
  public EOperation arguments_are_constants;
  
  public EOperation returnValueRecipient_coverage;
  
  public EOperation arguments_correspond_to_parameters;
  
  public EOperation returnValue_type_recipient_correspondence;
  
  public EOperation all_lifelines;
  
  public EOperation commutativity_of_decomposition;
  
  public EOperation assume;
  
  public EOperation parts_of_internal_structures;
  
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
  
  public EReference covered;
  
  public EReference enclosingOperand;
  
  public EReference enclosingInteraction;
  
  public EReference generalOrdering;
  
  public EReference actualGate;
  
  public EReference argument;
  
  public EReference refersTo;
  
  public EReference returnValue;
  
  public EReference returnValueRecipient;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass InteractionFragment;
  
  public EClass InteractionUse;
  
  public EDataType commutativity_of_decomposition();
  
  public EDataType assume();
  
  public EDataType parts_of_internal_structures();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
