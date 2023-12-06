/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfas.Acciones;
import fes.aragon.modelo.Estorbos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Admin01
 */
public class Estorbo implements Acciones {

    private ArrayList<Estorbos> elementos = new ArrayList<Estorbos>();
    private Component componente;
    private int desplaza = 2;
    private int diametro = 40;
    private int radio = 20;
    private Image imagen = null;
    private MediaTracker tracker;

    private static Estorbo objetoUnico;

    public static Estorbo getEstorbo() {
        if (objetoUnico == null) {
            objetoUnico = new Estorbo();
        }
        return objetoUnico;
    }

    private Estorbo() {

    }

    public ArrayList<Estorbos> getElementos() {
        return elementos;
    }

    public void configurar(Component componente, String archivo) {
        this.componente = componente;
        tracker = new MediaTracker(componente);
        Random rd1 = new Random();
        int x = 0;
        int y = 0;
        for (int i = 0; i < 10; i++) {
            y = rd1.nextInt(250);
            elementos.add(new Estorbos(x, y, x + radio, y + radio, diametro));
            x += diametro;
        }
        Toolkit herram = Toolkit.getDefaultToolkit();
        imagen = herram.getImage(getClass().getResource("/fes/aragon/recursos/" + archivo));
        tracker.addImage(imagen, 1);
        try {
            tracker.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pintar(Graphics2D g) {
        for (int i = 0; i < elementos.size(); i++) {
            g.drawOval(elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getRadio(), elementos.get(i).getRadio());
            g.drawImage(imagen, elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getRadio(), elementos.get(i).getRadio(), null);
            if (i == 0) {
                g.setColor(new Color(255, 255, 255));
                g.drawOval(elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getRadio(), elementos.get(i).getRadio());
                g.drawLine(elementos.get(i).getCx(), elementos.get(i).getCy(), elementos.get(elementos.size() - 1).getCx(), elementos.get(elementos.size() - 1).getCy());
                g.setColor(new Color(0, 0, 0));
            } else if (i < elementos.size() - 1) {
                g.drawLine(elementos.get(i).getCx(), elementos.get(i).getCy(), elementos.get(elementos.size() - 1).getCx(), elementos.get(elementos.size() - 1).getCy());
            }
        }
    }

    @Override
    public void teclado(KeyEvent e) {
    }

    @Override
    public void raton(KeyEvent e) {
    }

    @Override
    public void calculo() {
        for (Estorbos elemento : elementos) {
            if (elemento.isAbajo()) {
                if (elemento.getYy() >= this.componente.getHeight() - diametro) {
                    elemento.setArriba(true);
                    elemento.setAbajo(false);
                } else {
                    elemento.setYy(elemento.getYy() + desplaza);
                    elemento.setCy(elemento.getYy() + radio);
                }
            }
            if (elemento.isArriba()) {
                if (elemento.getYy() <= 0) {
                    elemento.setAbajo(true);
                    elemento.setArriba(false);
                } else {
                    elemento.setYy(elemento.getYy() - desplaza);
                    elemento.setCy(elemento.getYy() + radio);
                }
            }
            if (elemento.isIzq()) {
                if (elemento.getXx() <= 0) {
                    elemento.setDer(true);
                    elemento.setIzq(false);
                } else {
                    elemento.setXx(elemento.getXx() - desplaza);
                    elemento.setCx(elemento.getXx() + radio);
                }
            }
            if (elemento.isDer()) {
                if (elemento.getXx() >= this.componente.getWidth() - diametro) {
                    elemento.setIzq(true);
                    elemento.setDer(false);
                } else {
                    elemento.setXx(elemento.getXx() + desplaza);
                    elemento.setCx(elemento.getXx() + radio);
                }
            }
        }
        for (int i = 0; i < elementos.size(); i++) {
            Estorbos actual = elementos.get(i);
            for (int j = i + 1; j < elementos.size(); j++) {
                Estorbos objetivo = elementos.get(j);
                int x1x2 = (int) Math.pow((actual.getCx() - objetivo.getCx()), 2);
                int y1y2 = (int) Math.pow((actual.getCy() - objetivo.getCy()), 2);
                int distancia = (int) Math.sqrt(x1x2 + y1y2);
                if (distancia <= diametro) {
                    if (objetivo.isAbajo()) {
                        objetivo.setArriba(true);
                        objetivo.setAbajo(false);
                    } else if (objetivo.isArriba()) {
                        objetivo.setAbajo(true);
                        objetivo.setArriba(false);
                    } else if (objetivo.isDer()) {
                        objetivo.setIzq(true);
                        objetivo.setDer(false);
                    } else if (objetivo.isIzq()) {
                        objetivo.setDer(true);
                        objetivo.setIzq(false);

                    }

                }
                if (actual.isAbajo()) {
                    actual.setArriba(true);
                    actual.setAbajo(false);
                } else if (actual.isArriba()) {
                    actual.setAbajo(true);
                    actual.setArriba(false);
                } else if (actual.isDer()) {
                    actual.setIzq(true);
                    actual.setDer(false);
                } else if (actual.isIzq()) {
                    actual.setDer(true);
                    actual.setIzq(false);

                }
                if (i == 0) {
                    objetivo.setEliminar(true);
                    objetivo.setQuienElimino("Roca");
                }
            }
        }
    }
}
