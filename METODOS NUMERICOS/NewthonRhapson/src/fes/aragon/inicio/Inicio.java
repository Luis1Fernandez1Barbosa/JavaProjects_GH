/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;
import fes.aragon.codigo.NewthonRaphson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Admin01
 */
public class Inicio {
    
public static void main(String[] args) throws IOException{
NewthonRaphson newton = new NewthonRaphson();
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Entre función a tratar: ");
System.out.println("1.- f(x)= -2X^4 + 6X^3 - 12X + 3");
    System.out.println("Es algebraica.\n"+"f(x):3 raíces positivas; "+"f(-x):1 raíz negativa\n");
    System.out.println("Raices\t3\t3\t3\n"+" (+) \t3\t1\t0\n"+" (-) \t0\t0\t1\n"+" (C) \t0\t2\t2\n");
    System.out.println("\tGrado: 4 ; Delta: 0.1 ; Xo= 1");
    System.out.println("\tf'(x)= -8X^3 + 18X^2 - 12");
    System.out.println("    \t x     f(x)\n"+
    "i:1     -1.5000 -9.37500 \n" +
    "i:2	-1.3311	-1.45569 \n" +
    "i:3	-1.2935	-0.06291 \n" +
    "i:4	-1.2917	-0.00014 \n" +
    "i:5	-1.2917	-0.00000");
    System.out.println("\t\t\tLa raíz es: -1.2917");
    
System.out.println("Entre función a tratar: ");    
System.out.println("2.- f(x) = 3X + 5sen(X-2)");
    System.out.println("Es trascendente.");
    System.out.println("\tGrado: 1 ; Delta: 0.002 ; Xo= 3");
    System.out.println("\tf'(x)= 3 + 5cos(X-2)");
    System.out.println("    \t x     f(x)\n"
            + "i:1	0.6835	-2.78856\n" +
"i:2	1.3384	0.94354\n" +
"i:3	1.2026	0.02995\n" +
"i:4	1.1980	0.00004\n" +
"i:5	1.1980	0.00000");
    System.out.println("\t\t\tLa raíz es: 1.1980");

System.out.println("Entre función a tratar: ");    
System.out.println("3.- f(x) = 5X +6log(x+3)");
    System.out.println("Es transcendente.");
    System.out.println("\tGrado: 6 ; Delta: 0.01 ; Xo= -2.8");
    System.out.println("\tf'(x)= 5 + 6/[(x + 3)(In)]");
    System.out.println("    \t x     f(x)\n"+
            "i:1	-2.8	18.193820\n" +
"i:2	-1.7908	-8.45936\n" +
"i:3	-0.6085	-0.77080\n" +
"i:4	-0.4819	-0.00352\n" +
"i:5	-0.4813	-0.00000");
    System.out.println("\t\t\tLa raíz es: -0.4813");
    
System.out.println("Entre función a tratar: ");
System.out.println("4.- f(x) = X^3 + 4X^2 + 12X -3");
    System.out.println("Es algebraica."+"f(x):1 raíz positivas; "+"f(-x):2 raices negativa\n");
    System.out.println("Raices\t2\t2\n"+" (+) \t0\t0\n"+" (-) \t2\t0\n"+" (C) \t0\t2\n");
    System.out.println("\tGrado: 3 ; Delta: 0.001 ; Xo=2.5");
    System.out.println("\tf'(x)= 3X^2 + 8X + 12");
    System.out.println("\t x     f(x)\n"
            + "i:1	1.1675	18.05328\n" +
"i:2	0.4575	3.42361\n" +
"i:3	0.2474	0.22807\n" +
"i:4	0.2312	0.00123\n" +
"i:5	0.2312	0.00000	");
    System.out.println("\t\t\tLa raíz es: 0.2312");
int cod = Integer.parseInt(buffer.readLine());
System.out.println("Entrar soluciones iniciales!!!!\nEntre x0: ");
double x0 = Double.parseDouble(buffer.readLine());
System.out.println("Entre y0: ");
double y0 = Double.parseDouble(buffer.readLine());
double sol[] = {x0, y0};
System.out.println("Entre la cantidad de iteraciones: ");
int Maxlt = Integer.parseInt(buffer.readLine());
System.out.println("Entre la tolerancia: ");
double Tol = Double.parseDouble(buffer.readLine());

sol=newton.Newton(sol, Tol, Maxlt, cod);
System.out.println("Soluciones: ");
System.out.println("x: "+sol[0]);
System.out.println("y: "+sol[1]); }
}