package uml;

import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.Element;
import uml.InputPin;

@SuppressWarnings("all")
public class LinkEndData extends Element {
  public EOperation same_type;
  
  public EOperation multiplicity;
  
  public EOperation end_object_input_pin;
  
  public EOperation property_is_association_end;
  
  public EOperation qualifiers;
  
  public EOperation allPins;
  
  public EReference end;
  
  public EReference qualifier;
  
  public EReference value;
  
  public EClass Element;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference end;
  
  public EReference qualifier;
  
  public EReference value;
  
  public EReference end;
  
  public EReference qualifier;
  
  public EReference value;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference qualifier;
  
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
  
  public EOperation same_type;
  
  public EOperation multiplicity;
  
  public EOperation end_object_input_pin;
  
  public EOperation property_is_association_end;
  
  public EOperation qualifiers;
  
  public EOperation allPins;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference end;
  
  public EReference qualifier;
  
  public EReference value;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EDataType same_type();
  
  public EDataType multiplicity();
  
  public EDataType end_object_input_pin();
  
  public EDataType property_is_association_end();
  
  public EDataType qualifiers();
  
  public InputPin allPins();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
