package fes.aragon.codigo;

public class Jugador {

    private String nombre;
    private Credito credito;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.credito = new Credito();
    }

    public String getNombre() {
        return nombre;
    }

    public Credito getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", credito=" + credito + '}';
    }
    
}
