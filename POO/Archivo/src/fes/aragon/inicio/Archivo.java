package fes.aragon.inicio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Archivo {
public static void main(String[]args) {
    FileReader fr= null;
    try {
        File f= new File(System.getProperty("user.dir"+"/perro"));
        fr = new FileReader(f);
        BufferedReader fb= new BufferedReader (fr);
        String cad= "";
        while ((cad=fb.readLine()) !=null);
        System.out.println("cad");
        ex.printStackTrace ();
    } catch (FileNotFoundException ex) {
         } catch (IOException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            fr.close();
        } catch (IOException ex) {
          }
    }
}
}
