package fes.aragon.tokens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestLexico {
	public static void main(String[] args) {
		try {
			Reader rd= new BufferedReader(new FileReader("fuenteLex"));
			Lexico lexico=new Lexico(rd);
			Tokens resultado;
			do {
				resultado=lexico.yylex();
				System.out.println(resultado);
				System.out.println(lexico.lexema+ "Lexema");
			}while(resultado !=null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
