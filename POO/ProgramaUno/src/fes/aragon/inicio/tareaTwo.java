package fes.aragon.inicio;
import javax.swing.JOptionPane;
public class tareaTwo {

    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame un número");
        int numUno = Integer.parseInt(dato);
        String cad = "";
        int i = 1;
        do {
            cad = cad+numUno + "x" + i + "=" + (numUno * i) + "\n";
            i++;
        }
        while(i<=100);{
     System.out.println(""+cad);
    }
    }
}
