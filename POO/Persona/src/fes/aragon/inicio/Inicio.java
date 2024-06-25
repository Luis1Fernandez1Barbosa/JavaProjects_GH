package fes.aragon.inicio;

import fes.aragon.codigo.Empleado;
import fes.aragon.codigo.JefeDeArea;

public class Inicio {

    public static void main(String[] args) {

        Empleado emp = new Empleado("Luis", 3500);
        JefeDeArea jef = new JefeDeArea("Sech", 5000);
        System.out.println(emp.incrementoSueldo());
        System.out.println(jef.incrementoSueldo());
    }
}
