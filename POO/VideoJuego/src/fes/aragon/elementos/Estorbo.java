/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;
import fes.aragon.interfase.Acciones;
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
    private int longitud = 40;
    private int ancho = 30;
    private Image imagen = null;
    private Image imagenDos=null;
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

    public void configurar(Component componente, String archivo, String archivoDos) {
        this.componente = componente;
        tracker = new MediaTracker(componente);
        Random rd1 = new Random();
        int x = 100;
        int y = 100;
        for (int i = 0; i < 10; i++) {
            y = rd1.nextInt(300);
            elementos.add(new Estorbos(x, y, x, y, ancho, longitud));
            x += longitud;
        }
        Toolkit herram = Toolkit.getDefaultToolkit();
        imagen = herram.getImage(getClass().getResource("/fes/aragon/recursos/" + archivo));
        imagenDos = herram.getImage(getClass().getResource("/fes/aragon/recursos/" + archivoDos));
        tracker.addImage(imagen, 1);
        tracker.addImage(imagenDos, 2);
        try {
            tracker.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Toolkit herram1 = Toolkit.getDefaultToolkit();
        //imagenDos = herram1.getImage(getClass().getResource("/fes/aragon/recursos/" + archivo));
        //tracker.addImage(imagen, 2);
        //try {
       //    tracker.waitForAll();
        //} catch (InterruptedException e) {
          //  e.printStackTrace();
    }

    @Override
    public void pintar(Graphics2D g) {
        for (int i = 0; i < elementos.size(); i++) {
            g.drawRect(elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getAncho(), elementos.get(i).getLongitud());
            g.drawImage(imagen, elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getAncho(), elementos.get(i).getLongitud(), null);
            if (i == 0) {
                g.setColor(new Color(255, 255, 255));
                g.drawRect(elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getAncho(), elementos.get(i).getLongitud());
                //g.drawLine(elementos.get(i).getCx(), elementos.get(i).getCy(), elementos.get(elementos.size() - 1).getCx(), elementos.get(elementos.size() - 1).getCy());
                g.setColor(new Color(0, 0, 0));
            } else if (i < elementos.size() - 1) {
                //g.drawLine(elementos.get(i).getCx(), elementos.get(i).getCy(), elementos.get(elementos.size() - 1).getCx(), elementos.get(elementos.size() - 1).getCy());
            }
        }
        for (int i = 0; i < elementos.size(); i++) {
            g.drawRect(elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getAncho(), elementos.get(i).getLongitud());
            g.drawImage(imagenDos, elementos.get(i).getYy(), elementos.get(i).getXx(), elementos.get(i).getAncho(), elementos.get(i).getLongitud(), null);
            if (i == 0) {
                g.setColor(new Color(255, 255, 255));
                g.drawRect(elementos.get(i).getXx(), elementos.get(i).getYy(), elementos.get(i).getAncho(), elementos.get(i).getLongitud());
                //g.drawLine(elementos.get(i).getCx(), elementos.get(i).getCy(), elementos.get(elementos.size() - 1).getCx(), elementos.get(elementos.size() - 1).getCy());
                g.setColor(new Color(0, 0, 0));
            } else if (i < elementos.size() - 1) {
                //g.drawLine(elementos.get(i).getCx(), elementos.get(i).getCy(), elementos.get(elementos.size() - 1).getCx(), elementos.get(elementos.size() - 1).getCy());
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
                if (elemento.getYy() >= this.componente.getHeight()) {
                    elemento.setArriba(true);
                    elemento.setAbajo(false);
                } else {
                    elemento.setYy(elemento.getYy() + desplaza);
                    elemento.setCy(elemento.getYy() + ancho);
                }
            }
            if (elemento.isArriba()) {
                if (elemento.getYy() <= 0) {
                    elemento.setAbajo(true);
                    elemento.setArriba(false);
                } else {
                    elemento.setYy(elemento.getYy() - desplaza);
                    elemento.setCy(elemento.getYy() + ancho);
                }
            }
            if (elemento.isIzq()) {
                if (elemento.getXx() <= 0) {
                    elemento.setDer(false);
                    elemento.setIzq(false);
                } else {
                    elemento.setXx(elemento.getXx() - desplaza);
                    elemento.setCx(elemento.getXx() + ancho);
                }
            }
            if (elemento.isDer()) {
                if (elemento.getXx() >= this.componente.getWidth() - longitud) {
                    elemento.setIzq(false);
                    elemento.setDer(false);
                } else {
                    elemento.setXx(elemento.getXx() + desplaza);
                    elemento.setCx(elemento.getXx() + ancho);
                }
            }
        }
        for (int i = 0; i < elementos.size(); i++) {
            Estorbos actual = elementos.get(i);
            for (int j = i ; j < elementos.size(); j++) {
                Estorbos objetivo = elementos.get(j);
                int x1x2 = (int) Math.pow((actual.getCx() - objetivo.getCx()), 1);
                int y1y2 = (int) Math.pow((actual.getCy() - objetivo.getCy()), 1);
                int distancia = (int) Math.sqrt(x1x2 + y1y2);
                if (distancia <= longitud) {
                    if (objetivo.isAbajo()) {
                        objetivo.setArriba(false);
                        objetivo.setAbajo(true);
                    } else if (objetivo.isArriba()) {
                        objetivo.setAbajo(false);
                        objetivo.setArriba(true);
                    } else if (objetivo.isDer()) {
                        objetivo.setIzq(false);
                        objetivo.setDer(false);
                    } else if (objetivo.isIzq()) {
                        objetivo.setDer(false);
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
                    actual.setIzq(false);
                    actual.setDer(false);
                } else if (actual.isIzq()) {
                    actual.setDer(false);
                    actual.setIzq(false);

                }
               // if (i == 0) {
                   // objetivo.setEliminar(true);
                   // objetivo.setQuienElimino("Roca");
                   // EfectosMusica sonido= new EfectosMusica ("");
                   // Thread hilo=new Thread(sonido);
                   // hilo.start();
                }
            }
        }
    }

