/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec05;

/**
 *
 * @author tommy
 */
public class PilaDinamica {
    
    private Nodo cima;
    
    public PilaDinamica(){
    this.cima=null;
    
}
    public void push(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(cima);
        cima= nuevoNodo;
        
    }
    public int pop(){
        if(cima ==null){
            System.out.println("Subdesbordamiento");
            return -1;
        }
        int dato=cima.getDato();
        cima=cima.getSiguiente();
        return dato;
    }
    public void mostrar(){
        if(cima==null){
            System.out.println("subdesbordamiento");
            return;
        }
        Nodo actual =cima;
        System.out.println("Contendido de pilas: ");
        while(actual != null){
            System.out.println(actual.getDato());
            actual=actual.getSiguiente();
        }
    }
}
