/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.util.Scanner;

public final class Biseccion {
    public static void main(String[] args) {
/**
 *
 * @author Admin01
 */
        class Biseccion2{
    double inferior, superior, tolerancia, p;
            int ni;

            /**
             * **
             * Constructor
             */
            public Biseccion2(double a1, double b1, double tol1,
                    int ni1) {
                inferior = a1;
                superior = b1;
                tolerancia = tol1;
                ni = ni1;
            }

            /**
             * **
             * Función de la que se calculará la raíz
             */
            private double f(double x) {
                //  double funcion = x - Math.pow(2,-x);
                double funcion = (2 * x * x * x) + (11 * x * x) + (7 * x) - 3;
                //double funcion = 2*x*Math.cos(2*x) - (x + 1)*(x + 1);
                //  double funcion = x*Math.cos(x)-2*x*x + 3*x -1;
                return funcion;
            }

            /**
             * **
             * Metodo private: calcularRaices
             */
            public double calcularRaiz() {
                double posibleRaiz = inferior;
                int i = 1;
                double eps = 1;

                while (f(posibleRaiz) != 0 & i <= ni & eps > tolerancia) {
                    double pa = posibleRaiz;
                    posibleRaiz = (inferior + superior) / 2;
                    if (f(posibleRaiz) * f(inferior) > 0) {
                        inferior = posibleRaiz;
                        System.out.println("Funcion evaluada en a "+posibleRaiz);
                    } else if (f(posibleRaiz) * f(superior) > 0) {
                        superior = posibleRaiz;
                        System.out.println("Funcion evaluada en b "+posibleRaiz);
                    }
                    i = i + 1;
                    eps = Math.abs(posibleRaiz - pa) / posibleRaiz;
                  
                }
                return posibleRaiz;
            }
}

        {
            Biseccion2 c = new Biseccion2(0, 1, 1e-5, 20);
            double raiz = c.calcularRaiz();
            System.out.println("La raíz es: " + raiz);
        }
}
}
