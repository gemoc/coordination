package org.gemoc.bcool.model.xtext.typing;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.impl.XVariableDeclarationImplCustom;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeExpectation;
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.xbase.typesystem.references.AnyTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.gemoc.bcool.model.bcool.BCoolCompositionRule;

/**
 * Custom version of type computer for Custom XExpressions
 * introduced by BCOoL
 */
@Singleton
@SuppressWarnings("all")
public class BCOoLTypeComputer extends XbaseWithAnnotationsTypeComputer {
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    boolean _matched = false;
    if (!_matched) {
      if (expression instanceof XBlockExpression) {
        _matched=true;
        this._computeTypes(((XBlockExpression)expression), state);
      }
    }
    if (!_matched) {
      super.computeTypes(expression, state);
    }
  }
  
  public void _computeTypes(final XBlockExpression b, final ITypeComputationState typeState) {
    ITypeComputationState state = typeState;
    EObject _eContainer = b.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    if ((_eContainer_1 instanceof BCoolCompositionRule)) {
      EObject _eContainer_2 = b.eContainer();
      EObject _eContainer_3 = _eContainer_2.eContainer();
      final BCoolCompositionRule compoRule = ((BCoolCompositionRule) _eContainer_3);
      EList<DefPropertyCS> _dSEs = compoRule.getDSEs();
      for (final DefPropertyCS dse : _dSEs) {
        {
          final XVariableDeclaration decl = new XVariableDeclarationImplCustom();
          String _name = dse.getName();
          decl.setName(_name);
          this.addLocalToCurrentScope(decl, state);
        }
      }
    }
    List<? extends ITypeExpectation> _expectations = state.getExpectations();
    for (final ITypeExpectation expectation : _expectations) {
      {
        final LightweightTypeReference expectedType = expectation.getExpectedType();
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(expectedType, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _isPrimitiveVoid = expectedType.isPrimitiveVoid();
          _and = _isPrimitiveVoid;
        }
        if (_and) {
          final EList<XExpression> expressions = b.getExpressions();
          boolean _isEmpty = expressions.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            for (final XExpression expression : expressions) {
              {
                final ITypeComputationState expressionState = state.withoutExpectation();
                expressionState.computeTypes(expression);
                this.addVariableDeclarationsToScope(expression, state);
              }
            }
          }
          LightweightTypeReference _primitiveVoid = this.getPrimitiveVoid(state);
          expectation.acceptActualType(_primitiveVoid, ConformanceHint.CHECKED, ConformanceHint.SUCCESS);
        } else {
          final EList<XExpression> expressions_1 = b.getExpressions();
          boolean _isEmpty_1 = expressions_1.isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            int _size = expressions_1.size();
            int _minus = (_size - 1);
            List<XExpression> _subList = expressions_1.subList(0, _minus);
            for (final XExpression expression_1 : _subList) {
              {
                final ITypeComputationState expressionState = state.withoutExpectation();
                expressionState.computeTypes(expression_1);
                this.addVariableDeclarationsToScope(expression_1, state);
              }
            }
            final XExpression lastExpression = IterableExtensions.<XExpression>last(expressions_1);
            state.computeTypes(lastExpression);
            this.addVariableDeclarationsToScope(lastExpression, state);
          } else {
            ITypeReferenceOwner _referenceOwner = expectation.getReferenceOwner();
            AnyTypeReference _anyTypeReference = new AnyTypeReference(_referenceOwner);
            expectation.acceptActualType(_anyTypeReference, 
              ConformanceHint.UNCHECKED);
          }
        }
      }
    }
  }
  
  protected void addVariableDeclarationsToScope(final XExpression e, final ITypeComputationState state) {
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof XVariableDeclaration) {
        _matched=true;
        this.addLocalToCurrentScope(((XVariableDeclaration)e), state);
      }
    }
  }
}
