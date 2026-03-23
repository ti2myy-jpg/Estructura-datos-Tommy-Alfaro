package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tommy
 */
public class Validador {
    public boolean revisarExpresion(String cadena) {
        PilaSimple pila1 = new PilaSimple();
        for (int posicion = 0; posicion < cadena.length(); posicion++) {
            char letra = cadena.charAt(posicion);
            if (letra == '(') {
                pila1.insertar(letra);
            } else if (letra == '{') {
                pila1.insertar(letra);
            } else if (letra == '[') {
                pila1.insertar(letra);
            } else if (letra == ')') {
                if (pila1.sinDatos()) {
                    return false;
                }
                pila1.sacar();
            } else if (letra == '}') {
                if (pila1.sinDatos()) {
                    return false;
                }
                pila1.sacar();
            } else if (letra == ']') {
                if (pila1.sinDatos()) {
                    return false;
                }
                pila1.sacar();
            }
        }
        if (pila1.sinDatos()) {
            return true;
        } else {
            return false;
        }
    }
}