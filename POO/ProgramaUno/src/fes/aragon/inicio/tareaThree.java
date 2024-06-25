package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class tareaThree {

    public static void main(String[] args) {
        String dato1 = JOptionPane.showInputDialog(null, "Dame tres números");
        String dato2 = JOptionPane.showInputDialog(null, "");
        String dato3 = JOptionPane.showInputDialog(null, "");
        int a = Integer.parseInt(dato1);
        int b = Integer.parseInt(dato2);
        int c = Integer.parseInt(dato3);
        if (a > b) {
            if (a > c) {
                System.out.println("el mayor es " + a);
            } else {
                if (b > c) {
                    System.out.println("la mediana es " + b);
                } else {
                    System.out.println("el menor es " + c);
                }
            }
        } else{
            if (b > c) {
            System.out.println("el mayor " + b);
        } else {
            if (a > c) {
                System.out.println("la mediana es " + a);
            } else {
                System.out.println("el menor " + c);
            }
        }
    }

}

}
