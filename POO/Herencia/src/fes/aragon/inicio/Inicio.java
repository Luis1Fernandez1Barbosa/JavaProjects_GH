package fes.aragon.inicio;
import fes.aragon.codigo.Elipse;
import fes.aragon.codigo.Rectangulo;

public class Inicio {
    public static void main(String[] args) {
        Elipse elp=new Elipse(3, 2);
        Rectangulo rec=new Rectangulo(4,4);
        System.out.println(elp.area());
        System.out.println(rec.area());
        System.out.println(elp.perimetro());
            elp.setEjeDos(5);
        System.out.println(elp.getEjeDos());
        System.out.println(elp.area());
    }
}
