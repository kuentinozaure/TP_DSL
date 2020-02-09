package fsm.aspects;

import com.google.common.base.Objects;
import com.m1ice.fsm.FSM;
import com.m1ice.fsm.FinalState;
import com.m1ice.fsm.InitialState;
import com.m1ice.fsm.State;
import com.m1ice.fsm.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fsm.aspects.FSMAspectFSMAspectProperties;
import java.util.Scanner;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  @Step
  public static void execute(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof com.m1ice.fsm.FSM){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fsm.aspects.FSMAspect._privk3_execute(_self_, (com.m1ice.fsm.FSM)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "FSM", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  /**
   * permet de changer d'etat en passant par la transition
   */
  public static State changeState(final FSM _self, final State current, final String trigger) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State changeState(State,String)
    if (_self instanceof com.m1ice.fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_changeState(_self_, (com.m1ice.fsm.FSM)_self,current,trigger);
    };
    return (com.m1ice.fsm.State)result;
  }
  
  /**
   * permet d 'avoir l'etat de depart
   */
  public static State getInitialState(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State getInitialState()
    if (_self instanceof com.m1ice.fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_getInitialState(_self_, (com.m1ice.fsm.FSM)_self);
    };
    return (com.m1ice.fsm.State)result;
  }
  
  /**
   * permet d'avoir l'etat final
   */
  public static State getFinalState(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State getFinalState()
    if (_self instanceof com.m1ice.fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_getFinalState(_self_, (com.m1ice.fsm.FSM)_self);
    };
    return (com.m1ice.fsm.State)result;
  }
  
  protected static void _privk3_execute(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    Scanner scan = new Scanner(System.in);
    String declencheur = "";
    State currentState = FSMAspect.getInitialState(_self);
    State finalState = FSMAspect.getFinalState(_self);
    String _name = currentState.getName();
    String _plus = ("state initial est  : " + _name);
    InputOutput.<String>println(_plus);
    String _name_1 = finalState.getName();
    String _plus_1 = ("State final est : " + _name_1);
    InputOutput.<String>println(_plus_1);
    while ((!Objects.equal(currentState.getName(), finalState.getName()))) {
      {
        declencheur = scan.nextLine();
        State nextState = FSMAspect.changeState(_self, currentState, declencheur);
        if ((nextState != null)) {
          currentState = null;
          InputOutput.<String>println("changement de state");
          currentState = nextState;
        }
        String _name_2 = currentState.getName();
        String _plus_2 = ("Le nouveau step est : " + _name_2);
        InputOutput.<String>println(_plus_2);
      }
    }
    InputOutput.<String>println("Dernier state atteint");
  }
  
  protected static State _privk3_changeState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State current, final String trigger) {
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      return Boolean.valueOf((t.getStateStart().getName().equals(current.getName()) && t.getStateEnd().equals(trigger)));
    };
    Transition transition = IterableExtensions.<Transition>findFirst(_self.getTransition(), _function);
    if ((transition != null)) {
      return transition.getStateEnd();
    }
    return null;
  }
  
  protected static State _privk3_getInitialState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    final Function1<State, Boolean> _function = (State s) -> {
      return Boolean.valueOf((s instanceof InitialState));
    };
    return IterableExtensions.<State>findFirst(_self.getState(), _function);
  }
  
  protected static State _privk3_getFinalState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    final Function1<State, Boolean> _function = (State s) -> {
      return Boolean.valueOf((s instanceof FinalState));
    };
    return IterableExtensions.<State>findFirst(_self.getState(), _function);
  }
}
