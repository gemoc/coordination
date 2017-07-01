/**
 */
package org.eclipse.gemoc.bcool.model.bcool.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCool Operator Arg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BCoolOperatorArgTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BCoolOperatorArgTest.class);
	}

	/**
	 * Constructs a new BCool Operator Arg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolOperatorArgTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCool Operator Arg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BCoolOperatorArg getFixture() {
		return (BCoolOperatorArg)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BcoolFactory.eINSTANCE.createBCoolOperatorArg());
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

} //BCoolOperatorArgTest
