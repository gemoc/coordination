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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.gemoc.bcool.model.bcool.BcoolFactory;
import org.eclipse.gemoc.bcool.model.bcool.ImportLibStatement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Import Lib Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportLibStatementTest extends TestCase {

	/**
	 * The fixture for this Import Lib Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportLibStatement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImportLibStatementTest.class);
	}

	/**
	 * Constructs a new Import Lib Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportLibStatementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Import Lib Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ImportLibStatement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Import Lib Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportLibStatement getFixture() {
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
		setFixture(BcoolFactory.eINSTANCE.createImportLibStatement());
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

} //ImportLibStatementTest
