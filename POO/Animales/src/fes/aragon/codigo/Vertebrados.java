package fes.aragon.codigo;

public class Vertebrados extends Animales {
	
	private String conColumna;

    public Vertebrados(String conColumna, String tipo, String sangre, String nombre) {
        super(tipo, sangre, nombre);
        this.conColumna = conColumna;
    }

    public String getConColumna() {
        return conColumna;
    }
}
   
           