package org.gemoc.bcool.model.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;

@SuppressWarnings("all")
public class BCOoLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BCOoLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_GProgram_SemicolonKeyword_1_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BCOoLGrammarAccess) access;
		match_GProgram_SemicolonKeyword_1_1_0_q = new TokenAlias(false, true, grammarAccess.getGProgramAccess().getSemicolonKeyword_1_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_GProgram_SemicolonKeyword_1_1_0_q.equals(syntax))
				emit_GProgram_SemicolonKeyword_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_GProgram_SemicolonKeyword_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
