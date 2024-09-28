/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;
    import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Admin01
 */
public class MeDi {
    class Nodo {
        int info;
        Nodo sig;
    }
    
    private Nodo raiz;
    
   public MeDi () {
        raiz = null;
    }
    
    public void insertar (int x){
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null){
            nuevo.sig = null;
            raiz = nuevo;
        }else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public int extraer (){
        if (raiz != null){
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }else{
           return Integer.MAX_VALUE; 
    }
    }
    
    public void imprimir (){
        Nodo reco = raiz;
        System.out.println("Lista de todos los elementos de la");
        while (reco != null){
            System.out.println(reco.info);
            reco = reco.sig;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner teclado;
        int d;
        
        teclado = new Scanner(System.in);
        
        MeDi A = new MeDi();
        System.out.println("Pila A");
        A.insertar (10);
        A.insertar (40);
        A.insertar (3);
        A.imprimir();
        System.out.println("Extraemos de la pila: " + A.extraer());
        
        MeDi B = new MeDi();
        System.out.println("Pila B");
        B.insertar (5);
        B.insertar (3);
        B.imprimir ();
        
        MeDi C = new MeDi();
        System.out.println("Pila C");
        C.insertar (1);
        C.insertar (9);
        C.imprimir ();
        
        System.out.print("Dato a ingresar: ");
        d=teclado.nextInt();
        System.out.println(d);
        
        System.out.print("A que pila lo desea ingresar?  A, B o C (Solo mayúsculas por favor): ");
        char u = teclado.next().charAt(0);
        System.out.println("Pila " + u);
        
        if (u=='A'){
            A.esVacia();
            if (llena()==true){
                B.esVacia();
                if (llena()==true){
                    C.esVacia();
                    if(llena()==true){
                        System.out.println("No es posible ingresar el dato, todas las pilas estan llenas");
                    }else {
                        C.insertar(d);
                    }
                }else {
                    B.insertar(d);
                }
            }else {
                A.insertar(d);
            }
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
}
