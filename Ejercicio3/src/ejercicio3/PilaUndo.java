/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author tommy
 */
public class PilaUndo {
    
    private Nodo cima;
    
    public PilaUndo(){
    this.cima=null;
    
}
    public void push(String dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(cima);
        cima= nuevoNodo;
        
    }
    public void pop(){
        if(cima ==null){
            System.out.println("Subdesbordamiento");
           
        }
        cima=cima.getSiguiente();
        
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
