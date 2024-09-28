/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import fes.aragon.codigo.Libro;

/**
 *
 * @author Admin01
 */
public class Archivo {

    boolean rep = true;
    String valor;
    String dato = "";
    ArrayList<String> list = new ArrayList<String>();
    Scanner guardar = new Scanner(System.in);
    int i;
    Libro aut=new Libro();
    
    public void guardar() {
        valor = guardar.next();
        valor = valor + "\t";
        dato = dato + valor.toUpperCase();
    }

    public void archivo() {

        BufferedWriter bw = null;
        FileWriter fw = null;
        BufferedWriter bw1 = null;
        FileWriter fw1 = null;
        File arch = new File("registroalumno.xls");
        String enc = "Clave\tA.Paterno\tA.Materno\tNombre\tNo.Cuenta\tCarrera\tSemestre\tEscuela";
        
        try {
            fw = new FileWriter(arch);
            bw = new BufferedWriter(fw);
            PrintWriter escribir1 = new PrintWriter(bw);
            escribir1.println(enc);
            fw1=new FileWriter(arch.getAbsoluteFile(),true);
            bw1=new BufferedWriter(fw1);
            PrintWriter escribir = new PrintWriter(bw1);
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
        //System.out.println("¡¡RELLENAR SIN ESPACIOS!!\n ");
        do {
            String ttulo=JOptionPane.showInputDialog(null,"Apellido Paterno: ");
            guardar();
            JOptionPane.showInputDialog(null,"Apellido Materno: ");
            guardar();
            JOptionPane.showInputDialog("Nombre (ej. Jose Juan Pedro=JoseJuanPedro): ");
            guardar();
            JOptionPane.showInputDialog("Numero de cuenta: ");
            guardar();
            JOptionPane.showInputDialog("Clave de carrera: ");
            guardar();
            JOptionPane.showInputDialog("Semestre: ");
            guardar();
            JOptionPane.showInputDialog("Clave de la escuela: ");
            guardar();

            list.add(dato);
            dato = "";
            int reg=JOptionPane.showConfirmDialog(null,"Agregar otro registro? \nSi (enter 1)  |  No (enter 2)\t","#",
                    JOptionPane.YES_NO_OPTION);

            if(JOptionPane.OK_OPTION==reg){
                JOptionPane.showMessageDialog(null,"\nFin de Lista\n" + "Salir(enter 2)");
                rep = false;
            
            }}
            while (rep == true);
            /*if (guardar.nextInt() == 2) {
                JOptionPane.showMessageDialog(null,"\nFin de Lista\n" + "Salir(enter 2)");
                rep = false;
            }
        } while (rep == true);*/

           archivo();
    }
}   