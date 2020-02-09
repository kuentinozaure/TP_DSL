package fsm.aspects;

import com.m1ice.fsm.FSM;
import com.m1ice.fsm.FsmPackage;
import fsm.aspects.FSMAspect;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class Interpreter {
  public static void main(final String[] args) {
    FsmPackage.eINSTANCE.getClass();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Resource resource = new ResourceSetImpl().getResource(URI.createURI("C:/gemoc/workspace/com.m1ice.fsm/model/FSM"), true);
    EObject _get = resource.getContents().get(0);
    FSM myFsm = ((FSM) _get);
    FSMAspect.execute(myFsm);
  }
}
