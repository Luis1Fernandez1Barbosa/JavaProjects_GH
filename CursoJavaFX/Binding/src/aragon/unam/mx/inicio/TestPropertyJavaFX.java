package aragon.unam.mx.inicio;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;

public class TestPropertyJavaFX {
	public static void main(String[] args) {
		IntegerProperty dato = new SimpleIntegerProperty(20);
		int valor = dato.getValue();
		System.out.println("Valor: " + valor);
		dato.set(100);
		valor = dato.get();
		System.out.println("-------");
		System.out.println("Valor: " + valor);
		System.out.println("***********");
		ReadOnlyIntegerWrapper datoDos = new ReadOnlyIntegerWrapper(200);
		ReadOnlyIntegerProperty valorDos = datoDos.getReadOnlyProperty();
		System.out.println("ValorDos: " + valorDos.get());
		datoDos.set(400);
		System.out.println("-----------");
		System.out.println("ValorDos: " + valorDos.get());
		// querer cambiar el valor de valorDos valorDos.add(10);
		System.out.println("-----------");
		System.out.println("ValorDos: " + valorDos.get());
	}
}