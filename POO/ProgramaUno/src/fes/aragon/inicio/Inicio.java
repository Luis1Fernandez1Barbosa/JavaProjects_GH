package fes.aragon.inicio;
import javax.swing.JOptionPane;
public class Inicio {
    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog(null,"Dame un número");
        int numUno=Integer.parseInt(dato);
        String cad="";
        for (int i=1;i<=30;i++){
            cad=cad+numUno+"x"+i+"="+(numUno*i)+"\n";
        }
        JOptionPane.showMessageDialog(null,cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
