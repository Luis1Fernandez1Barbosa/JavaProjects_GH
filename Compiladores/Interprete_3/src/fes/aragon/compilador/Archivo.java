package fes.aragon.compilador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

public class Archivo {
	private File archivo;
	
	public Archivo(File archivo) {
		super();
		this.archivo = archivo;
	}
	
	public void escribir(ArrayList<String> dato, boolean borrar) {
		Writer fw=null;
		try {
		if(borrar) {
			fw=new FileWriter(archivo.getAbsoluteFile(),true);
		}else {
			fw=new FileWriter(archivo.getAbsoluteFile(),false);
		}
		PrintWriter salida=new PrintWriter(fw);
		Iterator it=dato.iterator();
		while(it.hasNext())
			salida.print(it.next()+"\n");
		salida.close();
		fw.close();
	} catch (IOException ex) {
		ex.printStackTrace();
	}finally {
		try {
			fw.close();
		}catch (IOException ex) {
			ex.printStackTrace();
	}
}
}
}