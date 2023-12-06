/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;
    
public abstract class Animales {

	private String tipo;
	private String sangre;	
	private String nombre;

		Animales(String tipo, String sangre, String nombre){
			this.tipo=tipo;
			this.sangre=sangre;
			this.nombre=nombre;
}

    public String getTipo() {
        return tipo;
    }

    public String getSangre() {
        return sangre;
    }

    public String getNombre() {
        return nombre;
    }
                
	public abstract class Vertebrados{};

	public abstract class invertebrados{};
}

