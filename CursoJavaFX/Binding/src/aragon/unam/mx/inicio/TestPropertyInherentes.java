package aragon.unam.mx.inicio;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class TestPropertyInherentes {
	public static void main(String[] args) {
		IntegerProperty x = new SimpleIntegerProperty(10);
		IntegerProperty y = new SimpleIntegerProperty(40);
		IntegerProperty z = new SimpleIntegerProperty(100);
		// unidireccional
		z.bind(x.add(y));
		System.out.println("Valor z: " + z.get());
		x.set(20);
		System.out.println("Valor z: " + z.get());
		y.set(5);
		System.out.println("Valor z: " + z.get());
		// querer cambiar el valor
		// error porque es unidireccional
		// z.set(10);
		// System.out.println("Valor z: "+z.get());
		// rompemos el enlace
		z.unbind();
		System.out.println("Valor z: " + z.get());
		z.set(10);
		System.out.println("Valor z: " + z.get());
	}
}