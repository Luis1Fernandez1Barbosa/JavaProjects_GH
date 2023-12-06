//Version 1--------- (z|h|a)*(z|a)
package fes.aragon.test;
import java.io.IOException;
import java.util.ArrayList;
import fes.aragon.utilerias.Conjunto;
import fes.aragon.utilerias.ErrorLexico;
import fes.aragon.utilerias.Herramientas;

public class Test3 {
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
							if (Conjunto.letra(simbolo)) {
								estado = 2;
							} else if(Conjunto.entero(simbolo)) {
								estado = 1;
							} else {
								throw new ErrorLexico("Caracter no valido, linea = "+(linea + 2));
							}
							break;
						case 1:
							if (Conjunto.letra(simbolo) || Conjunto.entero(simbolo)) {
								estado = 1;
							} else {
								throw new ErrorLexico("Caracter no valido, linea = " + (linea + 2));
							}
							break;
						case 2:
							if (Conjunto.letra(simbolo) || Conjunto.entero(simbolo)) {
								estado = 2;
							} else {
								estado=1;
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
				if (estado == 0 || estado==1) {	
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