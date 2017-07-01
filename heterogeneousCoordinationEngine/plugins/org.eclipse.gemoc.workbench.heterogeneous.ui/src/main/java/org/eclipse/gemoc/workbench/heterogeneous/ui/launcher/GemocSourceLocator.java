package org.eclipse.gemoc.workbench.heterogeneous.ui.launcher;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.trace.commons.model.helper.StepHelper;
import org.eclipse.gemoc.trace.commons.model.trace.MSE;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.dsl.debug.ide.DSLSourceLocator;
import org.eclipse.gemoc.dsl.debug.ide.adapter.DSLStackFrameAdapter;

public class GemocSourceLocator extends DSLSourceLocator {

	@Override
	public Object getSourceElement(IStackFrame stackFrame) {
		final Object res;
		if (stackFrame instanceof DSLStackFrameAdapter) {
			final DSLStackFrameAdapter eStackFrame = (DSLStackFrameAdapter) stackFrame;
			final EObject instruction = eStackFrame.getCurrentInstruction();
			if (instruction instanceof Step) {
				res = getFirstTarget((Step) instruction);
			} else if (instruction != null) {
				res = instruction;
			} else {
				res = eStackFrame.getContext();
			}
		} else {
			res = null;
		}
		return res;
	}

	private EObject getFirstTarget(Step step) {
		EObject res = null;

		for (MSE event : StepHelper.collectAllMSEs(step)) 
		{
			res = event;
			break;
		}

		return res;
	}

}
