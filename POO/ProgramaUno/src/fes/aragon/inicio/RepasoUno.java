package fes.aragon.inicio;
import javax.swing.JOptionPane;
public class RepasoUno {
    public static void main(String[] args) {
        String rad=JOptionPane.showInputDialog(null,"Escriba el radio","CIRCULO",JOptionPane.INFORMATION_MESSAGE);
        float radio=Float.parseFloat(rad);
        float area=0;
        float perimetro=0;
        perimetro=(float)(2*Math.PI*radio);
        area=(float)(Math.PI*Math.pow(radio,2));
        JOptionPane.showMessageDialog(null,"PERIMETRO=\n"+perimetro,"CIRCULO",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"AREA=\n"+area,"CIRCULO",JOptionPane.INFORMATION_MESSAGE);
        Object color=JOptionPane.showInputDialog(null, "Seleccione color","COLORES",JOptionPane.QUESTION_MESSAGE,null,
                    new Object[]{"Seleccionar","Amarillo","Azul","Rojo","Morado","Cafe","Negro","Verde"},null);
        String colr=String.valueOf(color);
        JOptionPane.showConfirmDialog(null,"¿Está seguro de su decisión?","CIRCULO "+colr.toUpperCase(),JOptionPane.YES_NO_CANCEL_OPTION);
    }
}       