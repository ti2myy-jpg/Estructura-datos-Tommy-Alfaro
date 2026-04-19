/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author tommy
 */


public class ListaEnlazadaRecords {

    private Nodo cabeza;

    public ListaEnlazadaRecords() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public int size() {
        return sizeRec(cabeza);
    }

    private int sizeRec(Nodo actual) {
        if (actual == null) {
            return 0;
        }
        return 1 + sizeRec(actual.getSiguiente());
    }

    public void agregar(String nombre, int puntuacion) {
        Nodo nuevo = new Nodo(nombre, puntuacion);

        if (cabeza == null) {
            cabeza = nuevo;
        } else if (puntuacion > cabeza.getPuntuacion()) {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        } else {
            agregarRec(cabeza, nuevo);
        }

        if (size() > 10) {
            removerFinal();
        }
    }

    private void agregarRec(Nodo actual, Nodo nuevo) {
        if (actual.getSiguiente() == null) {
            actual.setSiguiente(nuevo);
            return;
        }

        if (nuevo.getPuntuacion() > actual.getSiguiente().getPuntuacion()) {
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
            return;
        }

        agregarRec(actual.getSiguiente(), nuevo);
    }

    public void removerFrente() {
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
        }
    }

    public void removerFinal() {
        if (cabeza == null) {
            return;
        }

        if (cabeza.getSiguiente() == null) {
            cabeza = null;
            return;
        }

        removerFinalRec(cabeza);
    }

    private void removerFinalRec(Nodo actual) {
        if (actual.getSiguiente().getSiguiente() == null) {
            actual.setSiguiente(null);
            return;
        }

        removerFinalRec(actual.getSiguiente());
    }

    public boolean removerPorNombre(String nombre) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getNombre().equals(nombre)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        return removerPorNombreRec(cabeza, nombre);
    }

    private boolean removerPorNombreRec(Nodo actual, String nombre) {
        if (actual.getSiguiente() == null) {
            return false;
        }

        if (actual.getSiguiente().getNombre().equals(nombre)) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return removerPorNombreRec(actual.getSiguiente(), nombre);
    }

    public void removerNElementos(int n) {
        removerNElementosRec(n);
    }

    private void removerNElementosRec(int n) {
        if (n <= 0 || cabeza == null) {
            return;
        }

        removerFinal();
        removerNElementosRec(n - 1);
    }

    public void recorrer() {
        System.out.println("Lista:");
        recorrerRec(cabeza);
    }

    private void recorrerRec(Nodo actual) {
        if (actual == null) {
            return;
        }

        System.out.println("Jugador=" + actual.getNombre() + " Marcador=" + actual.getPuntuacion());
        recorrerRec(actual.getSiguiente());
    }
}