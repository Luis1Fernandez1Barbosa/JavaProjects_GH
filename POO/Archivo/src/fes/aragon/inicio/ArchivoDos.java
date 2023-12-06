package fes.aragon.inicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoDos {

    public static void main(String[] arg) {
        FileWriter fw = null;
        try {
            File f = new File(System.getProperty("user.dir" + "/perro"));
            fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Quiere que le ayude en algo");
            pw.println("32");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoDos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(ArchivoDos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
