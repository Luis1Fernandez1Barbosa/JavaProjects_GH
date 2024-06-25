package fes.aragon.codigo;


public class SangreFria extends Vertebrados {
    private String tempeVariable;

    public SangreFria(String tempeVariable, String conColumna, String tipo, String sangre, String nombre) {
        super(conColumna, tipo, sangre, nombre);
        this.tempeVariable = tempeVariable;
    }
    

    public String getTempeVariable() {
        return tempeVariable;
    }
    
}
