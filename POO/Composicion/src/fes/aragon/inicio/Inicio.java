
package fes.aragon.inicio;

import fes.aragon.codigo.OperacionesRacionales;
import fes.aragon.codigo.Racional;

public class Inicio {
    public static void main(String[] args) {
        Racional objUno=new Racional(1, 9);
        Racional objDos=new Racional(1, 5);
        OperacionesRacionales op=new OperacionesRacionales(objUno, objDos);
        
        Racional objTres= op.suma();
        op.getRacionalUno().setDenominador(9);
        op.getRacionalUno().setNumerador(3);
        
        objTres=op.division();
        System.out.println(objTres.toString());
        System.out.println(op.suma().toString());
        
        op.getRacionalDos().setNumerador(3);
        System.out.println(op.multiplicacion().toString());
        System.out.println(op.division().toString());
        
        objDos.setNumerador(5);
        System.out.println(op.multiplicacion().toString());
    }
}
