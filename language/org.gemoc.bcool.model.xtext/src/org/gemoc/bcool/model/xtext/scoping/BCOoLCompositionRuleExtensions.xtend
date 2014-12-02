package org.gemoc.bcool.model.xtext.scoping;

import java.util.AbstractMap.SimpleEntry
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.mwe2.language.scoping.MapBasedScope.MapEntry
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.MapBasedScope
import org.gemoc.bcool.model.bcool.BCoolCompositionRule
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefCS
import java.lang.reflect.Method

public class BCOoLCompositionRuleExtensions {

		public static class MyMap extends MapBasedScope{
	
		public new(IScope parent, Map<QualifiedName, IEObjectDescription> elements, boolean ignoreCase) {
			super(parent, elements, ignoreCase)
		}
		
	}
	final val map = new HashMap<QualifiedName, IEObjectDescription>()
	def IScope getScope(BCoolCompositionRule spec, IScope parentScope) {
		for (Resource r : spec.eResource.getResourceSet().resources){
			var it = r.allContents
			it.forEach[eo | 
				var boolean methodFound = true
				var Method m = null
				try {
					m = eo.getClass().getMethod("getname")
				}catch(Exception e) {
					methodFound = false
				}
				if (methodFound == true){
					var IEObjectDescription eodesc = new MapEntry(
								new SimpleEntry(
										QualifiedName.create(
											m.invoke(eo, null) as String
										) ,eo
								)
					)
					map.put(QualifiedName.create(m.invoke(eo, null) as String), eodesc)
//						addLocalElement(QualifiedName.create(eo.name), eo as JvmIdentifiableElement, context as ITypeReferenceOwner)
				} 
			]
			}	
		return new BCOoLCompositionRuleExtensions.MyMap(parentScope,map,true)
	}
	
	
	
} 
