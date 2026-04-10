/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprogramada5_tommyalfaro;

/**
 *
 * @author tommy
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();

        arbol.insertar(-8);
        arbol.insertar(15);
        arbol.insertar(-20);
        arbol.insertar(3);
        arbol.insertar(11);
        arbol.insertar(-5);
        arbol.insertar(7);
        arbol.insertar(-12);
        arbol.insertar(9);
        arbol.insertar(-2);
        arbol.insertar(6);
        arbol.insertar(-17);
        arbol.insertar(24);
        arbol.insertar(-10);
        arbol.insertar(19);

        System.out.println("Recorrido postorden");
        arbol.postorden();

        if (arbol.esPerfecto()) {
            System.out.println("\nEl árbol es perfecto.");
        } else {
            System.out.println("\nEl árbol no es perfecto.");
        }
    }

}
