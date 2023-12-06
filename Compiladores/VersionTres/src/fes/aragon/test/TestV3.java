//Version 3--------0*11(0|1)*
package fes.aragon.test;

import java.io.IOException;
import java.util.ArrayList;

import fes.aragon.utilerias.Conjunto;
import fes.aragon.utilerias.ErrorLexico;
import fes.aragon.utilerias.Herramientas;

public class TestV3 {
	public static void main(String[] args) {
		int estado = 0;
		int linea = 0;
		char simbolo = ' ';
		Herramientas hr = new Herramientas();
		ArrayList<String> lineas = null;
		int[][] tabla = { { 1, 0, 0 }, { 1, 2, 0 }, { 2, 2, 1 } };
		int entrada = 0;
		char fc = ';';
		boolean finDeCadena = false;

		try {
			lineas = hr.lectura();
			for (int i = 0; i < lineas.size(); i++) {
				System.out.println(lineas.get(i));
				hr.setPalabra(lineas.get(i));
				try {
					do {
						simbolo = hr.siguienteCaracter();
						if (Conjunto.enteroCero(simbolo)) {
							entrada = 0;
						}else if (Conjunto.enteroUno(simbolo)){
							entrada = 1;
						} else if (simbolo == fc) {
							entrada = 2;
							finDeCadena = true;
						} else {
							throw new ErrorLexico("Error, símbolo no reconocido: " + (linea + 2));
						}
						estado = tabla[estado][entrada];
						if (!finDeCadena && estado == 0) {
							throw new ErrorLexico("Error, símbolo no reconocido: " + (linea + 2));
						}
					} while (!finDeCadena && estado != 1);
				} catch (ErrorLexico ex) {
					// ex.printStackTrace ();
				}
				linea = i;
				if (finDeCadena && estado == 1) {
					System.out.println("Palabra valida " + (linea + 1));
				} else {
					System.out.println("Palabra no valida " + (linea + 1));
				}
				estado = 0;
				simbolo = ' ';
				finDeCadena = false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}