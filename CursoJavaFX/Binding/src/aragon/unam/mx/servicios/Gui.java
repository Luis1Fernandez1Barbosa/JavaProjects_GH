package aragon.unam.mx.servicios;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Gui implements PropertyChangeListener {
	@Override 
	public void propertyChange(PropertyChangeEvent evt) { 
		String mensaje=evt.getPropertyName(); 
		if("cambio".equals(mensaje)){ 
			System.out.println("Dato anterior: "+(Double)evt.getOldValue()); 
			System.out.println("Dato nuevo: "+(Double)evt.getNewValue()); 
			System.out.println("C�digo para actualizar GUI"); } }
}
