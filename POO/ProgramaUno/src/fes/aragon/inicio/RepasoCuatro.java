package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class RepasoCuatro {

    public static void main(String[] args) {
        String no1 = JOptionPane.showInputDialog(null, "Dame el 1er. número");
        String no2 = JOptionPane.showInputDialog(null, "Dame el 2do. número");
        String no3 = JOptionPane.showInputDialog(null, "Dame el 3er. número");
        int a = Integer.parseInt(no1);
        int b = Integer.parseInt(no2);
        int c = Integer.parseInt(no3);
        if (a > b) {
            if (a > c) {
                if (c > b) {
                    JOptionPane.showMessageDialog(null, "Mayor:" + a + " Medio:" + c + " Menor:" + b);
                } else {
                    JOptionPane.showMessageDialog(null, "Mayor:" + a + " Medio:" + b + " Menor:" + c);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mayor:" + c + " Medio:" + a + " Menor:" + b);
            }
        } else {
            if (b>c){
                if(a>c){
                    JOptionPane.showMessageDialog(null, "Mayor:" + b + " Medio:" + a + " Menor:" + c);
                } else {
                            JOptionPane.showMessageDialog(null, "Mayor:" + b + " Medio:" + c + " Menor:" + a);
                    }
            } else {
                            JOptionPane.showMessageDialog(null, "Mayor:" + c + " Medio:" + b + " Menor:" + a);
                    }
            }
        }
    }

                                
           
            
        
    

