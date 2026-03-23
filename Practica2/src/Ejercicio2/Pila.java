/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class Pila{
  Nodo tope;

    public Pila() {
        tope = null;
    }
    public void apilar(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
    }
    public int desapilar() {
        if (tope == null) {
            return -1;
        }
        int guardado = tope.numero;
        tope = tope.siguiente;
        return guardado;
    }
    public boolean vacia() {
        if (tope == null) {
            return true;
        } else {
            return false;
        }
    }
}