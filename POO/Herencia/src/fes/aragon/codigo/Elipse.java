package fes.aragon.codigo;
import fes.aragon.codigo.Rectangulo;

public class Elipse extends Figura{
    private double ejeUno;
    private double ejeDos;

    public Elipse() {
    }

    public Elipse(double ejeUno, double ejeDos) {
        this.ejeUno = ejeUno;
        this.ejeDos = ejeDos;
    }
    

    public double getEjeUno() {
        return ejeUno;
    }

    public void setEjeUno(double ejeUno) {
        this.ejeUno = ejeUno;
    }

    public double getEjeDos() {
        return ejeDos;
    }

    public void setEjeDos(double ejeDos) {
        this.ejeDos = ejeDos;
    }

    @Override
    public double area() {
        return Math.PI * ejeUno * ejeDos;
    }

    @Override
    public double perimetro() {
        return (Math.PI * (3*(ejeUno+ejeDos)) - (Math.sqrt((3*ejeUno+ejeDos) * (ejeUno+3*ejeDos))));
    }
    
    
}
