package fes.aragon.inicio;

import fes.aragon.codigo.Racional;

public class Inicio {

    public static void main(String[] args) {
        Racional objUno = new Racional(1, 6);
        Racional objDos = new Racional(3,7);
        Racional objDosM=new Racional(23, 65);
        Racional objTres = objDosM;
        System.out.println(objUno.toString());
        System.out.println(objDos.toString());
        System.out.println(objTres.toString());
        System.out.println(objDosM.toString());
        
        objDosM.setDenominador(9);
        System.out.println(objDos.toString());
        objDosM.suma(objUno);
        System.out.println(objDos.toString());
        
        Racional objCuatro = new Racional(7, 6);
        objCuatro.multiplicacion(objDosM);
        System.out.println(objCuatro.toString());
        objCuatro.setNumerador(12);
        objDosM.setDenominador(6);
        System.out.println(objDosM.toString());
        objDos.setDenominador(2);
        objDos.setNumerador(4);
        System.out.println(objDos.toString());
        objCuatro.division(objDos);
        System.out.println(objCuatro.toString());
    }

}
