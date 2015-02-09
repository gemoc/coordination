package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.InteractionFragment;

@SuppressWarnings("all")
public class InteractionUse extends InteractionFragment {
  public EOperation gates_match;
  
  public EOperation arguments_are_constants;
  
  public EOperation returnValueRecipient_coverage;
  
  public EOperation arguments_correspond_to_parameters;
  
  public EOperation returnValue_type_recipient_correspondence;
  
  public EOperation all_lifelines;
  
  public EReference actualGate;
  
  public EReference argument;
  
  public EReference refersTo;
  
  public EReference returnValue;
  
  public EReference returnValueRecipient;
  
  public EClass InteractionFragment;
  
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
  
  public EDataType gates_match();
  
  public EDataType arguments_are_constants();
  
  public EDataType returnValueRecipient_coverage();
  
  public EDataType arguments_correspond_to_parameters();
  
  public EDataType returnValue_type_recipient_correspondence();
  
  public EDataType all_lifelines();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
