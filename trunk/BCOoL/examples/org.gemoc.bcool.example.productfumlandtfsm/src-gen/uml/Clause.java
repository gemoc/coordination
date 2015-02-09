package uml;

import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.Element;

@SuppressWarnings("all")
public class Clause extends Element {
  public EOperation body_output_pins;
  
  public EOperation decider_output;
  
  public EOperation test_and_body;
  
  public EReference body;
  
  public EReference bodyOutput;
  
  public EReference decider;
  
  public EReference predecessorClause;
  
  public EReference successorClause;
  
  public EReference test;
  
  public EClass Element;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference body;
  
  public EReference bodyOutput;
  
  public EReference decider;
  
  public EReference predecessorClause;
  
  public EReference successorClause;
  
  public EReference test;
  
  public EReference body;
  
  public EReference bodyOutput;
  
  public EReference decider;
  
  public EReference predecessorClause;
  
  public EReference successorClause;
  
  public EReference test;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
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
  
  public EOperation body_output_pins;
  
  public EOperation decider_output;
  
  public EOperation test_and_body;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference body;
  
  public EReference bodyOutput;
  
  public EReference decider;
  
  public EReference predecessorClause;
  
  public EReference successorClause;
  
  public EReference test;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EDataType body_output_pins();
  
  public EDataType decider_output();
  
  public EDataType test_and_body();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
