/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Integracion;

/**
 *
 * @author Admin01
 */
public class Inicio {

    public static void main(String[] args) {

        System.out.println("Ejercicio 2");
        System.out.println("Funcion de grado 7");

        //Denominador del método de interpolación de Lagrange//
        double funcionL0 = new Integracion().FuncionLagrange(-5, -2, 1, 4, 7, 10, 13, 16);
        double funcionL1 = new Integracion().FuncionLagrange(-2, -5, 1, 4, 7, 10, 13, 16);
        double funcionL2 = new Integracion().FuncionLagrange(1, -2, -5, 4, 7, 10, 13, 16);
        double funcionL3 = new Integracion().FuncionLagrange(4, -2, 1, -5, 7, 10, 13, 16);
        double funcionL4 = new Integracion().FuncionLagrange(7, -2, 1, 4, -5, 10, 13, 16);
        double funcionL5 = new Integracion().FuncionLagrange(10, -2, 1, 4, 7, -5, 13, 16);
        double funcionL6 = new Integracion().FuncionLagrange(13, -2, 1, 4, 7, 10, -5, 16);
        double funcionL7 = new Integracion().FuncionLagrange(16, -2, 1, 4, 7, 10, 13, -5);
        double funcionTd = (funcionL0 * funcionL1 * funcionL2 * funcionL3 * funcionL4 * funcionL5 * funcionL6 * funcionL7);

        System.out.println("\nNumeradorL0= x^7 -49x^6 +167x^5 -235x^4 +15224x^3 -40916x^2 -90672x +116480");
        System.out.println("DenominadorL0= " + funcionL0);

        System.out.println("\nNumeradorL1= x^7 -46x^6 +750x^5 -4580x^4 -2551x^3 +132306x^2 -417080x +291200");
        System.out.println("DenominadorL1= " + funcionL1);

        System.out.println("\nNumeradorL2= x^7 -43x^6 +615x^5 -2465x^4 -14176x^3 +113028x^2 -39440x +582400");
        System.out.println("DenominadorL2= " + funcionL2);

        System.out.println("\nNumeradorL3= x^7 -40x^6 +498x^5 -1088x^4 -16063x^3 +62952x^2 +99340x -145600");
        System.out.println("DenominadorL3= " + funcionL3);

        System.out.println("\nNumeradorL4= x^7 -37x^6 +399x^5 -287x^4 -13720x^3 +31164x^2 +65680x -83200");
        System.out.println("DenominadorL4= " + funcionL4);

        System.out.println("\nNumeradorL5= x^7 -34x^6 +321x^5 +58x^4 -10870x^3 +21036x^2 +49648x -60160");
        System.out.println("DenominadorL5= " + funcionL5);

        System.out.println("\nNumeradorL6= x^7 -31x^6 +255x^5 +236x^4 -8656x^3 +14676x^2 +38320x -44800");
        System.out.println("DenominadorL6= " + funcionL6);

        System.out.println("\nNumeradorL7= x^7 -28x^6 +210x^5 +280x^4 -7231x^3 -11508x^2 +31660x -36400");
        System.out.println("DenominadorL7= " + funcionL7);

//Numerador del método de interpolación de Lagrange// 
        //N de L0//
        double T07 = new Integracion().FuncionT(1);
        double T06 = new Integracion().FuncionT(-49);
        double T05 = new Integracion().FuncionT(167);
        double T04 = new Integracion().FuncionT(-235);
        double T03 = new Integracion().FuncionT(15224);
        double T02 = new Integracion().FuncionT(-40916);
        double T01 = new Integracion().FuncionT(-90672);
        double T00 = new Integracion().FuncionT(116480);
        System.out.println("\n\tx^7" + "\t\t\tx^6" + "\t\t\tx^5" + "\t\t\tx^4" + "\t\t\tx^3" + "\t\t\tx^2" + "\t\t\tx" + "  \t\tC ");
        System.out.println(" " + T07 + "; " + T06 + "; " + T05 + "; " + T04 + "; " + T03 + "; " + T02 + "; " + T01 + "; " + T00);

        //N de L1//
        double T17 = new Integracion().FuncionT(1);
        double T16 = new Integracion().FuncionT(-46);
        double T15 = new Integracion().FuncionT(750);
        double T14 = new Integracion().FuncionT(-4580);
        double T13 = new Integracion().FuncionT(-2551);
        double T12 = new Integracion().FuncionT(132306);
        double T11 = new Integracion().FuncionT(-417080);
        double T10 = new Integracion().FuncionT(291200);
        System.out.println(" " + T17 + "; " + T16 + "; " + T15 + "; " + T14 + "; " + T13 + "; " + T12 + "; " + T11 + "; " + T10);

        //N de L2//
        double T27 = new Integracion().FuncionT(1);
        double T26 = new Integracion().FuncionT(-43);
        double T25 = new Integracion().FuncionT(615);
        double T24 = new Integracion().FuncionT(-2465);
        double T23 = new Integracion().FuncionT(-14176);
        double T22 = new Integracion().FuncionT(113028);
        double T21 = new Integracion().FuncionT(-39440);
        double T20 = new Integracion().FuncionT(582400);
        System.out.println(" " + T27 + "; " + T26 + "; " + T25 + "; " + T24 + "; " + T23 + "; " + T22 + "; " + T21 + "; " + T20);

        //N de L3//
        double T37 = new Integracion().FuncionT(1);
        double T36 = new Integracion().FuncionT(-40);
        double T35 = new Integracion().FuncionT(498);
        double T34 = new Integracion().FuncionT(-1088);
        double T33 = new Integracion().FuncionT(-16063);
        double T32 = new Integracion().FuncionT(62952);
        double T31 = new Integracion().FuncionT(99340);
        double T30 = new Integracion().FuncionT(-145600);
        System.out.println(" " + T37 + "; " + T36 + "; " + T35 + "; " + T34 + "; " + T33 + "; " + T32 + "; " + T31 + "; " + T30);

        //N de L4//
        double T47 = new Integracion().FuncionT(1);
        double T46 = new Integracion().FuncionT(-37);
        double T45 = new Integracion().FuncionT(399);
        double T44 = new Integracion().FuncionT(-287);
        double T43 = new Integracion().FuncionT(-13720);
        double T42 = new Integracion().FuncionT(31164);
        double T41 = new Integracion().FuncionT(65680);
        double T40 = new Integracion().FuncionT(83200);
        System.out.println(" " + T47 + "; " + T46 + "; " + T45 + "; " + T44 + "; " + T43 + "; " + T42 + "; " + T41 + "; " + T40);

        //N de L5//
        double T57 = new Integracion().FuncionT(1);
        double T56 = new Integracion().FuncionT(-34);
        double T55 = new Integracion().FuncionT(321);
        double T54 = new Integracion().FuncionT(58);
        double T53 = new Integracion().FuncionT(-10870);
        double T52 = new Integracion().FuncionT(21036);
        double T51 = new Integracion().FuncionT(49648);
        double T50 = new Integracion().FuncionT(-60160);
        System.out.println(" " + T57 + "; " + T56 + "; " + T55 + "; " + T54 + "; " + T53 + "; " + T52 + "; " + T51 + "; " + T50);

        //N de L6//
        double T67 = new Integracion().FuncionT(1);
        double T66 = new Integracion().FuncionT(-31);
        double T65 = new Integracion().FuncionT(255);
        double T64 = new Integracion().FuncionT(236);
        double T63 = new Integracion().FuncionT(-8656);
        double T62 = new Integracion().FuncionT(14676);
        double T61 = new Integracion().FuncionT(38320);
        double T60 = new Integracion().FuncionT(-44800);
        System.out.println(" " + T67 + "; " + T66 + "; " + T65 + "; " + T64 + "; " + T63 + "; " + T62 + "; " + T61 + "; " + T60);

        //N de L7//
        double T77 = new Integracion().FuncionT(1);
        double T76 = new Integracion().FuncionT(-28);
        double T75 = new Integracion().FuncionT(210);
        double T74 = new Integracion().FuncionT(280);
        double T73 = new Integracion().FuncionT(-7231);
        double T72 = new Integracion().FuncionT(11508);
        double T71 = new Integracion().FuncionT(31660);
        double T70 = new Integracion().FuncionT(-36400);
        System.out.println(" " + T77 + "; " + T76 + "; " + T75 + "; " + T74 + "; " + T73 + "; " + T72 + "; " + T71 + "; " + T70);

        double Nx7 = T07 + T17 + T27 + T37 + T47 + T57 + T67 + T77;
        double Nx6 = T06 + T16 + T26 + T36 + T46 + T56 + T66 + T76;
        double Nx5 = T05 + T15 + T25 + T35 + T45 + T55 + T65 + T75;
        double Nx4 = T04 + T14 + T24 + T34 + T44 + T54 + T64 + T74;
        double Nx3 = T03 + T13 + T23 + T33 + T43 + T53 + T63 + T73;
        double Nx2 = T02 + T12 + T22 + T32 + T42 + T52 + T62 + T72;
        double Nx1 = T01 + T11 + T21 + T31 + T41 + T51 + T61 + T71;
        double Nx0 = T00 + T10 + T20 + T30 + T40 + T50 + T60 + T70;
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" " + Nx7 + "; " + Nx6 + "; " + Nx5 + "; " + Nx4 + "; " + Nx3 + "; " + Nx2 + "; " + Nx1 + "; " + Nx0);
        System.out.println("\nF(x)=(" + Nx7 + "x^7" + Nx6 + "x^6+" + Nx5 + "x^5" + Nx4 + "x^4" + Nx3 + "x^3+" + Nx2 + "x^2" + Nx1 + "x+" + Nx0+")\n/"+funcionTd);
        System.out.println("\nDt=(DL0)(DL1)(DL2)(DL3)(DL4)(DL5)(DL6)(DL7)= " + funcionTd);

