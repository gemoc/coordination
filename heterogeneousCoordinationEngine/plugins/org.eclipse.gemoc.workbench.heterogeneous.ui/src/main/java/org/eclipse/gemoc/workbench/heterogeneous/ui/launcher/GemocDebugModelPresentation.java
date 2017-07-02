package org.eclipse.gemoc.workbench.heterogeneous.ui.launcher;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.dsl.debug.ide.adapter.DSLStackFrameAdapter;
import org.eclipse.gemoc.dsl.debug.ide.sirius.ui.DSLDebugModelPresentation;
import org.eclipse.gemoc.dsl.debug.ide.sirius.ui.SiriusEditorUtils;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.FeedbackMSE;
import org.eclipse.gemoc.executionframework.ui.IMSEPresenter;
import org.eclipse.gemoc.trace.commons.model.helper.StepHelper;
import org.eclipse.gemoc.trace.commons.model.trace.MSE;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ModelSpecificEvent;

public class GemocDebugModelPresentation extends DSLDebugModelPresentation {

	@Override
	public IEditorInput getEditorInput(Object element) {
		final IEditorInput res;

		if (element instanceof ModelSpecificEvent
				&& ((ModelSpecificEvent) element).getCaller() != null) {
			res = super.getEditorInput(((ModelSpecificEvent) element).getCaller());
		} else {
			res = super.getEditorInput(element);
		}

		return res;
	}

	@Override
	public String getEditorId(IEditorInput input, Object element) {
		final String res;

		if (element instanceof ModelSpecificEvent
				&& ((ModelSpecificEvent) element).getCaller() != null) {
			res = super.getEditorId(input, ((ModelSpecificEvent) element).getCaller());
		} else {
			res = super.getEditorId(input, element);
		}


		return res;
	}

	@Override
	public boolean addAnnotations(IEditorPart editorPart, IStackFrame frame) {
		if (frame instanceof DSLStackFrameAdapter) {
			changeCurrentStackFrame(frame);
			if (editorPart instanceof DialectEditor) {
				EObject instruction = ((DSLStackFrameAdapter) frame)
						.getCurrentInstruction();
				if (instruction instanceof Step) {
					final List<MSE> tickedEvents = StepHelper.collectAllMSEs((Step) instruction);
					showEvents(tickedEvents);
					final Set<EObject> callers = new LinkedHashSet<EObject>();
					for (MSE event : tickedEvents) {
						if (event.getCaller() != null) {
							callers.add(event.getCaller());
						}
					}
					SiriusEditorUtils.showInstructions((DialectEditor) editorPart, new ArrayList<EObject>(callers));
				} else {
					SiriusEditorUtils.showInstruction((DialectEditor) editorPart, instruction);
				}
			} else {
				super.addAnnotations(editorPart, frame);
			}
		}

		return true;
	}

	private void showEvents(List<MSE> events) {
		final List<URI> uris = new ArrayList<URI>();
		for (MSE event : events) {
			uris.add(EcoreUtil.getURI(event));
			if(event instanceof FeedbackMSE){
				uris.add(EcoreUtil.getURI((FeedbackMSE)((FeedbackMSE) event).getFeedbackModelSpecificEvent()));
			}
		}
		for (IMSEPresenter presenter : org.eclipse.gemoc.executionframework.ui.Activator
				.getDefault().getEventPresenters()) {
			presenter.present(uris);
		}
	}

}
