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
import javax.swing.JOptionPane;

/**
 *
 * @author Admin01
 */
public class Libro {

    private String aPaterno;
    private String aMaterno;
    private String nombre, nCuenta, cCarrera, semestre, cEscuela;
    private String ap1 ;
        private String ap2 ;
        private String nom ;
        private String noC ;
        private String clC ;
        private String sem ;
        private String clE ;

    public Libro(String aPaterno, String aMaterno, String nombre, String nCuenta, String cCarrera, 
            String semestre, String cEscuela,int i) {
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.cCarrera = cCarrera;
        this.semestre = semestre;
        this.cEscuela = cEscuela;
        this.i = i;
    }

    public Libro() {
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getcCarrera() {
        return cCarrera;
    }

    public void setcCarrera(String cCarrera) {
        this.cCarrera = cCarrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getcEscuela() {
        return cEscuela;
    }

    public void setcEscuela(String cEscuela) {
        this.cEscuela = cEscuela;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    

    public void insertarReg() {
        ap1 = JOptionPane.showInputDialog("Apellido Paterno: ");
        guardar();
        ap2 = JOptionPane.showInputDialog("Apellido Materno: ");
        guardar();
         nom = JOptionPane.showInputDialog("Nombre: ");
        guardar();
         noC = JOptionPane.showInputDialog("Número de cuenta: ");
        guardar();
         clC = JOptionPane.showInputDialog("Clave de carrera: ");       
        guardar();
        sem = JOptionPane.showInputDialog("Semestre: ");
        guardar();
        clE = JOptionPane.showInputDialog("Clave de la escuela: ");
        guardar();
        
        list.add(ap1 + "\t" + ap2 + "\t" + nom + "\t" + noC + "\t" + clC + "\t" + sem + "\t" + clE);
            dato = "\t";
    }
 
    boolean rep = true;
    String valor;
    String dato = "";
    ArrayList<String> list = new ArrayList<String>();
    String guardar;//= JOptionPane.showInputDialog("Fecha de registro: ");
    int i;

    public void guardar() {
        valor = guardar;
        valor = valor + "\t";
        dato = dato + valor.toUpperCase();
    }

    public void archivo() throws IOException {

        BufferedWriter bw = null;
        FileWriter fw = null;
        File arch = new File("registroalumno.xls");
        BufferedWriter bw1 = null;
        FileWriter fw1 = null;
        String enc = "Clave\tA.Paterno\tA.Materno\tNombre\tNo.Cuenta\tCarrera\tSemestre\tEscuela\n";
        fw = new FileWriter(arch);
        bw = new BufferedWriter(fw);
        PrintWriter escribir1 = new PrintWriter(bw);
        escribir1.append(enc);
        escribir1.close();

        try {
            fw1 = new FileWriter(arch, true);
            bw1 = new BufferedWriter(fw1);
            PrintWriter escribir = new PrintWriter(bw1);

            for (i = 0; i < list.size(); i++) {
                escribir.append(i + "\t" + list.get(i) + "\n");
            }
            escribir.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    public void crea() throws IOException {
        do {
            aPaterno = JOptionPane.showInputDialog("Apellido Paterno: ");
            guardar();
            aMaterno = JOptionPane.showInputDialog("Apellido Materno: ");
            guardar();
            nombre = JOptionPane.showInputDialog("Nombre\n(ej. Jose Juan = JoseJuan): ");
            guardar();
            nCuenta = JOptionPane.showInputDialog("Numero de cuenta: ");
            guardar();
            cCarrera = JOptionPane.showInputDialog("Clave de carrera: ");
            guardar();
            semestre = JOptionPane.showInputDialog("Semestre: ");
            guardar();
            cEscuela = JOptionPane.showInputDialog("Clave de la escuela: ");
            guardar();

            list.add(aPaterno + "\t" + aMaterno + "\t" + nombre + "\t" + nCuenta + "\t" + cCarrera + "\t" + semestre + "\t" + cEscuela);
            dato = "\t";

            int reg = JOptionPane.showConfirmDialog(null, "¿Desea Salir del registro? \n", "Final de Registro",
                    JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == reg) {
                JOptionPane.showMessageDialog(null, "Final de Registro\n" + "*Se recomienda abrir archivo en sistema*");
                rep = false;
            } 
        } while (rep == true);
        archivo();
    }

    @Override
    public String toString() {
        return "DATOS:\n" + "Apellido Paterno= " + getaPaterno() + "\nApellido Materno= " + getaMaterno() + "\nNombre= " + 
                nombre + "\nNo. de Cuenta= " + getnCuenta() + "\nClave de Carrera=" + cCarrera + "\nSemestre= " + semestre + 
                "\nClave de Escuela= " + cEscuela + "\nClave de Registro= " + i ;
    }
  
    public String toString1() {
        return "DATOS:\n" + "Apellido Paterno= " + ap1 + "\nApellido Materno= " + ap2 + "\nNombre= " + 
                nom + "\nNo. de Cuenta= " + noC + "\nClave de Carrera=" + clC + "\nSemestre= " + sem + 
                "\nClave de Escuela= " + clE + "\nClave de Registro= " + i ;
}}
