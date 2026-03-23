/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class Cola {

    Nodo inicio;
    Nodo ultimo;

    public Cola() {
        inicio = null;
        ultimo = null;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public int quitar() {
        if (inicio == null) {
            return -1;
        }
        int temporal = inicio.numero;
        inicio = inicio.siguiente;
        if (inicio == null) {
            ultimo = null;
        }
        return temporal;
    }

    public boolean estaSinDatos() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public int obtenerTamano() {
        int total = 0;
        Nodo auxiliar = inicio;
        while (auxiliar != null) {
            total++;
            auxiliar = auxiliar.siguiente;
        }
        return total;
    }

    public void invertirPrimeros(int cantidad) {
        Pila pila = new Pila();
        int tamanoCola = obtenerTamano();
        if (cantidad <= 0 || cantidad > tamanoCola) {
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            pila.apilar(quitar());
        }
        while (!pila.vacia()) {
            agregar(pila.desapilar());
        }
        for (int i = 0; i < tamanoCola - cantidad; i++) {
            agregar(quitar());
        }
    }

    public String verCola() {
        String resultado = "";
        Nodo auxiliar = inicio;
        while (auxiliar != null) {
            resultado = resultado + auxiliar.numero;
            if (auxiliar.siguiente != null) {
                resultado = resultado + " ";
            }
            auxiliar = auxiliar.siguiente;
        }
        return resultado;
    }
}
