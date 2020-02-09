package fsm.aspects;

import com.m1ice.fsm.FinalState;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.aspects.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
