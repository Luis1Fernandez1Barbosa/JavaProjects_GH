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
public class Integracion extends Trapecio {

    public double a(double x) {
        return (6.584969756333355E49 * Math.pow(x, 7) - 2.535213356188342E51 * Math.pow(x, 6) + 2.646334720826467E52 * Math.pow(x, 5) - 6.65164257511623E52 * Math.pow(x, 4) - 4.7776424945857105E53 * Math.pow(x, 3) + 2.8459745414141033E54 * Math.pow(x, 2) - 2.1610553746334814E54 * x + 6.472366773500055E54);
    }
}