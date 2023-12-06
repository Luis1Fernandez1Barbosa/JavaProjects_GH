
package fes.aragon.codigo;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private int edad;

public Persona(String nombre, String aPaterno, String aMaterno, int edad) {
	this.nombre=nombre;
	this.aPaterno=aPaterno;
	this.aMaterno=aMaterno;
	this.edad=edad;
}
	
	public String getNombre () {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.edad=edad;
	}
	
	public String getaPaterno () {
	return aPaterno;
	}
	public void setaPaterno (String aPaterno) {
	this.aPaterno=aPaterno;
	}

	public String getaMaterno () {
	return aMaterno;
	}
	public void setaMaterno (String aMaterno){
	this.aMaterno=aMaterno;
	}

	public int getEdad (){
	return edad;
	}
	public void setEdad (int edad) {
	this.edad=edad;
	}

//to String()//

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", edad=" + edad + '}';
    }
}
