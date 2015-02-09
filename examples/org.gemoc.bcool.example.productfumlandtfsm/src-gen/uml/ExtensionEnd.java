package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EDataType;
import ecore.EOperation;
import ecore.EReference;
import uml.Property;

@SuppressWarnings("all")
public class ExtensionEnd extends Property {
  public EOperation multiplicity;
  
  public EOperation aggregation;
  
  public EClass Property;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isStatic;
  
  public EAttribute isOrdered;
  
  public EAttribute isUnique;
  
  public EAttribute lower;
  
  public EAttribute upper;
  
  public EAttribute isReadOnly;
  
  public EAttribute default;
  
  public EAttribute aggregation;
  
  public EAttribute isComposite;
  
  public EAttribute isDerived;
  
  public EAttribute isDerivedUnion;
  
  public EAttribute isID;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference featuringClassifier;
  
  public EReference type;
  
  public EReference lowerValue;
  
  public EReference upperValue;
  
  public EReference owningTemplateParameter;
  
  public EReference templateParameter;
  
  public EReference end;
  
  public EReference deployedElement;
  
  public EReference deployment;
  
  public EReference datatype;
  
  public EReference interface;
  
  public EReference associationEnd;
  
  public EReference qualifier;
  
  public EReference class;
  
  public EReference defaultValue;
  
  public EReference opposite;
  
  public EReference owningAssociation;
  
  public EReference redefinedProperty;
  
  public EReference subsettedProperty;
  
  public EReference association;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference lowerValue;
  
  public EReference upperValue;
  
  public EReference deployment;
  
  public EReference qualifier;
  
  public EReference defaultValue;
  
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
  
  public EOperation upper_ge_lower;
  
  public EOperation lower_ge_0;
  
  public EOperation value_specification_no_side_effects;
  
  public EOperation value_specification_constant;
  
  public EOperation lower_is_integer;
  
  public EOperation upper_is_unlimitedNatural;
  
  public EOperation setLower;
  
  public EOperation setUpper;
  
  public EOperation compatibleWith;
  
  public EOperation includesMultiplicity;
  
  public EOperation is;
  
  public EOperation isMultivalued;
  
  public EOperation getLower;
  
  public EOperation lowerBound;
  
  public EOperation getUpper;
  
  public EOperation upperBound;
  
  public EOperation isCompatibleWith;
  
  public EOperation isTemplateParameter;
  
  public EOperation getEnds;
  
  public EOperation getDeployedElements;
  
  public EOperation subsetting_context_conforms;
  
  public EOperation derived_union_is_read_only;
  
  public EOperation multiplicity_of_composite;
  
  public EOperation redefined_property_inherited;
  
  public EOperation subsetting_rules;
  
  public EOperation binding_to_attribute;
  
  public EOperation derived_union_is_derived;
  
  public EOperation deployment_target;
  
  public EOperation subsetted_property_names;
  
  public EOperation type_of_opposite_end;
  
  public EOperation qualified_is_association_end;
  
  public EOperation getDefault;
  
  public EOperation getOtherEnd;
  
  public EOperation isSetDefault;
  
  public EOperation setBooleanDefaultValue;
  
  public EOperation setDefault;
  
  public EOperation setIntegerDefaultValue;
  
  public EOperation setIsComposite;
  
  public EOperation setIsNavigable;
  
  public EOperation setNullDefaultValue;
  
  public EOperation setOpposite;
  
  public EOperation setRealDefaultValue;
  
  public EOperation setStringDefaultValue;
  
  public EOperation setUnlimitedNaturalDefaultValue;
  
  public EOperation unsetDefault;
  
  public EOperation isAttribute;
  
  public EOperation isComposite;
  
  public EOperation isNavigable;
  
  public EOperation getOpposite;
  
  public EOperation subsettingContext;
  
  public EOperation multiplicity;
  
  public EOperation aggregation;
  
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
  
  public EReference featuringClassifier;
  
  public EAttribute isStatic;
  
  public EReference type;
  
  public EAttribute isOrdered;
  
  public EAttribute isUnique;
  
  public EAttribute lower;
  
  public EReference lowerValue;
  
  public EAttribute upper;
  
  public EReference upperValue;
  
  public EAttribute isReadOnly;
  
  public EReference owningTemplateParameter;
  
  public EReference templateParameter;
  
  public EReference end;
  
  public EReference deployedElement;
  
  public EReference deployment;
  
  public EReference datatype;
  
  public EReference interface;
  
  public EAttribute default;
  
  public EAttribute aggregation;
  
  public EReference associationEnd;
  
  public EReference qualifier;
  
  public EReference class;
  
  public EReference defaultValue;
  
  public EAttribute isComposite;
  
  public EAttribute isDerived;
  
  public EAttribute isDerivedUnion;
  
  public EAttribute isID;
  
  public EReference opposite;
  
  public EReference owningAssociation;
  
  public EReference redefinedProperty;
  
  public EReference subsettedProperty;
  
  public EReference association;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass RedefinableElement;
  
  public EClass Feature;
  
  public EClass TypedElement;
  
  public EClass MultiplicityElement;
  
  public EClass StructuralFeature;
  
  public EClass ParameterableElement;
  
  public EClass ConnectableElement;
  
  public EClass DeploymentTarget;
  
  public EClass Property;
  
  public EDataType multiplicity();
  
  public EDataType aggregation();
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
