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
public abstract class Trapecio {
    public double integral (double a, double b, int n,double X1, double X2){
        double h=(X2-X1);
        double suma=(a+b)/2;
        return suma*h;
    }
    public double FuncionLagrange(double X0, double X1, double X2, double X3, double X4, double X5, double X6, double X7){
        double L0=(((X0-X1)*(X0-X2)*(X0-X3)*(X0-X4)*(X0-X5)*(X0-X6)*(X0-X7)));  
        return L0;
    }
    public double FuncionT(double x0){
        double Td=8.231212195416693E48;
        double T0=Td*x0;
        return T0;
    }
    public double Cohete (double Vi, double Vf, double t) {
    double D=((Vf-Vi)/2)*t;
    return D;
}
    abstract public double a(double x);
} 