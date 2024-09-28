/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.util.Scanner;

/**
 *
 * @author Admin01
 */
public final class MetodoB {
     float Xi, Xs, tolerancia;
    int iteraciones;
    double funcion, error;
    
    public MetodoB(Scanner s) {
        //Primero se leen todos los parametros requeridos por el metodo/
        leerTolerancia(s);
        leerIteraciones(s);
        leerXi(s);
        leerXs(s);
        
        //Procedemos a evaluar Yi Ys/
        double Yi = evaluarFuncion(Xi);
        double Ys = evaluarFuncion(Xs);
        
        if(Yi==0) System.out.println("Xi "+Xi+" es una raiz");
        else if(Ys==0) System.out.println("Xs "+Xs+" es una raiz");
        else if ((Yi*Ys)>0) System.out.println("No se detectaron raices");
        else {
            float Xm = (Xi+Xs)/2;
            double Ym = evaluarFuncion(Xm);
            error = tolerancia+1;
            int contador = 0;
            //hacemos el ciclo con el fin de buscar raices
            while((Ym!=0)&&(error>tolerancia)&&(contador < iteraciones)){
                float var_auxiliar;
                
                if((Yi*Ys)<0){
                    Xs = Xm;
                    Ys = Ym;
                } else {
                    Xi = Xm;
                    Yi = Ym;
                }
                
                var_auxiliar = Xm;
                Xm = (Xi+Xs)/2;
                Ym = evaluarFuncion(Xm);
                error = Math.abs((Xm-var_auxiliar)/Xm);
                contador++;
            }
            //Segun los resultados del ciclo mostramos
            if(Ym==0) System.out.println("Xm "+Xm+" es una raiz");
            else if (error<=tolerancia) System.out.println("Xm "+Xm+" es una raiz y tiene un error absoluto de "+error);
            else System.out.println("Fallo la ejecucion del metodo");
        }
    }
    
    public double evaluarFuncion(float x){
        funcion = Math.cos(1)-3*(x);// Escribir aca la función a evaluar, X es el parametro a usar
        return funcion;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MetodoB MB = new MetodoB(s);
    }
    
    public void leerTolerancia(Scanner s){
        System.out.println("Inserte Valor tolerancia:");
        try {
            tolerancia = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerTolerancia(s);
        }
    }
    
    public void leerIteraciones(Scanner s){
        System.out.println("Inserte numero de iteraciones:");
        try {
            iteraciones = Integer.parseInt(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerIteraciones(s);
        }
    }
    
    public void leerXi(Scanner s){
        System.out.println("Inserte Valor Xi:");
        try {
            Xi = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerXi(s);
        }
    }
    
    public void leerXs(Scanner s){
        System.out.println("Inserte Valor Xs:");
        try {
            Xs = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerXs(s);
        }
    }
    
}