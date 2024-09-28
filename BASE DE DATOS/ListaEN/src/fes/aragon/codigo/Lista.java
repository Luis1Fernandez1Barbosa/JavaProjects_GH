/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import javax.swing.JOptionPane;
import fes.aragon.codigo.Libro;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Admin01
 */
public class Lista {

    int eleccion;
    private Nodo inicio, fin;
    public Libro libro;
    
    public Lista() {
        inicio = null;
        fin = null;
    }

    public void insertarPrincipio(Libro libro) throws IOException {
        inicio = new Nodo(libro, inicio);
        if (inicio == null) {
            fin = inicio;
        } else {
            inicio = inicio.siguiente;
            libro.insertarReg();
            libro.archivo();
             JOptionPane.showMessageDialog(null, "Se inserto al principio\n"+libro.toString1());
        }
    }

    public void insertarFinal(Libro lib, Nodo fin) throws IOException {
        inicio = new Nodo(lib, fin);
        if (inicio == null) {
            inicio = null;
        } else {
            Nodo puntero = inicio;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = inicio;
            lib.insertarReg();
            lib.archivo();
            JOptionPane.showMessageDialog(null, "Se inserto al final\n"+lib.toString1());
        }
    }
    
    public void insertarDespues(Libro lib, Nodo sig, int opc, int contador) throws IOException {
        String m;
        m = JOptionPane.showInputDialog("Clave de resgitro: \n");
        opc = Integer.parseInt(m);
        inicio = new Nodo(lib, sig, opc, contador);
        if (inicio == null) {
            inicio = null;
            JOptionPane.showMessageDialog(null, inicio);
        } else {
            Nodo puntero = inicio;
            contador = 0;
            while (contador < opc && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            inicio.siguiente = puntero.siguiente;
            puntero.siguiente = inicio;
            lib.insertarReg();
            lib.archivo();
            JOptionPane.showMessageDialog(null, "Registro guardado.\n"+lib.toString1());
        }
    }

    public Libro obtener(Libro enl, int opc) {
        String m = JOptionPane.showInputDialog("Clave de registro: \n");
        opc = Integer.parseInt(m);
        if (enl == null) {
            JOptionPane.showMessageDialog(null, "Es nulo\n");
        } else {
            Nodo puntero = inicio;
            int contador = 0;
            do{
                JOptionPane.showMessageDialog(null, enl.toString());
            }while (contador < opc && puntero.siguiente != null); 
                puntero = puntero.siguiente;
                contador++;
            
            if (contador != opc) {
                JOptionPane.showMessageDialog(null, "Caracter incorrecto\n");
            } else {
                JOptionPane.showMessageDialog(null, puntero);
            }
        }
        return enl;
    }

    public int contar(int opc, int contador) {
        Nodo puntero = inicio;
        contador = 0;
        while (contador < opc && puntero.siguiente != null) {
            puntero = puntero.siguiente;
            contador++;
        }
        return opc;
    }

    public boolean estaVacio(int opc, int contador) {
        //Nodo puntero = inicio;
        //contador = 0;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "¡¡Esta Vacia!!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "¡¡NOOOOOO Esta Vacia!!");
            /*while (contador < opc && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            JOptionPane.showMessageDialog(null, "Su longitud es de: " + contador);
            */return false;
        }
    }

    public void eliminarPrincipio() {
        Nodo primer = inicio;
        inicio = inicio.siguiente;
        primer.siguiente = null;
        JOptionPane.showMessageDialog(null, "Se elimino: " + primer);
    }

    public void eliminarUltimo() {
        if (inicio != null) {
            if (inicio.siguiente == null) {
                inicio = null;
                JOptionPane.showMessageDialog(null, "Es nulo\n");
            } else {
                Nodo puntero = inicio;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;

                JOptionPane.showMessageDialog(null, "Se elimino: " + puntero);
            }
        }
    }

    public void eliminarLibro(int opc, int contador) {
        String m;
        m = JOptionPane.showInputDialog("Número de registro: \n");
        opc = Integer.parseInt(m);
        if (inicio != null) {
            if (opc == 0) {
                Nodo primer = inicio;
                inicio = inicio.siguiente;
                primer.siguiente = null;
                contador--;
            } else if (opc < contador) {
                Nodo puntero = inicio;
                contador = 0;
                while (contador < (opc - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                contador--;
                JOptionPane.showMessageDialog(null, temp);
            }
        }
    }
    
    public void leer(){
        FileReader fr = null;
        try {
            fr = new FileReader("registroalumno.xls");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();  
            while (cadena != null) {                             
                JOptionPane.showMessageDialog(null, cadena);        
                cadena = entrada.readLine();                             
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                  }
        }
    }

    public void Opciones() {
        String entrada;
        entrada = JOptionPane.showInputDialog("INGRESE EL NÚMERO CORRESPONDIENTE\n\n" 
                +  "Insertar al principio-(1)\n" 
                + "Insertar al final-(2)\n" 
                + "Insertar específico-(3)\n" 
                + "Obtener dato-(4)\n" 
                + "Eliminar primero-(5)\n" 
                + "Eliminar último-(6)\n" 
                + "Eliminación especifica-(7)\n" 
                + "Lista vacia ¿?-(8)\n" 
                + "Longitud de lista-(9)\n" 
                + "Leer-(10)\n" + "EXIT-(11)");

        eleccion = Integer.parseInt(entrada);
    }

    public void Elección(Libro libro, int opc) throws IOException {
        switch (eleccion) {
            case 1:
                eleccion = 1;
                insertarPrincipio(libro);
                break;
            case 2:
                eleccion = 2;
                insertarFinal(libro,fin);
                break;
            case 3:
                eleccion = 3;
                insertarDespues(libro, fin, opc, opc);
                break;
            case 4:
                eleccion = 4;
                obtener(libro, opc);
                break;
            case 5:
                eleccion = 5;
                eliminarPrincipio();
                break;
            case 6:
                eleccion = 6;
                eliminarUltimo();
                break;
            case 7:
                eleccion = 7;
                eliminarLibro(opc, opc);
                break;
            case 8:
                eleccion = 8;
                estaVacio(opc, opc);
                break;
            case 9:
                eleccion = 9;
                contar(opc, opc);
                break;
            case 10:
                eleccion=10;
                leer();
                break;
            case 11:
                eleccion = 11;
                JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?\n");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Se escribio un mal caracter.\n");
        }
    }
}