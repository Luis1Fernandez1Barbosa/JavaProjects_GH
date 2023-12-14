/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
public class FondoDialogo extends JPanel {
    private Image imagen=null;
    private MediaTracker tracker;
    private final int maximo=156;
    private int transparencia= maximo;
    private boolean cambio=false;
            
    

    public FondoDialogo(Component componente, String Archivo) {
        try {
            tracker= new MediaTracker(componente);
            Toolkit hx=Toolkit.getDefaultToolkit();
            imagen=hx.getImage(getClass().getResource("/fes/aragon/recursos"+Archivo));
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
        g.setFont(new Font("Times New Roman",Font.PLAIN,40));
        g.setColor(new Color(255,255,255,transparencia));
        g.drawString("FES ARAGÓN", 5, 40);
        this.calculos();
    }
    private void calculos(){
        if (cambio) {
            transparencia++;
                if (transparencia==maximo){
                    cambio=false;
                }
                else {
                    transparencia++;
                     if (transparencia==0){
                        cambio=true;
                     }
                }
        }
    }
    
}

