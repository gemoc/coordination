package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.Action;

@SuppressWarnings("all")
public class ReadIsClassifiedObjectAction extends Action {
  public EOperation no_type;
  
  public EOperation multiplicity_of_output;
  
  public EOperation boolean_result;
  
  public EOperation multiplicity_of_input;
  
  public EReference classifier;
  
  public EAttribute isDirect;
  
  public EReference object;
  
  public EReference result;
  
  public EClass Action;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isLocallyReentrant;
  
  public EAttribute isDirect;
  
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
  
  public EReference handler;
  
  public EReference context;
  
  public EReference input;
  
  public EReference localPostcondition;
  
  public EReference localPrecondition;
  
  public EReference output;
  
  public EReference classifier;
  
  public EReference object;
  
  public EReference result;
  
  public EReference classifier;
  
  public EReference object;
  
  public EReference result;
  
  public EAttribute isDirect;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference handler;
  
  public EReference localPostcondition;
  
  public EReference localPrecondition;
  
  public EReference object;
  
  public EReference result;
  
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
  
  public EOperation getContext;
  
  public EOperation allActions;
  
  public EOperation allOwnedNodes;
  
  public EOperation containingBehavior;
  
  public EOperation no_type;
  
  public EOperation multiplicity_of_output;
  
  public EOperation boolean_result;
  
  public EOperation multiplicity_of_input;
  
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
  
  public EReference handler;
  
  public EReference context;
  
  public EReference input;
  
  public EAttribute isLocallyReentrant;
  
  public EReference localPostcondition;
  
  public EReference localPrecondition;
  
  public EReference output;
  
  public EReference classifier;
  
  public EAttribute isDirect;
  
  public EReference object;
  
  public EReference result;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass RedefinableElement;
  
  public EClass ActivityContent;
  
  public EClass ActivityNode;
  
  public EClass ExecutableNode;
  
  public EClass Action;
  
  public EDataType no_type();
  
  public EDataType multiplicity_of_output();
  
  public EDataType boolean_result();
  
  public EDataType multiplicity_of_input();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}