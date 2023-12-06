package fes.aragon.inicio;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class RepasoDos {
    public static void main(String[] args) {
        
        String mensaje="";
        String eda=JOptionPane.showInputDialog(null,"Dame la edad");
        int edad=Integer.parseInt(eda);
        if(edad>=18){
            mensaje="Mayor de edad";
            }else{
            mensaje="Menor de edad";}
            JOptionPane.showMessageDialog(null,mensaje);

}
}