        //Área de Trapecios// 
        double resultadoT0 = new Integracion().integral(0.0, 15.0, 10, -5, -2);
        double resultadoT1 = new Integracion().integral(15.0, 18.0, 10, -2, 1);
        double resultadoT2 = new Integracion().integral(18.0, 15.0, 10, 1, 4);
        double resultadoT3 = new Integracion().integral(15.0, 12.0, 10, 4, 7);
        double resultadoT4 = new Integracion().integral(12.0, 15.0, 10, 7, 10);
        double resultadoT5 = new Integracion().integral(15.0, 30.0, 10, 10, 13);
        double resultadoT6 = new Integracion().integral(30.0, 63.0, 10, 13, 16);
        double AreaTotal = resultadoT0 + resultadoT1 + resultadoT2 + resultadoT3 + resultadoT4 + resultadoT5 + resultadoT6;
        double resultadoA = new Integracion().integral(0.0, 30.0, 10, -5, 13);
        double resultadoB = new Integracion().integral(0.0, 63.0, 10, -5, 16);

        System.out.print("\nIntegral:ÁreaT0= " + resultadoT0);
        System.out.print("\nIntegral:ÁreaT1= " + resultadoT1);
        System.out.print("\nIntegral:ÁreaT2= " + resultadoT2);
        System.out.print("\nIntegral:ÁreaT3= " + resultadoT3);
        System.out.print("\nIntegral:ÁreaT4= " + resultadoT4);
        System.out.print("\nIntegral:ÁreaT5= " + resultadoT5);
        System.out.print("\nIntegral:ÁreaT6= " + resultadoT6);
        System.out.println("\nÁrea Total= " + AreaTotal);

