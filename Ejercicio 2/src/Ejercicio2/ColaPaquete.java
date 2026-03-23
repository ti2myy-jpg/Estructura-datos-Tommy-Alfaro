/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class ColaPaquete {

    private Nodo frente;
    private Nodo fin;
    

    public ColaPaquete() {
    
        this.frente = null;
        this.fin = null;

    }

    public void encolar(String nombre,String paquete,String tipo,int peso) {
        
      
        Nodo nuevo = new Nodo(nombre,paquete,tipo,peso);
        if (fin != null) {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo; 
        if (frente == null) {
            
            frente = nuevo;
            

        }
    
    }

  public void mostrar(){
        if(frente==null){
            System.out.println("subdesbordamiento");
            return;
        }
        Nodo actual =frente ;
        System.out.println("Contendido de pilas: ");
        while(actual != null){
            if(actual.getTipo()=="Urgente"){
                 System.out.println( actual.getPaquete()+ " " + actual.getNombre()+ " " + actual.getPeso()+ " " + actual.getTipo());
                 actual=actual.getSiguiente();
            }
            System.out.println(actual.getPaquete()+ " " + actual.getNombre()+ " " + actual.getPeso()+ " " + actual.getTipo());
            
            
       actual=actual.getSiguiente();
        }
    }

    public boolean esVacia() {
        return frente == null;
    }
}
