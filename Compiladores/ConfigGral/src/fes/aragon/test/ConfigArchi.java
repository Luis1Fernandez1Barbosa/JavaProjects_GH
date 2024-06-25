package fes.aragon.test;

import java.util.ArrayList;

import fes.aragon.utilerias.*;

public class ConfigArchi {
	ConfigArchi app = new ConfigArchi();
	private ArrayList<String> lineas;
	private String[] AFD = null;
	private int Tabla[][];
	private int fila = 0;
	private int colum = 0;

	public static void main(String[] args) {
		try {
		lineas=app.lectura;
		String cadena=app.lineas.get(0);
		String[] div=cadenas.split('');
		app.fila=Integer.parseInt(div[0]);
		app.colum=Integer.parseInt(div[1]);

		//columna
	cadenas=app.lineas.get(1);
	app.AFD=cadenas.split(' ');
	app.tabla=new int[app.fila][app.colum];
	for (int i=2; i<=app.fila+1; i++) {
		cadena=app.lineas.get(i);
		div=cadena.split("");
			for (int j=0; j<div.length; j++) {
				app.tabla[filaTabla][columTabla]=Integer.parseInt(div[j]);
			}
			filaTabla++:
			columTabla=0;
	}
	//salida
	print(app.fila,app.colum);
		for (i=0; i=AFD; i++) {
			print(app.AFD[i]+("");
			for(fila);
					for(colum;)
			print(tabla[i][j]);
		}
	}	
	}
}