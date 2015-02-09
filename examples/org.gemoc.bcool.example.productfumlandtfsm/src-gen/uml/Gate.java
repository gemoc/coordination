package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.InteractionOperand;
import uml.MessageEnd;

@SuppressWarnings("all")
public class Gate extends MessageEnd {
  public EOperation actual_gate_matched;
  
  public EOperation inside_cf_matched;
  
  public EOperation outside_cf_matched;
  
  public EOperation formal_gate_distinguishable;
  
  public EOperation actual_gate_distinguishable;
  
  public EOperation outside_cf_gate_distinguishable;
  
  public EOperation inside_cf_gate_distinguishable;
  
  public EOperation isOutsideCF;
  
  public EOperation isInsideCF;
  
  public EOperation isActual;
  
  public EOperation isFormal;
  
  public EOperation getName;
  
  public EOperation matches;
  
  public EOperation getOperand;
  
  public EClass MessageEnd;
  
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
  
  public EReference message;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
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
  
  public EOperation oppositeEnd;
  
  public EOperation isSend;
  
  public EOperation isReceive;
  
  public EOperation enclosingFragment;
  
  public EOperation actual_gate_matched;
  
  public EOperation inside_cf_matched;
  
  public EOperation outside_cf_matched;
  
  public EOperation formal_gate_distinguishable;
  
  public EOperation actual_gate_distinguishable;
  
  public EOperation outside_cf_gate_distinguishable;
  
  public EOperation inside_cf_gate_distinguishable;
  
  public EOperation isOutsideCF;
  
  public EOperation isInsideCF;
  
  public EOperation isActual;
  
  public EOperation isFormal;
  
  public EOperation getName;
  
  public EOperation matches;
  
  public EOperation getOperand;
  
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
  
  public EReference message;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass MessageEnd;
  
  public EDataType actual_gate_matched();
  
  public EDataType inside_cf_matched();
  
  public EDataType outside_cf_matched();
  
  public EDataType formal_gate_distinguishable();
  
  public EDataType actual_gate_distinguishable();
  
  public EDataType outside_cf_gate_distinguishable();
  
  public EDataType inside_cf_gate_distinguishable();
  
  public EDataType isOutsideCF();
  
  public EDataType isInsideCF();
  
  public EDataType isActual();
  
  public EDataType isFormal();
  
  public EDataType getName();
  
  public EDataType matches();
  
  public InteractionOperand getOperand();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
