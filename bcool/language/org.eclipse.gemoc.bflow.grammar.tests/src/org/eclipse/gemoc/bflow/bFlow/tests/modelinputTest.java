/**
 */
package org.eclipse.gemoc.bflow.bFlow.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bflow.bFlow.BFlowFactory;
import org.eclipse.gemoc.bflow.bFlow.modelinput;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>modelinput</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class modelinputTest extends TestCase {

	/**
	 * The fixture for this modelinput test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected modelinput fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(modelinputTest.class);
	}

	/**
	 * Constructs a new modelinput test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelinputTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this modelinput test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(modelinput fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this modelinput test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected modelinput getFixture() {
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
		setFixture(BFlowFactory.eINSTANCE.createmodelinput());
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

} //modelinputTest
