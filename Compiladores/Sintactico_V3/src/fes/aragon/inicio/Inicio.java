/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.ErrorSintactico;
import fes.aragon.codigo.Lexico;
import fes.aragon.codigo.Sym;
import fes.aragon.codigo.Tokens;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MASH
 */
public class Inicio {
	private Tokens tokens = null;
	private Lexico analizador = null;

	public static void main(String[] args) {
		Inicio ap = new Inicio();
		BufferedReader buf;
		try {
			buf = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/archivo.txt"));
			ap.analizador = new Lexico(buf);
			ap.siguienteToken();
			do {
				try {
					ap.S();
				} catch (ErrorSintactico e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					ap.siguienteToken();
				}
			} while (ap.tokens.getLexema() != Sym.EOF);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void S() throws ErrorSintactico {
		E();
		if (tokens.getLexema() != Sym.PUNTOCOMA) {
			throw new ErrorSintactico("Error sintactico linea: " + (tokens.getLinea() + 1));
		} else {
			System.out.println("Linea correcta " + (tokens.getLinea() + 1));
			siguienteToken();
		}
	}

	private void E() throws ErrorSintactico {
		if (tokens.getLexema() == Sym.NUM)
			if(tokens.getLexema()!=Sym.PUNTOCOMA) {
				siguienteToken();
				X();
		}	else {
				S();
		}
	}

	private void X() throws ErrorSintactico {
		if (tokens.getLexema() == Sym.MEN | tokens.getLexema() == Sym.MAS | tokens.getLexema() == Sym.DIV
				| tokens.getLexema() == Sym.POR) {
			siguienteToken();
			E();
			X();
		}
	}

	private void siguienteToken() {
		try {
			tokens = analizador.yylex();
			if (tokens == null) {
				tokens = new Tokens("EOF", Sym.EOF, 0, 0);
				throw new IOException("Fin Archivo");
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
