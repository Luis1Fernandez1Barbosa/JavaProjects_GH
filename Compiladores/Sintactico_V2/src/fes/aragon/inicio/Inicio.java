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
            buf = new BufferedReader(
                    new FileReader(System.getProperty("user.dir")
                            + "/archivo.txt"));
            ap.analizador = new Lexico(buf);
            ap.siguienteToken();
            do {
            	try {
            		ap.S();} 
            	catch (ErrorSintactico e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();	
            	ap.siguienteToken();
            	}
            } while (ap.tokens.getLexema() != Sym.EOF);
               
        } catch (IOException e) {
            //e.printStackTrace();
    }}
    
    private void S() throws ErrorSintactico {
    	E();
    	if(tokens.getLexema()!=Sym.PUNTOCOMA) {
    		throw new ErrorSintactico("Error sintactico linea: " + (tokens.getLinea()));
    	}else {
    		System.out.println("Linea correcta "+(tokens.getLinea()+1));
    		siguienteToken();
    	}
    }
    private void E() throws ErrorSintactico {
    	T();
    	if(tokens.getLexema()==Sym.OR) {
    		siguienteToken();
    		E();
    	}
    }
    private void T() throws ErrorSintactico {
    	F();
    	if(tokens.getLexema()==Sym.AND) {
    		siguienteToken();
    		T();
    }
}
    private void F() throws ErrorSintactico {
    	if(tokens.getLexema()==Sym.NOT) {
    		siguienteToken();
    		F();
    	}else if((tokens.getLexema()==Sym.TRUE) || (tokens.getLexema()==Sym.FALSE)) {
    		siguienteToken();
    	}else if(tokens.getLexema()==Sym.PARA) {
    		siguienteToken();
    		E();
    		if(tokens.getLexema()==Sym.PARC) {
    			siguienteToken();
    		}
    		else if(tokens.getLexema()!=Sym.EOF) {
        		siguienteToken();}
    	}else {
    		throw new ErrorSintactico("Error sintactico en linea: " + (tokens.getLinea()));
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
