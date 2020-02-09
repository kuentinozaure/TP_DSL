package fsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import com.m1ice.fsm.FSM
import com.m1ice.fsm.State
import com.m1ice.fsm.Transition
import com.m1ice.fsm.InitialState
import com.m1ice.fsm.FinalState

import static extension fsm.aspects.FSMAspect.*
import static extension fsm.aspects.StateAspect.*
import static extension fsm.aspects.TransitionAspect.*
import static extension fsm.aspects.InitialStateAspect.*
import static extension fsm.aspects.FinalStateAspect.*
import com.sun.org.apache.bcel.internal.generic.FMUL
import com.m1ice.fsm.FsmPackage
import com.sun.prism.ResourceFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.Scanner

class Interpreter {
	def static void main(String[] args){
		FsmPackage.eINSTANCE.class
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		var Resource resource =  new ResourceSetImpl().getResource(URI.createURI('C:/gemoc/workspace/com.m1ice.fsm/model/FSM'),true)
		var myFsm = resource.contents.get(0) as FSM
		myFsm.execute
		 
	}
}

@Aspect(className=FSM)
class FSMAspect {
	@Step
	def public void execute(){
		var Scanner scan = new Scanner (System.in)
		var declencheur = ""
		var currentState = getInitialState(_self)
		var finalState = getFinalState(_self)
		
		println('state initial est  : ' + currentState.name)
		println('State final est : '+finalState.name)
		
		while(currentState.name != finalState.name) {
			declencheur = scan.nextLine()
			var nextState = changeState(_self,currentState,declencheur)
			if (nextState !== null) {
				currentState = null
				
				println("changement de state")
				
				currentState = nextState
			}
			println("Le nouveau step est : "+currentState.name)
		}
		println("Dernier state atteint")
	}
	
	
	/*
	 * permet de changer d'etat en passant par la transition
	 */
	def State changeState (State current, String trigger){
		var transition =  _self.transition.findFirst[ t | t.stateStart.name.equals(current.name) && t.stateEnd.equals(trigger)]
		if(transition !== null ){
			return transition.stateEnd
		}
		return null
	}
	
	/*
	 * permet d 'avoir l'etat de depart
	 */
	def State getInitialState() {
		return _self.state.findFirst[s | s instanceof InitialState]
	}
		
	/*
	 * permet d'avoir l'etat final
	 */
	def State getFinalState() {
		return _self.state.findFirst[s | s instanceof FinalState]
	}

}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=InitialState)
class InitialStateAspect extends StateAspect {

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

}



