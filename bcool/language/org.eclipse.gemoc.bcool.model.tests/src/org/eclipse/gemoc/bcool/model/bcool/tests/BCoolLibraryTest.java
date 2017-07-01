/**
 */
package org.eclipse.gemoc.bcool.model.bcool.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCool Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BCoolLibraryTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BCoolLibraryTest.class);
	}

	/**
	 * Constructs a new BCool Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolLibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCool Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BCoolLibrary getFixture() {
		return (BCoolLibrary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BcoolFactory.eINSTANCE.createBCoolLibrary());
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

} //BCoolLibraryTest
