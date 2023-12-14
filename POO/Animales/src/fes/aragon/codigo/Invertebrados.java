
package fes.aragon.codigo;

public class Invertebrados extends Animales {
	
	private String sinColumna;

    public Invertebrados(String sinColumna, String tipo, String sangre, String nombre) {
        super(tipo, sangre, nombre);
        this.sinColumna = sinColumna;
 }

    public String getSinColumna() {
        return sinColumna;
    }
    
}

        
