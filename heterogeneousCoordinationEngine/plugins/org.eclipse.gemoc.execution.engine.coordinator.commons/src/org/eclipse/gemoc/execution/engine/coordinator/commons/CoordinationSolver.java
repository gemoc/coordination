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
package org.eclipse.gemoc.execution.engine.coordinator.commons;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.timesquare.moc.impl.CcslSolver;

import fr.inria.aoste.timesquare.ccslkernel.solver.CCSLKernelSolver;
import fr.inria.aoste.timesquare.ccslkernel.solver.launch.CCSLKernelSolverWrapper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

public class CoordinationSolver extends CcslSolver {

	public ArrayList<HeterogeneousLogicalStep> _lastLogicalSteps = new ArrayList<HeterogeneousLogicalStep>();
	
	public CoordinationSolver(CCSLKernelSolver realSolver, URI modelURI) {
		this.solverWrapper = new CCSLKernelSolverWrapper(realSolver);
		this.solverInputURI = modelURI;
		this._feedbackModel = null;
	}
	
	@Override
	public Step proposeLogicalStep() {
		int index = solverWrapper.proposeLogicalStepByIndex();
		Step result = null;
		if (_lastLogicalSteps.size() > index)
		{
			result = _lastLogicalSteps.get(index);			
		}
		return result;
	}
	
}

