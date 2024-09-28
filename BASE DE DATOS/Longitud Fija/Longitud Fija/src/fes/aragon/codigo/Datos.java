/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

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
public class Datos {
    
    boolean rep=true;
    String valor;
    int cont;
    String dato=" ";
    ArrayList<String> list=new ArrayList<String>();
    Scanner guardar=new Scanner(System.in);
    
    
public void guardar (int a){
    valor=guardar.next();
    cont=valor.length();
    while(cont>a){
        System.out.println("Máximo de caracteres "+a);
        valor=guardar.next();
        cont=valor.length();
    }
    
    for(int i=0;i<a-cont;i++){
        valor=valor+"*/";
    }
        dato=dato+valor;
}

public void archivo(){
    try{

    //PrintWriter escribir=new PrintWriter(new BufferedWriter(new FileWriter(new File("registroalumno.txt"))));
    
    File archivo= new File ("registroalumno.txt");
    FileWriter escritor=new FileWriter(archivo);
    BufferedWriter bloque=new BufferedWriter(escritor);
    PrintWriter escribir=new PrintWriter(bloque);
   
    
    for (int i=0;i<list.size();i++) {
        escribir.append(list.get(i)+"\r\n");
    }
    escribir.close();
    }

    catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al guardar");
}
}
public void crea(){
do {
    System.out.print("Escribe Alumno:\n");
        guardar (40);
    System.out.println("Escribe No. de Cuenta: ");
        guardar (11);
    System.out.println("Escribe la clave de la escuela: ");
        guardar (7);
    System.out.println("Escribe el semestre: ");
        guardar (2);
    System.out.println("Escribe clave de carrera: ");
        guardar (3);
        
        list.add(dato);
       dato=" ";
        
        
            System.out.println("Agregar otro resgistro?\n 1=si\t2=no");
            if(guardar.nextInt()==2) {rep=false;}
}
        while(rep==true);
            archivo();
}
}