package aragon.unam.mx.modelo;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona {
	private final StringProperty nombre=new SimpleStringProperty();
	private final FloatProperty salario=new SimpleFloatProperty();
	
	public final StringProperty nombreProperty() {
		return nombre;
	}
	public final FloatProperty salarioProperty() {
		return salario;
	}
	

}
