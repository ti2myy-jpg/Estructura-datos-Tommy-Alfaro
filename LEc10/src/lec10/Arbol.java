/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec10;

/**
 *
 * @author tommy
 */
public class Arbol {

    private Nodo raiz;
public Arbol(){
    raiz = null;
}
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }
        if (valor <= raiz.getDato()) {
            raiz.setIzquierda(insertarRec(raiz.getIzquierda(), valor));
        } else if (valor > raiz.getDato()) {
            raiz.setDerecha(insertarRec(raiz.getDerecha(), valor));

        }
        return raiz;
    }

    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.getIzquierda());
            System.out.println(raiz.getDato() + " ");
            inordenRec(raiz.getDerecha());
        }
    }

    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.println(raiz.getDato() + " ");
            inordenRec(raiz.getIzquierda());
            inordenRec(raiz.getDerecha());
        }
    }

    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.getIzquierda());
            inordenRec(raiz.getDerecha());
            System.out.println(raiz.getDato() + " ");
        }
    }

    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }
        if (valor < raiz.getDato()) {
            raiz.setIzquierda(eliminarRec(raiz.getIzquierda(), valor));

        } else if (valor > raiz.getDato()) {
            raiz.setDerecha(eliminarRec(raiz.getDerecha(), valor));
        } else {
            //Caso 1 Nodo sin hijos
            if (raiz.getIzquierda() == null && raiz.getDerecha() == null) {
                return null;
            }
            //Caso 2 Nodo con un hijo
            if (raiz.getIzquierda() == null) {
                return raiz.getDerecha();

            } else if (raiz.getDerecha() == null) {
                return raiz.getIzquierda();

            }
            //Caso 3 Nodo con dos hijos
            Nodo sucesor = minValorNodo(raiz.getDerecha());
            raiz.setDato(sucesor.getDato());
            raiz.setDerecha(eliminarRec(raiz.getDerecha(), sucesor.getDato()));

        }
        return raiz;
    }

    private Nodo minValorNodo(Nodo nodo) {
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }

}
