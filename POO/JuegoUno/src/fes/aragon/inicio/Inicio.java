
package fes.aragon.inicio;

import fes.aragon.codigo.Juego;

public class Inicio {
    public static void main(String[] args) {
        Juego [] juego = new Juego[10];
        for (int i = 0; i < 10; i++) {
            juego[i]= new Juego();
        }
        int indice= 1;
        for (Juego juegos : juego) {
            juegos.iniciarJuego("Jugador:"+ indice);
            indice ++;
        }
        
        
    }
}
