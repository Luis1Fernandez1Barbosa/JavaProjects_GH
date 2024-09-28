package aragon.unam.mx.inicio;

import aragon.unam.mx.modelo.EmpleadoJavaFX;
import aragon.unam.mx.repositorio.BaseDeDatosDos;
import aragon.unam.mx.servicios.SocketDos;
import javafx.beans.value.ChangeListener;

public class TestPropertyJavaFXDos {
	public static void main(String[] args) {
		EmpleadoJavaFX datos = new EmpleadoJavaFX("FES", 23.4);
		datos.nombreProperty().set("Aragon");
		datos.salarioProperty().addListener(SocketDos::mensajeSocket);
		datos.setSalario(40.3);
		datos.setSalario(10.3);
		ChangeListener oyenteCero = SocketDos::mensajeSocketGeneral;
		datos.nombreProperty().addListener(oyenteCero);
		datos.setNombre("FES");
		BaseDeDatosDos oyenteNuevo = new BaseDeDatosDos();
		datos.nombreProperty().addListener(oyenteNuevo);
		datos.setNombre("FES ARAGON"); 
		// remover un listener 
		datos.nombreProperty().removeListener(oyenteNuevo);
		datos.setNombre("FES ARAGON es lo mejor");
		// no hay referencia
		datos.nombreProperty().removeListener(oyenteCero);
		datos.setNombre("FES ARAGON es lo mejor, por siempre");
	}
}