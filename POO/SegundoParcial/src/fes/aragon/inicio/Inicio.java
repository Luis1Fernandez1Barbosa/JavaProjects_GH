
package fes.aragon.inicio;
import fes.aragon.codigo.Lamina;
import fes.aragon.codigo.Marco;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
public class Inicio {
    public static void main(String[] args) throws IOException {
        Marco app=new Marco();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);       
        FileOutputStream fw = null;
	try {
		File f = new File(System.getProperty("user.dir")+"/archivo");
		fw = new FileOutputStream (f);
		ObjectOutput os = new ObjectOutputStream (fw);
		os.writeObject (new Lamina());
		os.writeObject (new Lamina());
		os.writeObject (new Lamina());
	}
        catch(FileNotFoundException ex) {
		ex.printStackTrace();
	}
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
    public Inicio() {
    }
}