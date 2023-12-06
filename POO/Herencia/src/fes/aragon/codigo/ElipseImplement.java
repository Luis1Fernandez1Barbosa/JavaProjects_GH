 package fes.aragon.codigo;

public class ElipseImplement implements InterfazFigura, 
    ConexionBluetooth
{
    private double ejeUno;
    private double ejeDos;

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

    public ElipseImplement(double ejeUno, double ejeDos) {
        this.ejeUno = ejeUno;
        this.ejeDos = ejeDos;
    }
    
    
        @Override
        public double area() {
        return Math.PI * ejeUno * ejeDos;    }

        @Override
        public double perimetro() {
            return (Math.PI * (3*(ejeUno+ejeDos)) - (Math.sqrt((3*ejeUno+ejeDos) * (ejeUno+3*ejeDos))));
        }

    @Override
    public void conexion(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public byte datos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
