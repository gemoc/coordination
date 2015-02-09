package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EEnum;
import ecore.EOperation;
import ecore.EReference;
import uml.NamedElement;

@SuppressWarnings("all")
public class Message extends NamedElement {
  public EOperation sending_receiving_message_event;
  
  public EOperation arguments;
  
  public EOperation cannot_cross_boundaries;
  
  public EOperation signature_is_signal;
  
  public EOperation occurrence_specifications;
  
  public EOperation signature_refer_to;
  
  public EOperation signature_is_operation_request;
  
  public EOperation signature_is_operation_reply;
  
  public EOperation getMessageKind;
  
  public EReference argument;
  
  public EReference connector;
  
  public EReference interaction;
  
  public EAttribute messageKind;
  
  public EAttribute messageSort;
  
  public EReference receiveEvent;
  
  public EReference sendEvent;
  
  public EReference signature;
  
  public EClass NamedElement;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute messageKind;
  
  public EAttribute messageSort;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EReference argument;
  
  public EReference connector;
  
  public EReference interaction;
  
  public EReference receiveEvent;
  
  public EReference sendEvent;
  
  public EReference signature;
  
  public EReference argument;
  
  public EReference connector;
  
  public EReference interaction;
  
  public EReference receiveEvent;
  
  public EReference sendEvent;
  
  public EReference signature;
  
  public EAttribute messageKind;
  
  public EAttribute messageSort;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference argument;
  
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
  
  public EOperation sending_receiving_message_event;
  
  public EOperation arguments;
  
  public EOperation cannot_cross_boundaries;
  
  public EOperation signature_is_signal;
  
  public EOperation occurrence_specifications;
  
  public EOperation signature_refer_to;
  
  public EOperation signature_is_operation_request;
  
  public EOperation signature_is_operation_reply;
  
  public EOperation getMessageKind;
  
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
  
  public EReference argument;
  
  public EReference connector;
  
  public EReference interaction;
  
  public EAttribute messageKind;
  
  public EAttribute messageSort;
  
  public EReference receiveEvent;
  
  public EReference sendEvent;
  
  public EReference signature;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EDataType sending_receiving_message_event();
  
  public EDataType arguments();
  
  public EDataType cannot_cross_boundaries();
  
  public EDataType signature_is_signal();
  
  public EDataType occurrence_specifications();
  
  public EDataType signature_refer_to();
  
  public EDataType signature_is_operation_request();
  
  public EDataType signature_is_operation_reply();
  
  public EEnum getMessageKind();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
