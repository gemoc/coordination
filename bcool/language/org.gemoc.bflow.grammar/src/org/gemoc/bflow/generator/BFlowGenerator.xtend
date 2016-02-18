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
	var String output = ""
	
	for(e: resource.allContents.toIterable.filter(Model)) {
		if (e.outputtimemodel.nullOrEmpty) {
    	for(l: e.launchers) {
    		output += l.launcherURI.substring(l.launcherURI.lastIndexOf("/")+1)
			}
		output = "./" + output + ".timemodel"}
		else {output = e.outputtimemodel}
	}
	
    for(e: resource.allContents.toIterable.filter(Model)) {
      fsa.generateFile(
        "../gemoc-gen/"+e.name  + ".xml",
        e.compile(output))
	}
}

def compile(Model e, String output) '''
<?xml version="1.0" encoding="UTF-8"?>
<project name="«e.name»" default="default" xmlns:qvto="http://www.eclipse.org/qvt/1.0.0/Operational">
<target name="default">


	«var transfo = e.importURI»
	«var bcoolfilename = e.importURI.substring(e.importURI.lastIndexOf("/")+1,e.importURI.lastIndexOf(".bcool"))»
	
	«var outputmodel = output»
	
	    <qvto:transformation
        uri="platform:/plugin/org.gemoc.bflow.grammar/qvto-helper/createTimeModel.qvto"
        >
    
        <out
            uri="«outputmodel»"
        />
    	
    	<configProperty
        name="nameCCSLSpec"
        value="«e.name»"
    	
    	 />
    </qvto:transformation>
	
	     «FOR f:e.bcoolflow»
	     	«IF transfo.startsWith("platform:/resource")» 
	     	   <qvto:transformation uri="«transfo.substring (0,transfo.indexOf("/", ("platform:/resource/").length)) + "/gemoc-gen/" + bcoolfilename + ".qvto"»">
	     	«ELSEIF transfo.startsWith("platform:/plugin")»
	     		<qvto:transformation uri="«transfo.substring (0,transfo.indexOf("/", ("platform:/plugin/").length)) + "/gemoc-gen/" + bcoolfilename  + ".qvto"»">
	     	«ELSE»
	     		<qvto:transformation uri="«bcoolfilename  + ".qvto"»">
	     	«ENDIF»
	     	<configProperty name="ApplyAll" value="false"/>
	     	«IF f == e.bcoolflow.get(0)» 
	     		<configProperty name="IsInvokedfromAnt" value="true"/>
	     	«ENDIF»
	     	<configProperty name="Is«f.oper»Executed" value="true"/>
       		 «f.compile»
	     	<inout uri="«outputmodel»" outuri="«outputmodel»"/>
	     	</qvto:transformation>
         «ENDFOR»
         
    </target>
</project>
'''

def compile(Flows f) '''
«var i=0»
         «FOR e:f.params»
         	<in uri="«e.modeluri»"/>
         	«var timemodel = e.modeluri.substring (0,e.modeluri.indexOf("/", ("platform:/resource/").length))+ "/gemoc-gen/"+ e.modeluri.substring (e.modeluri.lastIndexOf("/")+1,e.modeluri.lastIndexOf(".")) + ".timemodel"»
         	<configProperty name="inM«i=i+1»MoCCPath" value="«timemodel»"/>
         «ENDFOR»
'''
}
