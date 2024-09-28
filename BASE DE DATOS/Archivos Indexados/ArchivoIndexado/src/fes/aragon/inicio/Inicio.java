/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Lista;
import fes.aragon.codigo.Buscar;
import java.io.IOException;

/**
 *
 * @author Admin01
 */
public class Inicio {
    public static void main(String[] args) throws IOException{
        
        
        Lista arch1= new Lista();
        arch1.archivo();
        arch1.crea();
        arch1.guardar();
        
       
        Buscar bsc=new Buscar();
        bsc.busca();
    }
}