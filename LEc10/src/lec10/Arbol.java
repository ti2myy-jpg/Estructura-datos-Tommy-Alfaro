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
            System.out.println(raiz.getDato()+ " ");
            inordenRec(raiz.getDerecha());
        }
    }
}
