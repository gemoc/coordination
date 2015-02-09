package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.TemplateParameter;

@SuppressWarnings("all")
public class ClassifierTemplateParameter extends TemplateParameter {
  public EOperation has_constraining_classifier;
  
  public EOperation parametered_element_no_features;
  
  public EOperation matching_abstract;
  
  public EOperation actual_is_classifier;
  
  public EOperation constraining_classifiers_constrain_args;
  
  public EOperation constraining_classifiers_constrain_parametered_element;
  
  public EAttribute allowSubstitutable;
  
  public EReference constrainingClassifier;
  
  public EClass TemplateParameter;
  
  public EAttribute allowSubstitutable;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference default;
  
  public EReference ownedDefault;
  
  public EReference parameteredElement;
  
  public EReference signature;
  
  public EReference ownedParameteredElement;
  
  public EReference constrainingClassifier;
  
  public EReference constrainingClassifier;
  
  public EAttribute allowSubstitutable;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedDefault;
  
  public EReference ownedParameteredElement;
  
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
  
  public EOperation must_be_compatible;
  
  public EOperation has_constraining_classifier;
  
  public EOperation parametered_element_no_features;
  
  public EOperation matching_abstract;
  
  public EOperation actual_is_classifier;
  
  public EOperation constraining_classifiers_constrain_args;
  
  public EOperation constraining_classifiers_constrain_parametered_element;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference default;
  
  public EReference ownedDefault;
  
  public EReference parameteredElement;
  
  public EReference signature;
  
  public EReference ownedParameteredElement;
  
  public EAttribute allowSubstitutable;
  
  public EReference constrainingClassifier;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass TemplateParameter;
  
  public EDataType has_constraining_classifier();
  
  public EDataType parametered_element_no_features();
  
  public EDataType matching_abstract();
  
  public EDataType actual_is_classifier();
  
  public EDataType constraining_classifiers_constrain_args();
  
  public EDataType constraining_classifiers_constrain_parametered_element();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
