/*
 * generated by Xtext
 */
package org.gemoc.bflow.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.gemoc.bflow.bFlow.Model
import org.gemoc.bflow.bFlow.Flows

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class BFlowGenerator implements IGenerator {
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
    for(e: resource.allContents.toIterable.filter(Model)) {
      fsa.generateFile(
        "../gemoc-gen/"+e.name  + ".xml",
        e.compile)
	}
}

def compile(Model e) '''
<?xml version="1.0" encoding="UTF-8"?>
<project name="«e.name»" default="default" xmlns:qvto="http://www.eclipse.org/qvt/1.0.0/Operational">
<target name="default">

		
	     «FOR f:e.bcoolflow»
	     	<qvto:transformation uri="platform:/resource/org.gemoc.bcool.example.productfumlandtfsm/gemoc-gen/SyncProductTfsmwithfUML.qvto">
	     	<configProperty name="ApplyAll" value="false"/>
	     	<configProperty name="Is«f.oper»Executed" value="true"/>
       		 «f.compile»
	     	<inout uri="«e.outputtimemodel»" outuri="«e.outputtimemodel»"/>
	     	</qvto:transformation>
         «ENDFOR»
         
    </target>
</project>
'''

def compile(Flows f) '''
«var i=0»
         «FOR e:f.params»
         	<in uri="«e.modeluri»"/>
         	<configProperty name="inM«i=i+1»MoCCPath" value="«e.timemodel»"/>
         «ENDFOR»
'''
}
