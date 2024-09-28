/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author Admin01
 */
public class Nodo {

    private int longitud = 0;
    private int opcion;
    public Nodo siguiente;
    public Libro libro;

    public Nodo (int opc){
        this.opcion=opc;
    }
    public Nodo (Libro lib){
    this.libro=lib;
    this.siguiente=null;}
  
    public Nodo (Libro lib,Nodo sig){
        libro=lib;
        siguiente=sig;
    }
    public Nodo (Libro lib, Nodo sig, int opc){
        libro=lib;
        siguiente=sig;
        opcion=opc;
    }
    public Nodo (int opc, int longit){
    this.opcion=opc;
    this.longitud=longit;
}
    public Nodo (Libro lib, Nodo sig, int opc,int longit){
        libro=lib;
        siguiente=sig;
        opcion=opc;
        longitud=longit;
    }}