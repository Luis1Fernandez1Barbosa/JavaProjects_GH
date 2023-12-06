package fes.aragon.inicio;

import fes.aragon.codigo.Componentes;
import fes.aragon.codigo.TiroParabolico;
import javax.swing.JOptionPane;

public class Inicio {
    public static void main(String[] args) {
    TiroParabolico objetoUno = new TiroParabolico(14000, 45);
    Componentes [] datos =objetoUno.calculoDeComponentes(32);
    TiroParabolico objetoDos = new TiroParabolico(1/4, 160);
    Componentes [] datos1=objetoDos.calculoDeComponentes(3);
    
        for (Componentes objeto : datos) {
            System.out.println("Tiempo: "+objeto.getTiempo()+"\tComponente X: "+objeto.getX()+"\t Componente Y: "+objeto.getY());
        } 
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n");
        for (Componentes objeto : datos1) {
            System.out.println("Tiempo: "+objeto.getTiempo()+"\tComponente X: "+objeto.getX()+"\t Componente Y: "+objeto.getY());
        }
          System.out.println("-------------------------------------------------------------------------------------------------------------------\n");
    
        JOptionPane.showMessageDialog(null,"Altura Maxima 1:\n"+objetoUno.alturaMaxima()+"  U");
        JOptionPane.showMessageDialog(null, "Alcance:\n"+objetoUno.alcance()+"  U");
        
        objetoUno.setGrado(55);
        JOptionPane.showMessageDialog(null, "Altura Maxima 2:\n"+objetoUno.alturaMaxima()+"  U");       
        JOptionPane.showMessageDialog(null, "Alcance:\n"+objetoUno.alcance()+"  U");
        
        objetoUno.setGrado(87);
        JOptionPane.showMessageDialog(null, "Altura Maxima 2:\n"+objetoUno.alturaMaxima()+"  U");       
        JOptionPane.showMessageDialog(null, "Alcance:\n"+objetoUno.alcance()+"  U");
        
        objetoUno.setGrado(90);
        JOptionPane.showMessageDialog(null, "Altura Maxima 1_2:\n"+objetoDos.alturaMaxima()+"  U");       
        JOptionPane.showMessageDialog(null, "Alcance:\n"+objetoDos.alcance()+"  U");
    }
   
}  