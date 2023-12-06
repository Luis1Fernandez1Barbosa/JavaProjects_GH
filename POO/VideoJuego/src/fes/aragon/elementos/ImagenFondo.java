/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;
import fes.aragon.interfase.Acciones;
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
public class ImagenFondo implements Acciones{
    private Image imagen=null;
    private Image imagenDos=null;
    private Component componente;
    private int x =-80;
    private int y;
    private static ImagenFondo objetoUnico;
    private MediaTracker tracker;
    
        public static ImagenFondo getImagenFondo(){
             if(objetoUnico == null); {
                objetoUnico=new ImagenFondo(); 
            }return objetoUnico;        
}                      
             private ImagenFondo (){                 
             }
             public void configuracion(Component componente, String archivo, String personaje) {
                 this.componente=componente;
                 tracker = new MediaTracker(componente);
                 Toolkit herran = Toolkit.getDefaultToolkit();
                 imagen= herran.getImage(getClass().getResource("/fes/aragon/recursos/" + archivo));                
                 imagenDos= herran.getImage(getClass().getResource("/fes/aragon/recursos/" + personaje));
                 tracker.addImage(imagen, 1);
                 tracker.addImage(imagenDos, 2);
                 
                 try{
                     tracker.waitForAll();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             


    @Override
    public void pintar(Graphics2D g) {
        g.drawImage(imagen, 0, 0, this.componente.getWidth(), this.componente.getHeight(), null);
        g.drawImage(imagenDos, y, 50, 50, 50, null);
        }

    @Override
    public void teclado(KeyEvent e) {
        }

    @Override
    public void raton(KeyEvent e) {
        }

    @Override
    public void calculo() {
        if(y>this.componente.getHeight()+10){
            y=-20;
        }else{
            y+=7;
        }
       }
    
}
