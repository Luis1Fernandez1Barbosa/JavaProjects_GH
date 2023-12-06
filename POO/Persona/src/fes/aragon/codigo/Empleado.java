package fes.aragon.codigo;

public class Empleado extends Persona {

    public Empleado(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    
    
    @Override
    public double incrementoSueldo() {
        return this.getSueldo() * 1.5;
    }
    
}
