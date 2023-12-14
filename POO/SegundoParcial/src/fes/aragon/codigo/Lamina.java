
package fes.aragon.codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class Lamina extends JPanel implements ActionListener{
    private JLabel Nombre=new JLabel("Nombre");
    private JLabel aPaterno=new JLabel("Apellido Paterno");
    private JLabel aMaterno=new JLabel("Apellido Materno");
    
    private JPanel panel=new JPanel();
    
    private JButton botonUno= new JButton("Guardar");
    private JButton botonDos= new JButton("Leer");
    
    private JTextField cajaUna=new JTextField(10);
    private JTextField cajaDos=new JTextField(10);
    private JTextField cajaTres=new JTextField(10);
    

    public JTextField getCajaUna() {
        return cajaUna;
    }
    public JTextField getCajaDos() {
        return cajaDos;
    }
    public JTextField getCajaTres(){
       return cajaTres;
   }
    
    private JTextArea areaT= new JTextArea(30, 40);
    private JScrollPane scroll;
 
    public Lamina() {
        //agregando scroll   
       this.scroll=new JScrollPane(this.areaT);
        //agregando sonido al boton   
       this.botonUno.addActionListener(this);
       this.botonDos.addActionListener(this);
       
       
       panel.add(Nombre);
      
       panel.add(cajaUna);
       panel.add(aPaterno);       
       panel.add(cajaDos);
       panel.add(aMaterno);
       panel.add(cajaTres);
       
       panel.add(botonUno);
       panel.add(botonDos);
    
       
//BorderLayout
        JPanel bordePanel=new JPanel(new BorderLayout());
        bordePanel.setBorder(new TitledBorder("Escribe tus datos"));
        bordePanel.add(panel,BorderLayout.CENTER);
        this.add(bordePanel);
        this.add(scroll);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();
        
        if(origen==this.botonUno){
            this.areaT.append(this.cajaUna.getText()+ "\n");
            this.areaT.append(this.cajaDos.getText()+ "\n");
            this.areaT.append(this.cajaTres.getText()+ "\n");
            
            this.cajaUna.setText("");
            this.cajaDos.setText("");
            this.cajaTres.setText("");
            this.botonUno.transferFocus();
            this.botonDos.transferFocus();   
        }
        
    }
   
 
    } 
    
    

