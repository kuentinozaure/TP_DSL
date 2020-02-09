package fsm.aspects;

import com.m1ice.fsm.State;
import fsm.aspects.StateAspectStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public final static StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.aspects.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<com.m1ice.fsm.State, fsm.aspects.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
