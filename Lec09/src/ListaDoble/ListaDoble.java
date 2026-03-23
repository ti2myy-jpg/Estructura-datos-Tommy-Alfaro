/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

/**
 *
 * @author tommy
 */
public class ListaDoble {

    private Nodo cabeza;
    
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        }
    }
    
    public void mostrarAdelante(){
        Nodo actual= cabeza;
        while(actual!=null){
            System.out.println(actual.getDato()+ " <-->");
        }
        System.out.println("NULL");
    }
    public void mostrarAtras(){
        Nodo actual = cabeza;
        if(actual==null){
            return;
        }
        while (actual.getSiguiente()!=null){
            actual = actual.getSiguiente();
            
        } while(actual!=null){
            System.out.println(actual.getDato()+ " <-->");
            actual = actual.getAnterior();
        }
        System.out.println("NULL");
    }
    
}
