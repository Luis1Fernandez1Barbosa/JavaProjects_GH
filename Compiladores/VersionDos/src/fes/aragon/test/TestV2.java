//Version 2--------------(011*|11)*0*
package fes.aragon.test;

import java.io.IOException;
import java.util.ArrayList;

import fes.aragon.utilerias.Herramientas;

public class TestV2 {
	private final int aceptado = 1;
	private final int error = 2;
	Herramientas hr = new Herramientas();

	public static void main(String[] args) {
		ArrayList<String> lineas = null;
		TestV2 app = new TestV2();
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
		case '0':
			return estado_A1();
		case '1':
			return estado_A2();
		default:
			return error;
		}
	}

	private int estado_A1() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case '0':
			return error;
		case '1':
			return estado_A2();
		default:
			return error;
		}
	}
	
	private int estado_A2() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case '0':
			return error;
		case '1':
			return estado_B();
		default:
			return error;
		}
	}
	
	private int estado_B() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case '0':
			return estado_C();
		case '1':
			return estado_C();
		default:
			return error;
		}
	}

	private int estado_C() {
		char c = hr.siguienteCaracter();
		switch (c) {
		case '0':
			return estado_C();
		case '1':
			return estado_C();
		case ';':
			return aceptado;
		default:
			return error;
		}
	}
}