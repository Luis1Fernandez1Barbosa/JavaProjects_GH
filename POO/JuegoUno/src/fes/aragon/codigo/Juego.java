package fes.aragon.codigo;

public class Juego {

    private Jugador jugador;
    private Dado dadoUno;
    private Dado dadoDos;

    public Juego() {
    }

    public void iniciarJuego(String nombre) {
        this.jugador = new Jugador(nombre);
        this.dadoUno = new Dado();
        this.dadoDos = new Dado();
        while (this.jugador.getCredito().getCredito()> 0){
            comprobarResultado();
            System.out.println(this.jugador.toString());
        }      
    }

    private void comprobarResultado() {
        this.dadoUno.lanzar();
        this.dadoDos.lanzar();
        int suma = this.dadoUno.getCara() + this.dadoDos.getCara();
        if (suma==7){
            this.jugador.getCredito().incremento();
        }else{
            this.jugador.getCredito().decremento();
        }
    }
    }



