/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import fes.aragon.codigo.Lista;

/**
 *
 * @author Admin01
 */
public class Buscar {
    
        DataInputStream archivo = null;
        int clave;
        String nombre = new String("");
        int edad = 0;
        BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));

  public void busca() throws FileNotFoundException, IOException{
         System.out.println("Dame la clave del registro que buscas:");
           int a=Integer.parseInt(teclado.readLine());    
         
                archivo = new DataInputStream(new FileInputStream("registroalumno.xls"));
                clave = archivo.readInt();
                nombre = archivo.readUTF();
                edad = archivo.readInt();
                
                if(a==clave){
             try {
            archivo = new DataInputStream(new FileInputStream("registroalumno.xls"));
            while (true) {
        //   String line =( "archivo.equals(a)");
         
          
                System.out.println("tu clave es:"+clave+"");   
               
                System.out.println("tu nombre:"+nombre+"");
               
                System.out.println("tu edad:"+edad+"");
                                  break;

            }
           
        } catch (FileNotFoundException fnfe) {
        } catch (IOException ioe) {
        }}
    }
}