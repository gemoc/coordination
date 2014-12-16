package org.gemoc.bcool.model.xtext.jvmmodel

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XBlockExpression

class TemplateCompiler extends XbaseCompiler {
	
	
	override protected doInternalToJavaStatement(XExpression expr, ITreeAppendable it, boolean isReferenced) {
		switch expr {
			
			XBlockExpression : {append(' ')}
			
			default : 
				{print("members bcoolrule: ")
				super.doInternalToJavaStatement(expr, it, isReferenced)}
		}
	}
	
	
	
	override protected internalToConvertedExpression(XExpression obj, ITreeAppendable it) {
		if (hasName(obj))
			append(getName(obj))
		else 
			super.internalToConvertedExpression(obj, it) 
	}
	
	
	
	
	
}