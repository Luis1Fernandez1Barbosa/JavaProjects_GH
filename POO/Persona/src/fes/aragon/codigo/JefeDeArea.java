package fes.aragon.codigo;

public class JefeDeArea extends Persona {

    public JefeDeArea(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double incrementoSueldo() {
    return this.getSueldo()*2;
    }
    
}
