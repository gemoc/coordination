/*******************************************************************************
 * Copyright (c) 2015, 2017  I3S Laboratory  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.bcool.model.bcool.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCool Composition Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BCoolCompositionRuleTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BCoolCompositionRuleTest.class);
	}

	/**
	 * Constructs a new BCool Composition Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolCompositionRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCool Composition Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BCoolCompositionRule getFixture() {
		return (BCoolCompositionRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BcoolFactory.eINSTANCE.createBCoolCompositionRule());
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

} //BCoolCompositionRuleTest
