package fes.aragon.codigo;

public class Rectangulo extends Figura {
    private double ladoUno;
    private double ladoDos;

    public Rectangulo() {
    }

    public Rectangulo(double ladoUno, double ladoDos) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public Rectangulo(double ladoUno, double ladoDos, double x, double y) {
        super(x, y);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }
    
    
    
    @Override
    public double area() {
        return ladoUno*ladoDos;
    }

    @Override
    public double perimetro() {
        return (2*ladoUno)+(2*ladoDos);
    }
    
}
