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
public class NewthonRaphson {

public class Newton {
}
public double F1(double x, double y) {
return -2*Math.pow(x, 4) + 6*Math.pow(x, 3) - 12*x + 3;
}
public double F1x(double x, double y) {
return x;
}
public double F1y(double x, double y) {
return y;
}
public double F11(double x, double y){
    return -8*Math.pow(x, 3) + 18*Math.pow(x, 2) - 12;
}

public double F2(double x, double y) {
return 3*x + 5*Math.sin(x-2);
}
public double F2x(double x, double y) {
return x;
}
public double F2y(double x, double y) {
return y;
}
public double F12(double x, double y) {
return 3 + 5*Math.cos(x-2);
}

public double F3(double x, double y) {
return 5*x +6*Math.log(x+3);
}
public double F3x(double x, double y) {
return x;
}
public double F3y(double x, double y) {
return y;
}
public double F13(double x, double y) {
return 5 + 6/(x + 3)*(Math.log(x));
}

public double F4(double x, double y) {
return Math.pow(x, 3) + 4*Math.pow(x, 2) + 12*x -3; 
}
public double F4x(double x, double y) {
return x;
}
public double F4y(double x, double y) {
return y;
}
public double F14(double x, double y) {
return 3*Math.pow(x, 2) + 8*x + 12;
}

public double[] Newton(double sol[], double Tol, int Maxlt, int cod) {
double error= Double.MAX_VALUE;
for (int i = 0;i<Maxlt && error > Tol;i++){
System.out.println("lt: "+(i+1));
double [][] matriz = LLenarMatriz(cod, sol[0], sol[1]);
double tmp[] = Gauss(matriz, String.valueOf(Tol).length()+2);
System.out.println("Soluciones Gauss: "+tmp[0]+" "+tmp[1]);
sol[0] += tmp[0];
sol[1] += tmp[1];
System.out.println("Soluciones Sistema: "+sol[0]+" "+sol[1]);
error= Math.max(Math.abs(tmp[0]), Math.abs(tmp[1]));
System.out.println("Error: "+error);
}
return sol;
}
public double[][] LLenarMatriz(int cod, double x, double y) {
double [][] matriz = new double[2][3];
switch (cod){
case 1:{
matriz[0][0] = F1x(x,y);
matriz[0][1] = F1y(x,y);
matriz[0][2] = -F1(x,y);
}break;
case 2:{
matriz[0][0] = F2x(x,y);
matriz[0][1] = F2y(x,y);
matriz[0][2] = -F2(x,y);
}break;
case 3:{
matriz[0][0] = F3x(x,y);
matriz[0][1] = F3y(x,y);
matriz[0][2] = -F3(x,y);
}break;
}
return matriz;
}
public double[] Gauss(double [][] matriz, int I) {
double tmp = 0, m;
double X[] = new double[2];
if (matriz[0][0]==0 || matriz[0][0]<matriz[1][0]){
for (int i = 0;i<2;i++){
tmp = matriz[0][1];
matriz[0][i] = matriz[1][i];
matriz[1][i] = tmp;
}
}
m = matriz[1][0] / matriz[0][0];
matriz[1][1] -= m*matriz[0][1];
matriz[1][2] -= m*matriz[0][2];
X[1] = redondear(matriz[1][2] / matriz[1][1], I);
X[0] = redondear((matriz[0][2] - matriz[0][1]*X[1]) / matriz[0][0], I);
return X;
}

public double redondear(double a, int cifras){
String cadena = String.valueOf(a);
if (cadena.contains("_")){
cifras++;
}
    return 0;
}
}