/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class Arbol {

    private Nodo raiz;
    private Nodo cabeza;
    private int altura;

    public Arbol(int altura ) {
        this.raiz = null;
        this.cabeza = null;
        this.altura = altura;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor, 1);
    }

    private Nodo insertarRec(Nodo actual, int valor, int nivel) {
        if (nivel > altura) {
            insertarLista(valor);
            return actual;
        }

        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor <= actual.getDato()) {
            actual.setIzquierda(insertarRec(actual.getIzquierda(), valor, nivel + 1));
        } else {
            actual.setDerecha(insertarRec(actual.getDerecha(), valor, nivel + 1));
        }

        return actual;
    }

    private void insertarLista(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
    }

    public void posorden() {
        posordenRec(raiz);
        System.out.println("\n");

    }

    private void posordenRec(Nodo actual) {
        if (actual != null) {
            posordenRec(actual.getIzquierda());
            posordenRec(actual.getDerecha());
            System.out.print(actual.getDato() + " ");
        }
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato());
            actual = actual.getSiguiente();
          System.out.println(" , ");
        }
        System.out.println("\n");
        
    }
        public int getAltura() {
        return getAlturaRec(raiz);
    }

    private int getAlturaRec(Nodo actual) {
        if (actual == null) {
            return 0;
        }

        int alturaIzquierda = getAlturaRec(actual.getIzquierda());
        int alturaDerecha = getAlturaRec(actual.getDerecha());

        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda + 1;
        }
        return alturaDerecha + 1;
    }
    }

