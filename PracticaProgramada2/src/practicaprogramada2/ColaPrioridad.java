/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada2;

/**
 *
 * @author tommy
 */
public class ColaPrioridad {
    private Nodo frente;

    public ColaPrioridad() {
        this.frente = null;
    }

    public void encolar(String nombre, int prioridad) {
        Nodo nuevo = new Nodo(nombre, prioridad);

        if (frente == null || prioridad < frente.getPrioridad()) {
            nuevo.setSiguiente(frente);
            frente = nuevo;
        } else {
            Nodo aux = frente;

            while (aux.getSiguiente() != null && aux.getSiguiente().getPrioridad() <= prioridad) {
                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public String obtenerMayor() throws Exception {
        if (frente == null)
            throw new Exception("Cola vacía");

        Nodo aux = frente;

        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        return aux.getNombre() + " con prioridad: " + aux.getPrioridad();
    }
}
