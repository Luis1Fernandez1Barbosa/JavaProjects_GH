package aragon.unam.mx.repositorio;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class BaseDeDatosDos<T> implements ChangeListener<T> {
	@Override
	public void changed(ObservableValue<? extends T> obs, T oldObject, T newObject) {
		// TODO Auto-generated method stub
		System.out.println("Nuevo dato: " + newObject);
	}
}