package fes.aragon.inicio;

import fes.aragon.codigo.Alumno;

public class Inicio {
    public static void main(String[] args){
         Alumno alumno=new Alumno("fsd", "dfsaf", "sdfsad", "321", "Mexico");
         Alumno alumnoDos=new Alumno("ew", "fgrws", "fdsa", "421","Peru");
         
         System.out.println(alumno.getApellidoPaterno()+"\n"+alumnoDos.getApellidoPaterno());
         System.out.println(alumno.getNombre()+alumnoDos.getNombre()+"\t"+alumno.getPais());



    }
}
