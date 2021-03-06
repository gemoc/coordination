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
/*
 * generated by Xtext
 */
package org.eclipse.gemoc.bcool.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.gemoc.bcool.services.BCOoLLibGrammarAccess;

public class BCOoLLibParser extends AbstractContentAssistParser {
	
	@Inject
	private BCOoLLibGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.gemoc.bcool.ui.contentassist.antlr.internal.InternalBCOoLLibParser createParser() {
		org.eclipse.gemoc.bcool.ui.contentassist.antlr.internal.InternalBCOoLLibParser result = new org.eclipse.gemoc.bcool.ui.contentassist.antlr.internal.InternalBCOoLLibParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBCoolLibraryAccess().getGroup(), "rule__BCoolLibrary__Group__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_4(), "rule__BCoolLibrary__Group_4__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_4_3(), "rule__BCoolLibrary__Group_4_3__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_5(), "rule__BCoolLibrary__Group_5__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_5_3(), "rule__BCoolLibrary__Group_5_3__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_6(), "rule__BCoolLibrary__Group_6__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_6_3(), "rule__BCoolLibrary__Group_6_3__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_7(), "rule__BCoolLibrary__Group_7__0");
					put(grammarAccess.getBCoolLibraryAccess().getGroup_7_3(), "rule__BCoolLibrary__Group_7_3__0");
					put(grammarAccess.getExpressionDefinitionAccess().getGroup(), "rule__ExpressionDefinition__Group__0");
					put(grammarAccess.getRelationDefinitionAccess().getGroup(), "rule__RelationDefinition__Group__0");
					put(grammarAccess.getRelationDeclarationAccess().getGroup(), "rule__RelationDeclaration__Group__0");
					put(grammarAccess.getRelationDeclarationAccess().getGroup_4(), "rule__RelationDeclaration__Group_4__0");
					put(grammarAccess.getRelationDeclarationAccess().getGroup_4_3(), "rule__RelationDeclaration__Group_4_3__0");
					put(grammarAccess.getExpressionDeclarationAccess().getGroup(), "rule__ExpressionDeclaration__Group__0");
					put(grammarAccess.getExpressionDeclarationAccess().getGroup_4(), "rule__ExpressionDeclaration__Group_4__0");
					put(grammarAccess.getExpressionDeclarationAccess().getGroup_4_3(), "rule__ExpressionDeclaration__Group_4_3__0");
					put(grammarAccess.getBCoolLibraryAccess().getNameAssignment_2(), "rule__BCoolLibrary__NameAssignment_2");
					put(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_2(), "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2");
					put(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_3_1(), "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1");
					put(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_2(), "rule__BCoolLibrary__RelationDefinitionsAssignment_5_2");
					put(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_3_1(), "rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1");
					put(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_2(), "rule__BCoolLibrary__RelationDeclarationsAssignment_6_2");
					put(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_3_1(), "rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1");
					put(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_2(), "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2");
					put(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_3_1(), "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1");
					put(grammarAccess.getExpressionDefinitionAccess().getDefinitionAssignment_3(), "rule__ExpressionDefinition__DefinitionAssignment_3");
					put(grammarAccess.getRelationDefinitionAccess().getDefinitionAssignment_3(), "rule__RelationDefinition__DefinitionAssignment_3");
					put(grammarAccess.getRelationDeclarationAccess().getNameAssignment_2(), "rule__RelationDeclaration__NameAssignment_2");
					put(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_2(), "rule__RelationDeclaration__FormalParametersAssignment_4_2");
					put(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_3_1(), "rule__RelationDeclaration__FormalParametersAssignment_4_3_1");
					put(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_2(), "rule__ExpressionDeclaration__NameAssignment_2");
					put(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_2(), "rule__ExpressionDeclaration__FormalParametersAssignment_4_2");
					put(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_3_1(), "rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.gemoc.bcool.ui.contentassist.antlr.internal.InternalBCOoLLibParser typedParser = (org.eclipse.gemoc.bcool.ui.contentassist.antlr.internal.InternalBCOoLLibParser) parser;
			typedParser.entryRuleBCoolLibrary();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BCOoLLibGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BCOoLLibGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
