/**
 */
package org.eclipse.gemoc.bcool.model.bcool.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BCoolOperator;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCool Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BCoolOperatorTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BCoolOperatorTest.class);
	}

	/**
	 * Constructs a new BCool Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCool Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BCoolOperator getFixture() {
		return (BCoolOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BcoolFactory.eINSTANCE.createBCoolOperator());
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

} //BCoolOperatorTest
