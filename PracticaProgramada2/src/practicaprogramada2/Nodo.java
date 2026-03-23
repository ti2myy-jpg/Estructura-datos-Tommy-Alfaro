/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada2;

/**
 *
 * @author tommy
 */
public class Nodo {
       private String nombre;
    private int prioridad;
    private Nodo siguiente;

    public Nodo(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
