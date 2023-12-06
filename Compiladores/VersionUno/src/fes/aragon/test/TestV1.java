//Version 1--------- (z|h|a)*(z|a) LAFB2000
package fes.aragon.test;

import java.io.IOException;
import java.util.ArrayList;

import fes.aragon.utilerias.Conjunto;
import fes.aragon.utilerias.ErrorLexico;
import fes.aragon.utilerias.Herramientas;

public class TestV1 {
	public static void main(String[] args) {
		int estado = 0;
		int linea = 0;
		char simbolo = ' ';
		Herramientas hr = new Herramientas();
		ArrayList<String> lineas = null;
		try {
			lineas = hr.lectura();
			for (int i = 0; i < lineas.size(); i++) {
				System.out.println(lineas.get(i));
				hr.setPalabra(lineas.get(i));
				simbolo = hr.siguienteCaracter();
				try {
					while (simbolo != ';') {
						switch (estado) {
						case 0:
							if (Conjunto.letraA(simbolo)||Conjunto.letraZ(simbolo)) {
								estado = 1;
							} else if (Conjunto.letraH(simbolo)){
								estado= 0; 
							} else {
								throw new ErrorLexico("Caracter no valido, linea = "+(linea + 2));
							}
							break;
						case 1:
							if (Conjunto.letraA(simbolo)||Conjunto.letraZ(simbolo)) {
								estado = 1;
							}  else if (Conjunto.letraH(simbolo)){
								estado= 0;
							} else {
								throw new ErrorLexico("Caracter no valido, linea = " + (linea + 2));
						}
							break;
							}
						simbolo = hr.siguienteCaracter();
					}
				} catch (ErrorLexico ex) {
				 //ex.printStackTrace ();
				}
				linea = i;
				if (estado==0) {	
					System.out.println("Palabra no valida " + (linea + 1));
				} else {
					System.out.println("Palabra valida " + (linea + 1));
				}
				estado = 0;
				simbolo = ' ';
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}