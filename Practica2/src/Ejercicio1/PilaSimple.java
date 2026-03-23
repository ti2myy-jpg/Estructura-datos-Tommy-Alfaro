/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author tommy
 */
 
public class PilaSimple {
    Elemento ultimo;
    public PilaSimple() {
        ultimo = null;
    }
    public void insertar(char valor) {
        Elemento nuevoElemento = new Elemento(valor);
        if (ultimo == null) {
            ultimo = nuevoElemento;
        } else {
            nuevoElemento.enlace = ultimo;
            ultimo = nuevoElemento;
        }
    }
    public char sacar() {
        if (ultimo == null) {
            return ' ';
        }
        char datoGuardado = ultimo.simbolo;
        ultimo = ultimo.enlace;
        return datoGuardado;
    }
    public boolean sinDatos() {
        if (ultimo == null) {
            return true;
        } else {
            return false;
        }
    }
}