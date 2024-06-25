//Version 2--------------(011*|11)*0*
package fes.aragon.test;

import java.io.IOException;
import java.util.ArrayList;
import fes.aragon.utilerias.Herramientas;

public class TestDos {
	private final int aceptado = 1;
	private final int error = 2;
	Herramientas hr = new Herramientas();

	public static void main(String[] args) {
		ArrayList<String> lineas = null;
		TestDos app = new TestDos();
		try {
			lineas = app.hr.lectura();
			for (int i = 0; i < lineas.size(); i++) {
				System.out.println(lineas.get(i));
				app.hr.setPalabra(lineas.get(i));
				int valor = app.estado_A();
				if(valor==app.aceptado) {
					System.out.println("Palabra Valida");
				}else {
					System.out.println("Palabra No Valida");
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int estado_A() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case 'a':
			return estado_B();
		case 'b':
			return estado_C();
		default:
			return error;
		}
	}

	private int estado_B() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case 'a':
			return estado_B();
		case 'b':
			return estado_D();
		default:
			return error;
		}
	}

	private int estado_C() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case 'a':
			return estado_B();
		case 'b':
			return estado_C();
		default:
			return error;
		}
	}

	private int estado_D() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case 'a':
			return estado_B();
		case 'b':
			return estado_E();
		default:
			return error;
		}
	}

	private int estado_E() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case 'a':
			return estado_B();
		case 'b':
			return estado_C();
		case ';':
			return aceptado;
		default:
			return error;
		}
	}
}