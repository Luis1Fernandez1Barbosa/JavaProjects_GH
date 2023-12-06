/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Admin01
 */
public class Fondo extends JPanel {
    private Image imagen=null;
    private MediaTracker tracker;

    public Fondo(Component componente) {
        try {
            tracker= new MediaTracker(componente);
            Toolkit hx=Toolkit.getDefaultToolkit();
            imagen=hx.getImage(getClass().getResource("/fes/aragon/recursos/espacio.jpg"));
            tracker.addImage(imagen, 1);
            tracker.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(imagen, 0, 0,getSize().width,getSize().height, null);
    }
    
    
}
