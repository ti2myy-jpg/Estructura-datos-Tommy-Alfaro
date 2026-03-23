/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

/**
 *
 * @author tommy
 */
public class ListaCircular {
    
private Nodo cabeza;    
private Nodo ultimo;

public ListaCircular(int valor){
    this.cabeza=null;
    this.ultimo=null;
}
public void insertar(int valor){
    Nodo nuevo = new Nodo(valor);
    if(cabeza==null){
        cabeza= nuevo;
        ultimo= nuevo;
        nuevo.setSiguiente(cabeza);
    }else{
        nuevo.setSiguiente(cabeza);
        ultimo.setSiguiente(nuevo);
        ultimo =nuevo;
    }
    
}

public void recorrer(){
    if(cabeza == null){
        System.out.println("Lista Vacio");
    return;
    }
    Nodo actual =cabeza;
    do{
        System.out.println(actual.getDato()+ " -->");
        actual = actual.getSiguiente();
    } while(actual != cabeza);
    System.out.println("(cabeza)");

}
}
