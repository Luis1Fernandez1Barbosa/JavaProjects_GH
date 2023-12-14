package fes.aragon.inicio;
import javax.swing.JOptionPane;
public class tareaOne {
    public static void main(String[] args){
        String dato=JOptionPane.showInputDialog(null,"Dame un número");
        int i=1;
        int numUno=Integer.parseInt(dato);
        String cad="";
        while(i<10){
            cad=cad+numUno+"x"+i+"="+(i*numUno)+"\n";
            i++;
    } JOptionPane.showMessageDialog(null,cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
         
    }
}
