/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;
import java.util.Random;

/**
 *
 * @author Admin01
 */
public class Estorbos {

    private int xx;
    private int yy;
    private int cx;
    private int cy;
    private int ancho;
    private int longitud;
    private boolean arriba= false;
    private boolean abajo= false;
    private boolean der= true;
    private boolean izq= true;
    private boolean eliminar=false;
    private String quienElimino=null;   

    public Estorbos(int xx, int yy, int cx, int cy, int ancho, int longitud) {
        this.xx = xx;
        this.yy = yy;
        this.cx = cx;
        this.cy = cy;
        this.ancho = ancho;
        this.longitud=longitud;
        Random rd= new Random();
        if(rd.nextInt(100)<=20){
            izq=true;
            arriba=true;
        }else{
            der=true;
            abajo=true;
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getXx() {
        return xx;
    }

    public void setXx(int xx) {
        this.xx = xx;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

   
    public boolean isArriba() {
        return arriba;
    }

    public void setArriba(boolean arriba) {
        this.arriba = arriba;
    }

    public boolean isAbajo() {
        return abajo;
    }

    public void setAbajo(boolean abajo) {
        this.abajo = abajo;
    }

    public boolean isDer() {
        return der;
    }

    public void setDer(boolean der) {
        this.der = der;
    }

    public boolean isIzq() {
        return izq;
    }

    public void setIzq(boolean izq) {
        this.izq = izq;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }

    public String getQuienElimino() {
        return quienElimino;
    }

    public void setQuienElimino(String quienElimino) {
        this.quienElimino = quienElimino;
    }

    //public Object setQuienElimino() {
      //  return null;
       //}

    //public setQuienElimino() {
        
    
    
    
}