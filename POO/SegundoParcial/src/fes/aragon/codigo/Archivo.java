package fes.aragon.codigo;
import java.io.Serializable;
import javax.swing.JLabel;

public class Archivo implements Serializable {
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	
public Archivo(String nombre, String aPaterno, String aMaterno, int edad) {
	this.nombre=nombre;
	this.aPaterno=aPaterno;
	this.aMaterno=aMaterno;
	
}

    public Archivo() {
        }

    Archivo(JLabel Nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public String getNombre () {
	return nombre;
	}
	public void setNombre(String nombre) {
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

//to String()//

    @Override
    public String toString() {
        return "";
    }
}    

