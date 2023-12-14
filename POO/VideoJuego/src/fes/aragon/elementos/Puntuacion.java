/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfase.Acciones;
import fes.aragon.modelo.Estorbos;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.JPanel;

/**
 *
 * @author Admin01
 */
public class Puntuacion implements Acciones {
    private JPanel panel;
    private int auto=10;
    private int cono=0;
    
    public Puntuacion(JPanel panel){
        this.panel=panel;
    }
    @Override
    public void pintar(Graphics2D g) {
        g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        g.drawString("Auto: " + auto, 0,20);
        g.drawString("Cono: " + cono, 300, 20);
    }

    @Override
    public void teclado(KeyEvent e) {
        }

    @Override
    public void raton(KeyEvent e) {
        }

    @Override
    public void calculo() {
        Estorbo estorbo=Estorbo.getEstorbo();
        if(estorbo.getElementos().size()>1) {
            for (Estorbos elemento: estorbo.getElementos()){
                if (elemento.getQuienElimino().equals("auto")) {
                auto -= 1;
            } 
                else if (elemento.getQuienElimino().equals("cono")) {                  
                cono += 1;
            }
            }
            Iterator iterador = estorbo.getElementos().iterator();
            while(iterador.hasNext()){
             Estorbos objeto = (Estorbos) iterador.next(); 
              if(objeto.isEliminar()){
               iterador.remove();
               }
            else {
                        estorbo.configurar(this.panel, "cono.png", "");
                        }
    }        
    }
    
    
}}
