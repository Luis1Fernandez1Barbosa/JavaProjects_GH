/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Libro;
import fes.aragon.codigo.Lista;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin01
 */
public class Inicio {

    public static void main(String[] args) throws IOException {

        Libro iniReg = new Libro();
        Lista opcion = new Lista();
      

        String s = JOptionPane.showInputDialog("¿Qué desea hacer?\n\n"+
                "Iniciar Registro-(1)\n" + "Menú de opciones-(2)\n");
        int opc = Integer.parseInt(s);
        switch (opc) {
            case 1:
                opc = 1;
                iniReg.crea();
                iniReg.guardar();
                iniReg.archivo();
                break;
            case 2:
                opc = 2;
                opcion.Opciones();
                opcion.Elección(iniReg, opc);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Caracter incorrecto","¡¡ERROR!!",JOptionPane.WARNING_MESSAGE);
        }
    }
}
