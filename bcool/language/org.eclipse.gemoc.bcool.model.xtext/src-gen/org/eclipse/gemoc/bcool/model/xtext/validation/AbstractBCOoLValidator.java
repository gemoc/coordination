/*
 * generated by Xtext
 */
package org.eclipse.gemoc.bcool.model.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractBCOoLValidator extends org.eclipse.gemoc.gexpressions.xtext.validation.GExpressionsValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.eclipse.gemoc.bcool.model/"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/ocl/2015/CompleteOCLCS"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.gemoc.org/gexpressions"));
		return result;
	}
}