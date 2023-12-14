
package fes.aragon.inicio;

import java.io.File;


public class PruebasFile {
    public static void main(String[] args) {
        File archivo = new File(System.getProperty("user.dir"));
        System.out.println(archivo.getAbsoluteFile());
    }
}
