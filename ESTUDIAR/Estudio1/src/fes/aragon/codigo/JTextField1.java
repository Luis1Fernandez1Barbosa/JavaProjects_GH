 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin01
 */
public class JTextField1 extends JFrame {

    private JTextField1 campoTexto1, campoTexto2, campoTexto3;
    private JPasswordField campoContraseña;

    //configurar 1ra GUI
    /**
     * Creates new form JTextField1
     */
    public JTextField1() {
        super();

        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        //crear campo de texto con tamaño predeterminado
        campoTexto1 = new JTextField(20);
        contenedor.add(campoTexto1);

        //crear campo de texto con tamaño predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        contenedor.add(campoTexto2);

        //crear campo de texto con texto predetermindao
        //20 elementos visibles y sin manejador de eventos 
        campoTexto3 = new JTextField("Campo de Texto no editable", 20);
        campoTexto3.setEditable(false);
        contenedor.add(campoTexto3);

        //crear campo con contraseña con texto predeterminado
        campoContraseña = new JPasswordField("Texto Oculto");
        contenedor.add(campoContraseña);

        //Registrar manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTExto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
 
        campoContraseña.addActionListener(manejador);
        
        setSize(400, 300);
        setVisible(true);
        
    } //fin de constructor de JTextField
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTextField1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTextField1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTextField1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTextField1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTextField1().setVisible(true);
            }
        });
    }
    JTextField1 aplicacion=new JTextField1();
    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

//clase interna privada para el manejor de eventos
private class ManejadorCampoTexto implements ActionListener {
    
    //procesar eventos de campo de texto
    public void actionPerfomed (ActionEvent evento)
    {
        String cadena = "";
        
        //el usuario oprimio Intro en objeto JTextField_campoTexto1
        if (evento.getSource()== campoTexto1)
            cadena = "campoTexto1: "+evento.getActionCommand();
        
        //el usuario oprimio Intro en objeto JTextField_campoTexto2
        if (evento.getSource()== campoTexto2)
            cadena = "campoTexto2: "+evento.getActionCommand();
       
        //el usuario oprimio Intro en objeto JTextField_campoTexto3
        if (evento.getSource()== campoTexto3)
            cadena = "campoTexto3: "+evento.getActionCommand();
  
        //el usuario oprimio Intro en objeto JTextField_campoContraseña
        if (evento.getSource()==campoContraseña){
            cadena= "campoContraseña; "+ new String(campoContraseña.getPassword());
    }
    JOptionPane.showMessageDialog(null,cadena);
}
}}
