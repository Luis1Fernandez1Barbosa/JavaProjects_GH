
package fes.aragon.codigo;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class Marco extends JFrame {
    public Marco()throws HeadlessException {
        this.setSize(1000, 600);
        this.setLocationRelativeTo(this);
        this.setTitle("Toma de Datos");
        this.setResizable(false);
        Lamina lamina=new Lamina() {};
        add(lamina);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img=kit.getImage(getClass().getResource("/fes/aragon/recurso/base.jpg"));
        this.setIconImage(img);
       
}
}
