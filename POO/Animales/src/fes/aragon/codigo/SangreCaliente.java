package fes.aragon.codigo;

import fes.aragon.codigo.Vertebrados;

public class SangreCaliente extends Vertebrados {
    	private String tempeConstante;

        
        public SangreCaliente(String tempeConstante, String conColumna, String tipo, String sangre, String nombre) {
        super(conColumna, tipo, sangre, nombre);
        this.tempeConstante = tempeConstante;
    }
    public String getTempeConstante() {
        return tempeConstante;
    }

                
}
