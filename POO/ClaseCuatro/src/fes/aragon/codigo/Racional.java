package fes.aragon.codigo;


public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional(Racional racional) {
        this.numerador=racional.getNumerador();
        this.denominador=racional.getDenominador();
    }
    public void suma (int numerador, int denominador){
        this.numerador=(this.numerador * denominador)+(this.denominador * numerador);
        this.denominador=(this.denominador *denominador);
    }
            
    public void suma (Racional racional){
        this.numerador=(this.numerador * racional.getDenominador())+(this.denominador * racional.getNumerador());
        this.denominador=(this.denominador * racional.getDenominador());
    }
    
    public void resta (int numerador, int denominador){
        this.numerador=(this.numerador * denominador)-(this.denominador * numerador);
        this.denominador=(this.denominador * denominador);
    }
    public void resta (Racional racional){
        this.numerador=(this.numerador * racional.getDenominador())-(this.denominador * racional.getNumerador());
        this.denominador=(this.denominador * racional.getDenominador());
    }
    
    public void multiplicacion (int numerador, int denominador){
        this.numerador=(this.numerador*numerador);
        this.denominador=(this.denominador*denominador);
    } 
    
    public void multiplicacion (Racional racional){
        this.numerador=(this.numerador*racional.getNumerador());
        this.denominador=(this.denominador*racional.getDenominador());
    }
    
    public void division(int numerador, int denominador){
        this.numerador=(this.numerador*denominador);
        this.denominador=(this.denominador*numerador);
    }    
    
    public void division (Racional racional){
        this.numerador=(this.numerador*racional.getDenominador());
        this.denominador=(this.denominador*racional.getNumerador());
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }    
}