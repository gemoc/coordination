package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.NamedElement;

@SuppressWarnings("all")
public class Lifeline extends NamedElement {
  public EOperation selector_specified;
  
  public EOperation interaction_uses_share_lifeline;
  
  public EOperation same_classifier;
  
  public EOperation selector_int_or_string;
  
  public EReference decomposedAs;
  
  public EReference interaction;
  
  public EReference represents;
  
  public EReference selector;
  
  public EReference coveredBy;
  
  public EClass NamedElement;
  
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
  
  public EReference decomposedAs;
  
  public EReference interaction;
  
  public EReference represents;
  
  public EReference selector;
  
  public EReference coveredBy;
  
  public EReference decomposedAs;
  
  public EReference interaction;
  
  public EReference represents;
  
  public EReference selector;
  
  public EReference coveredBy;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference selector;
  
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
  
  public EOperation selector_specified;
  
  public EOperation interaction_uses_share_lifeline;
  
  public EOperation same_classifier;
  
  public EOperation selector_int_or_string;
  
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
  
  public EReference decomposedAs;
  
  public EReference interaction;
  
  public EReference represents;
  
  public EReference selector;
  
  public EReference coveredBy;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EDataType selector_specified();
  
  public EDataType interaction_uses_share_lifeline();
  
  public EDataType same_classifier();
  
  public EDataType selector_int_or_string();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