        System.out.println("\nÁrea entre -5 y 13= " + resultadoA);
        System.out.println("Área entre -5 y 16= " + resultadoB);

        double F0 = new Integracion().a(-5);
        double R0 = F0 / funcionTd;
        System.out.println("\nFx0= " + R0);

        double F1 = new Integracion().a(-2);
        double R1 = F1 / funcionTd;
        System.out.println("Fx1= " + R1);
        
        double F2 = new Integracion().a(1);        
        double R2 = F2 / funcionTd;
        System.out.println("Fx2= " + R2);

        double F3 = new Integracion().a(4);
        double R3 = F3 / funcionTd;
        System.out.println("Fx3= " + R3);
        
        double F4 = new Integracion().a(7);
        double R4 = F4 / funcionTd;
        System.out.println("Fx4= " + R4);
        
        double F5 = new Integracion().a(10);
        double R5 = F5 / funcionTd;
        System.out.println("Fx5= " + R5);
        
        double F6 = new Integracion().a(13);
        double R6 = F6 / funcionTd;
        System.out.println("Fx6= " + R6);

        double F7 = new Integracion().a(16);
        double R7 = F7 / funcionTd;
        System.out.println("Fx7= " + R7);


        System.out.println("\n-------------------------------------------------------------------------------");
        //Ejercicio 3, Cohete

        System.out.println("\nEjercicio 3");

        double D0 = new Integracion().Cohete(0, 0.0824, 60);
        System.out.println("\nDesplazamiento a 60s= " + D0 + " millas");

        double D1 = new Integracion().Cohete(0.0824, 0.2747, 120);
        System.out.println("\nDesplazamiento a 120s= " + D1 + " millas");

        double D2 = new Integracion().Cohete(0.2747, 0.6502, 180);
        System.out.println("\nDesplazamiento a 180s= " + D2 + " millas");

        double D3 = new Integracion().Cohete(0.6502, 1.3851, 240);
        System.out.println("\nDesplazamiento a 240s= " + D3 + " millas");

        double D4 = new Integracion().Cohete(1.3851, 3.2229, 300);
        System.out.println("\nDesplazamiento a 300s= " + D4 + " millas");
    }
}