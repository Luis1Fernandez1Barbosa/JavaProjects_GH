/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfase.Acciones;
import fes.aragon.modelo.Estorbos;
import fes.aragon.elementos.Estorbo;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Admin01
 */
public class Automovil implements Acciones {

    private int x = 0;
    private int y = 0;
    private int puntaX = 0;
    private int puntaY = 0;
    private int desplaza = 8;
    private Image imagen = null;
    private MediaTracker tracker;
    private Component componente;
    private static Automovil objetoUnico;
    private boolean arriba = false;
    private boolean abajo = false;
    private boolean izq = false;
    private boolean der = false;

    public static Automovil getAutomovil() {
        if (objetoUnico == null) {
            objetoUnico = new Automovil();
        }
        return objetoUnico;
    }

    private Automovil() {

    }

    public void configurar(Component componente, String archivo) {
        this.componente = componente;
        tracker = new MediaTracker(componente);
        Toolkit herram = Toolkit.getDefaultToolkit();
        imagen = herram.getImage(getClass().getResource("/fes/aragon/recursos/" + archivo));
        tracker.addImage(imagen, 1);
        try {
            tracker.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        x = this.componente.getWidth() / 2;
        y = this.componente.getHeight() - 50;
        puntaX = x + (imagen.getWidth(componente) / 2);
        puntaY = y;
    }

    @Override
    public void pintar(Graphics2D g) {
        g.drawImage(imagen, x, y, null);
        g.drawRect(x, y, imagen.getWidth(componente), imagen.getHeight(componente));
        g.drawOval(puntaX, puntaY, 4, 4);
    }

    @Override
    public void teclado(KeyEvent e) {
        int codigoTecla = e.getKeyCode();
        switch (codigoTecla) {
            case KeyEvent.VK_UP:
                this.arriba = true;
                this.abajo = false;
                this.izq = false;
                this.der = false;
                break;
            case KeyEvent.VK_DOWN:
                this.arriba = false;
                this.abajo = true;
                this.izq = false;
                this.der = false;
                break;
            case KeyEvent.VK_LEFT:
                this.arriba = false;
                this.abajo = false;
                this.izq = true;
                this.der = false;
                break;
            case KeyEvent.VK_RIGHT:
                this.arriba = false;
                this.abajo = false;
                this.izq = false;
                this.der = true;
                break;
        }
    }

    @Override
    public void raton(KeyEvent e) {
    }

    @Override
    public void calculo() {
        if (arriba) {
            if (y > 220) {
                y -= desplaza;
            }
        }
        if (abajo) {
            if (y < this.componente.getHeight() - 78) {
                y += desplaza;
            }
        }
        if (izq) {
            if (x > 100) {
                x -= desplaza;
            }
        }
        if (der) {
            if (x < this.componente.getWidth() - 145) {
                x += desplaza;
            }
        }
        puntaX = x;
        puntaY = y;
        //colisiones
        Estorbo estorbo = Estorbo.getEstorbo();
        for (Estorbos elemento : estorbo.getElementos()) {
            int x1x2 = (int) Math.pow((puntaX - elemento.getCx()), 2);
            int y1y2 = (int) Math.pow((puntaY - elemento.getCy()), 2);
            int distancia = (int) Math.sqrt(x1x2 + y1y2);
            if (distancia <= 20) {
                elemento.setEliminar(true);
                elemento.setQuienElimino("auto");
            }
           // EfectosMusica sonido= new EfectosMusica ("");
            //Thread hilo=new Thread(sonido);
            //hilo.start();
        }
    }
}
