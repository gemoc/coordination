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
package org.eclipse.gemoc.bcool.model.xtext.helpers;

import java.util.Arrays;
import java.util.List;

import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;

public class BCoolXtextHelper {
	/**
	 * Parses some context from the CS of ECL to deduce the context EClass of an
	 * ECL Event.
	 * 
	 * @param string
	 * @return
	 */
	public static String parseContextName(ClassifierContextDeclCS string) {
		String stringRepresentation = string.toString();
		String stringWithoutTheComments = stringRepresentation.replaceAll(
				"(?m)^--.*", "");
		List<String> arrayOfWords = Arrays.asList(stringWithoutTheComments
				.split("\\s+"));
		return arrayOfWords.get(arrayOfWords.indexOf("context") + 1);
	}
}
