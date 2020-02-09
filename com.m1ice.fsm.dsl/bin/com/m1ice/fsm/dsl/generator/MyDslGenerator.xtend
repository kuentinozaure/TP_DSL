/*
 * generated by Xtext 2.14.0
 */
package com.m1ice.fsm.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.m1ice.fsm.FSM
import com.m1ice.fsm.State
import com.m1ice.fsm.InitialState
import com.m1ice.fsm.FinalState
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var myFsm = resource.contents.get(0) as FSM
		
		var sourceToTarget = getSrcToTarget(myFsm);
		
		//fsa.generateFile(generateNameJavaClass(myFsm.name), myFsm.state.forEach[e | generateAllVariableJavaClass(e)])
		// myFsm.state.forEach[e | fsa.generateAllVariableJavaClass(e)]
		//myFsm.state.forEach[e | fsa.generateFile(e.name.toUpperCase+".java",generateJavaHelloWorld(e.name))]
		
		fsa.generateFile(myFsm.name + ".java", genrateMainClass(myFsm,sourceToTarget));
	}
	
	
	def private HashMap<String,String> getSrcToTarget(FSM fsm){
		val result = new HashMap<String, String >()
		fsm.transition.forEach[t | result.put(t.stateStart.name , t.stateEnd.name)]
		return result
	}
	
		def private String genrateMainClass (FSM fsm, HashMap<String, String> sourceToTarget){
		'''
		public class � fsm.name� {
			static String name = "� fsm.name�" ;
			static String initState = "� fsm.state.get(0).name�";
			static String currentState = initState	;
			public static void main(String [] args){
				while(true){					
					switch (currentState){
					�FOR k : sourceToTarget.keySet()�
						case "� k�" : 
							System.out.println("go from �k� to � sourceToTarget.get(k)�");
							currentState = "� sourceToTarget.get(k)�";
							break;
					�ENDFOR�
					}
				}
			}
		}
		'''
	}
	
	
}