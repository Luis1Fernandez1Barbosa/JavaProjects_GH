/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista {

    boolean rep = true;
    String valor;
    String dato = "";
    ArrayList<String> list = new ArrayList<String>();
    Scanner guardar = new Scanner(System.in);
    int i;

    public void guardar() {
        valor = guardar.next();
        valor = valor + "\t";
        dato = dato + valor.toUpperCase();
    }

    public void archivo() {

        BufferedWriter bw = null;
        FileWriter fw = null;
        File arch = new File("registroalumno.xls");
        String enc = "Clave\tA.Paterno\tA.Materno\tNombre\tNo.Cuenta\tCarrera\tSemestre\tEscuela";
        
        /*try {
            fw = new FileWriter(arch);
            bw = new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.println(enc);
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
         }*/
        try {
            fw = new FileWriter(arch);
            bw = new BufferedWriter(fw);
            PrintWriter escribir1 = new PrintWriter(bw);
            escribir1.println(enc);
            PrintWriter escribir = new PrintWriter(bw);

            for (int i = 0; i < list.size(); i++) {
                escribir.append(i + "\t" + list.get(i) + "\n");
            }
            //fw=new FileWriter(file.getAbsoluteFile(),true);

            escribir.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error al guardar");
        }
    }

    public void crea() {
        System.out.println("¡¡RELLENAR SIN ESPACIOS!!\n ");
        do {
            System.out.println("Apellido Paterno: ");
            guardar();
            System.out.println("Apellido Materno: ");
            guardar();
            System.out.println("Nombre (ej. Jose Juan Pedro=JoseJuanPedro): ");
            guardar();
            System.out.println("Numero de cuenta: ");
            guardar();
            System.out.println("Clave de carrera: ");
            guardar();
            System.out.println("Semestre: ");
            guardar();
            System.out.println("Clave de la escuela: ");
            guardar();

            list.add(dato);
            dato = "";
            System.out.println("Agregar otro registro? \nSi (enter 1)  |  No (enter 2)\t");

            if (guardar.nextInt() == 2) {
                System.out.println("\nFin de Lista\n" + "Salir(enter 2)");
                rep = false;
            }
        } while (rep == true);

        archivo();
    }
}
