/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author tommy
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaUndo pila = new PilaUndo();
        pila.push("Hola");
        pila.push("Mundo");
        pila.mostrar();
        pila.pop();
        pila.push("java");
        pila.mostrar();
    }
    
}
