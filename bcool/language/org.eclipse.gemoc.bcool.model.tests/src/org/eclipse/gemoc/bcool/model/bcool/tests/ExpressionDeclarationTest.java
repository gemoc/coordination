/**
 */
package org.eclipse.gemoc.bcool.model.bcool.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;
import org.eclipse.gemoc.bcool.model.bcool.ExpressionDeclaration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expression Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionDeclarationTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpressionDeclarationTest.class);
	}

	/**
	 * Constructs a new Expression Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Expression Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpressionDeclaration getFixture() {
		return (ExpressionDeclaration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BcoolFactory.eINSTANCE.createExpressionDeclaration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExpressionDeclarationTest
