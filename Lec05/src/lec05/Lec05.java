/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec05;

/**
 *
 * @author tommy
 */
public class Lec05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaDinamica pila = new PilaDinamica();

        System.out.println("Apliando");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Mostrar pila");
        pila.mostrar();
        System.out.println("Desapilando " + pila.pop());
        System.out.println("Desapilando " + pila.pop());
        System.out.println("Mostrando pila");
        pila.mostrar();
        System.out.println("Desapilando" + pila.pop());
        System.out.println("Intentando desapilar pila vacia");
        pila.pop();

    }

}
