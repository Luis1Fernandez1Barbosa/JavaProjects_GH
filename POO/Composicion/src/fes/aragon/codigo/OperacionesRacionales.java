package fes.aragon.codigo;


public class OperacionesRacionales {

    private Racional racionalUno;
    private Racional racionalDos;

    public OperacionesRacionales(Racional racionalUno, Racional racionalDos) {
        this.racionalUno = racionalUno;
        this.racionalDos = racionalDos;
    }
    
    public Racional suma() {
        int numerador=(this.racionalUno.getNumerador()* this.racionalDos.getDenominador()+ 
                this.racionalUno.getNumerador()* this.racionalUno.getDenominador());
        int denominador=(this.racionalUno.getDenominador()*this.racionalDos.getDenominador());
        return new Racional(numerador, denominador);
    }    
    
    public Racional resta(){
        int numerador=(this.racionalUno.getNumerador()* this.racionalDos.getDenominador()- 
                this.racionalUno.getNumerador()* this.racionalUno.getDenominador());
        int denominador=(this.racionalUno.getDenominador()*this.racionalDos.getDenominador());
        return new Racional(numerador, denominador);
    }
    public Racional multiplicacion () {
        int numerador = (this.racionalUno.getNumerador()*this.racionalDos.getNumerador());
        int denominador = (this.racionalUno.getDenominador()*this.racionalDos.getDenominador());
        return new Racional (numerador,denominador);
    }
    public Racional division(){
        int numerador = (this.racionalUno.getNumerador()*this.racionalDos.getDenominador());
        int denominador = (this.racionalUno.getDenominador()*this.racionalDos.getNumerador());
        return new Racional (numerador, denominador);
    }

    public Racional getRacionalUno() {
        return racionalUno;
    }

    public Racional getRacionalDos() {
        return racionalDos;
    }
    
}
