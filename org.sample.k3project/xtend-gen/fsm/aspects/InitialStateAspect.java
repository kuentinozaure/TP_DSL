package fsm.aspects;

import com.m1ice.fsm.InitialState;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.aspects.StateAspect;

@Aspect(className = InitialState.class)
@SuppressWarnings("all")
public class InitialStateAspect extends StateAspect {
}
