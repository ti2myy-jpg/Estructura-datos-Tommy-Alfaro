/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Arbol arbol = new Arbol(4);

        arbol.insertar(42);
        arbol.insertar(18);
        arbol.insertar(67);
        arbol.insertar(9);
        arbol.insertar(35);
        arbol.insertar(55);
        arbol.insertar(80);
        arbol.insertar(3);
        arbol.insertar(14);
        arbol.insertar(28);
        arbol.insertar(38);
        arbol.insertar(50);
        arbol.insertar(62);
        arbol.insertar(75);
        arbol.insertar(90);
        arbol.insertar(1);
        arbol.insertar(6);
        arbol.insertar(11);

        Arbol arbol2 = new Arbol(5);

        arbol2.insertar(42);
        arbol2.insertar(18);
        arbol2.insertar(67);
        arbol2.insertar(9);
        arbol2.insertar(35);
        arbol2.insertar(55);
        arbol2.insertar(80);
        arbol2.insertar(3);
        arbol2.insertar(14);
        arbol2.insertar(28);
        arbol2.insertar(38);
        arbol2.insertar(50);
        arbol2.insertar(62);
        arbol2.insertar(75);
        arbol2.insertar(90);
        arbol2.insertar(1);
        arbol2.insertar(6);
        arbol2.insertar(11);

        System.out.println("Postorden del primerArbol:");
        arbol.posorden();
        System.out.println("Postorden del segundoArbol:");
        arbol2.posorden();
        System.out.println("Lista simple del primerArbol:");
        arbol.mostrarLista();
        System.out.println("Lista simple del segundoArbol:");
        arbol2.mostrarLista();

        System.out.println("Altura del primerArbol: " + arbol.getAltura());
        System.out.println("Altura del segundoArbol: " + arbol2.getAltura());

    }

}
