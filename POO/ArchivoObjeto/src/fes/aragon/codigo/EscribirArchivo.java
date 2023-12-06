
package fes.aragon.codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class EscribirArchivo {
    public static void main (String[] args) {
		FileOutputStream fw = null;
	try {
		File f = new File(System.getProperty("user.dir")+"/archivo");
		fw = new FileOutputStream (f);
		ObjectOutput os = new ObjectOutputStream (fw) {};
		os.writeObject (new Persona ("n1", "p1", "m1", 22));
		os.writeObject (new Persona ("n2", "p2", "m2", 25));
		os.writeObject (new Persona ("n3", "p3", "m3", 12));
	}
//Sorround Black try-catch// 
        catch(FileNotFoundException ex) {
		ex.printStackTrace();
	}
//Add catch Clause//
	catch (IOException ex) {
		ex.printStackTrace();
	
	} finally {
		try{
			fw.close();
		}
			catch (IOException ex) {
				ex.printStackTrace();
			}
	}
}	
}
