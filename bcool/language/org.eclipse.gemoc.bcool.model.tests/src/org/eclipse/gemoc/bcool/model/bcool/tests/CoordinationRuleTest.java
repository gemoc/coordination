/**
 */
package org.eclipse.gemoc.bcool.model.bcool.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;
import org.eclipse.gemoc.bcool.model.bcool.CoordinationRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coordination Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationRuleTest extends TestCase {

	/**
	 * The fixture for this Coordination Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoordinationRuleTest.class);
	}

	/**
	 * Constructs a new Coordination Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Coordination Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CoordinationRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Coordination Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationRule getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BcoolFactory.eINSTANCE.createCoordinationRule());
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

} //CoordinationRuleTest
