package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.Constraint;

@SuppressWarnings("all")
public class InteractionConstraint extends Constraint {
  public EOperation minint_maxint;
  
  public EOperation minint_non_negative;
  
  public EOperation maxint_positive;
  
  public EOperation dynamic_variables;
  
  public EOperation global_data;
  
  public EOperation maxint_greater_equal_minint;
  
  public EReference maxint;
  
  public EReference minint;
  
  public EClass Constraint;
  
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
  
  public EReference owningTemplateParameter;
  
  public EReference templateParameter;
  
  public EReference constrainedElement;
  
  public EReference context;
  
  public EReference specification;
  
  public EReference maxint;
  
  public EReference minint;
  
  public EReference maxint;
  
  public EReference minint;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference specification;
  
  public EReference maxint;
  
  public EReference minint;
  
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
  
  public EOperation isCompatibleWith;
  
  public EOperation isTemplateParameter;
  
  public EOperation namespace_needs_visibility;
  
  public EOperation boolean_value;
  
  public EOperation no_side_effects;
  
  public EOperation not_apply_to_self;
  
  public EOperation minint_maxint;
  
  public EOperation minint_non_negative;
  
  public EOperation maxint_positive;
  
  public EOperation dynamic_variables;
  
  public EOperation global_data;
  
  public EOperation maxint_greater_equal_minint;
  
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
  
  public EReference owningTemplateParameter;
  
  public EReference templateParameter;
  
  public EReference constrainedElement;
  
  public EReference context;
  
  public EReference specification;
  
  public EReference maxint;
  
  public EReference minint;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass ParameterableElement;
  
  public EClass PackageableElement;
  
  public EClass Constraint;
  
  public EDataType minint_maxint();
  
  public EDataType minint_non_negative();
  
  public EDataType maxint_positive();
  
  public EDataType dynamic_variables();
  
  public EDataType global_data();
  
  public EDataType maxint_greater_equal_minint();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
