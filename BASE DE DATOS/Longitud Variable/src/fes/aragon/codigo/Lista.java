/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin01
 */
public class Lista {
   
    boolean rep=true;
    String valor;
    String dato=" ";
    ArrayList<String> list = new ArrayList<String>();
    Scanner guardar=new Scanner(System.in);
  
    private static String removeLastChar(String str) {  
        
        return str.substring(0,str.length() - 1);
        
    }

    public void guardar(){
        valor=guardar.next();
        valor=valor+"|";
        dato=dato+valor.toUpperCase();
    }
    public void archivo() {
        try{
            PrintWriter escribir=new PrintWriter(new BufferedWriter(new FileWriter(new File("registroalumno.txt"))));
            
            for (int i = 0; i < list.size(); i++) 
                escribir.append(list.get(i)+removeLastChar(valor)+("/EOL/NL"));
               
            escribir.close();
        } catch(IOException e){
                JOptionPane.showMessageDialog(null,"error al guardar");                       
                }
        }
    public void crea(){
        do{
            System.out.println("Nombre: ");
                  guardar();
            System.out.println("Numero de cuenta: ");
                  guardar();
            System.out.println("Clave de carrera: ");
                  guardar();
            System.out.println("Semestre: ");
                  guardar();
            System.out.println("Clave de la escuela: ");
                  guardar();
                 
            
                list.add(dato);
                dato="";
            System.out.println("Agregar otro registro? \n  1=si\t  2=no\t");
          
            
                  if(guardar.nextInt()==2){
                      System.out.println("/EOF\n"+"END=2"); rep=false;
                  }
            }     
             while (rep==true);
               
            archivo();
        }
        }