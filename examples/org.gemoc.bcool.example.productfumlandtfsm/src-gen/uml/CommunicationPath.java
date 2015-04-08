package uml;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EOperation;
import ecore.EReference;
import uml.Association;

@SuppressWarnings("all")
public class CommunicationPath extends Association {
  public EClass Association;
  
  public EAttribute name;
  
  public EAttribute qualifiedName;
  
  public EAttribute visibility;
  
  public EAttribute isLeaf;
  
  public EAttribute isAbstract;
  
  public EAttribute isFinalSpecialization;
  
  public EAttribute isDerived;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference ownedElement;
  
  public EReference owner;
  
  public EReference clientDependency;
  
  public EReference nameExpression;
  
  public EReference namespace;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference ownedMember;
  
  public EReference importedMember;
  
  public EReference member;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference owningTemplateParameter;
  
  public EReference templateParameter;
  
  public EReference package;
  
  public EReference templateBinding;
  
  public EReference ownedTemplateSignature;
  
  public EReference feature;
  
  public EReference attribute;
  
  public EReference collaborationUse;
  
  public EReference general;
  
  public EReference generalization;
  
  public EReference powertypeExtent;
  
  public EReference inheritedMember;
  
  public EReference ownedUseCase;
  
  public EReference useCase;
  
  public EReference redefinedClassifier;
  
  public EReference representation;
  
  public EReference substitution;
  
  public EReference relatedElement;
  
  public EReference endType;
  
  public EReference memberEnd;
  
  public EReference ownedEnd;
  
  public EReference navigableOwnedEnd;
  
  public EReference eAnnotations;
  
  public EReference ownedComment;
  
  public EReference nameExpression;
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference templateBinding;
  
  public EReference ownedTemplateSignature;
  
  public EReference collaborationUse;
  
  public EReference generalization;
  
  public EReference ownedUseCase;
  
  public EReference substitution;
  
  public EReference ownedEnd;
  
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
  
  public EOperation members_distinguishable;
  
  public EOperation cannot_import_self;
  
  public EOperation cannot_import_ownedMembers;
  
  public EOperation createElementImport;
  
  public EOperation createPackageImport;
  
  public EOperation getImportedElements;
  
  public EOperation getImportedPackages;
  
  public EOperation getOwnedMembers;
  
  public EOperation excludeCollisions;
  
  public EOperation getNamesOfMember;
  
  public EOperation importMembers;
  
  public EOperation getImportedMembers;
  
  public EOperation membersAreDistinguishable;
  
  public EOperation redefinition_consistent;
  
  public EOperation non_leaf_redefinition;
  
  public EOperation redefinition_context_valid;
  
  public EOperation isConsistentWith;
  
  public EOperation isRedefinitionContextValid;
  
  public EOperation isCompatibleWith;
  
  public EOperation isTemplateParameter;
  
  public EOperation namespace_needs_visibility;
  
  public EOperation createAssociation;
  
  public EOperation getAssociations;
  
  public EOperation conformsTo;
  
  public EOperation isTemplate;
  
  public EOperation parameterableElements;
  
  public EOperation specialize_type;
  
  public EOperation maps_to_generalization_set;
  
  public EOperation non_final_parents;
  
  public EOperation no_cycles_in_generalization;
  
  public EOperation getAllAttributes;
  
  public EOperation getAllOperations;
  
  public EOperation getAllUsedInterfaces;
  
  public EOperation getOperation;
  
  public EOperation getOperation;
  
  public EOperation getOperations;
  
  public EOperation getUsedInterfaces;
  
  public EOperation allFeatures;
  
  public EOperation allParents;
  
  public EOperation getGenerals;
  
  public EOperation hasVisibilityOf;
  
  public EOperation inherit;
  
  public EOperation inheritableMembers;
  
  public EOperation getInheritedMembers;
  
  public EOperation maySpecializeType;
  
  public EOperation parents;
  
  public EOperation directlyRealizedInterfaces;
  
  public EOperation directlyUsedInterfaces;
  
  public EOperation allRealizedInterfaces;
  
  public EOperation allUsedInterfaces;
  
  public EOperation isSubstitutableFor;
  
  public EOperation allAttributes;
  
  public EOperation allSlottableFeatures;
  
  public EOperation specialized_end_number;
  
  public EOperation specialized_end_types;
  
  public EOperation binary_associations;
  
  public EOperation association_ends;
  
  public EOperation ends_must_be_typed;
  
  public EOperation isBinary;
  
  public EOperation getEndTypes;
  
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
  
  public EReference ownedRule;
  
  public EReference elementImport;
  
  public EReference packageImport;
  
  public EReference ownedMember;
  
  public EReference importedMember;
  
  public EReference member;
  
  public EAttribute isLeaf;
  
  public EReference redefinedElement;
  
  public EReference redefinitionContext;
  
  public EReference owningTemplateParameter;
  
  public EReference templateParameter;
  
  public EReference package;
  
  public EReference templateBinding;
  
  public EReference ownedTemplateSignature;
  
  public EReference feature;
  
  public EReference attribute;
  
  public EReference collaborationUse;
  
  public EReference general;
  
  public EReference generalization;
  
  public EReference powertypeExtent;
  
  public EReference inheritedMember;
  
  public EAttribute isAbstract;
  
  public EAttribute isFinalSpecialization;
  
  public EReference ownedUseCase;
  
  public EReference useCase;
  
  public EReference redefinedClassifier;
  
  public EReference representation;
  
  public EReference substitution;
  
  public EReference relatedElement;
  
  public EReference endType;
  
  public EAttribute isDerived;
  
  public EReference memberEnd;
  
  public EReference ownedEnd;
  
  public EReference navigableOwnedEnd;
  
  public EClass EModelElement;
  
  public EClass Element;
  
  public EClass NamedElement;
  
  public EClass Namespace;
  
  public EClass RedefinableElement;
  
  public EClass ParameterableElement;
  
  public EClass PackageableElement;
  
  public EClass Type;
  
  public EClass TemplateableElement;
  
  public EClass Classifier;
  
  public EClass Relationship;
  
  public EClass Association;
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}