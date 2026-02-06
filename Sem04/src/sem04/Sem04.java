/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem04;

/**
 *
 * @author tommy
 */
public class Sem04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40);

        System.out.println("Pila despues de apilar");
        System.out.println(pila.mostrarPila());

        System.out.println("Elem desapilado:" + pila.desapilar());
        System.out.println("Pila despues de apilar");
        System.out.println(pila.mostrarPila());

        System.out.println("Elem desapilado:" + pila.desapilar());
        System.out.println("Pila despues de apilar");
        System.out.println(pila.mostrarPila());

    }

}
