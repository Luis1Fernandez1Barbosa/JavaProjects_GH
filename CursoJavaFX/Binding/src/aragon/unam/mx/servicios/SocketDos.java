package aragon.unam.mx.servicios;
import javafx.beans.value.ObservableValue;

public class SocketDos {
	public static void mensajeSocket(ObservableValue<? extends Number> evt, Number viejoDato, Number nuevoDato) {
		System.out.println("Valor nuevo: " + nuevoDato);
	}

	public static void mensajeSocketGeneral(ObservableValue<? extends Object> evt, Object viejoDato, Object nuevoDato) {
		System.out.println("Valor nuevo: " + nuevoDato);
	}
}
