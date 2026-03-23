/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class Main {
    
        public static void main(String[] args) {
 Cola datos1 = new Cola ();
        datos1.agregar(1);
        datos1.agregar(2);
        datos1.agregar(3);
        datos1.agregar(4);
        datos1.agregar(5);
        System.out.println("Cola original 1: " + datos1.verCola());
        datos1.invertirPrimeros(2);
        System.out.println("Cola resultante 1: " + datos1.verCola());
        System.out.println("");

        Cola datos2 = new Cola();
        datos2.agregar(6);
        datos2.agregar(4);
        datos2.agregar(8);
        datos2.agregar(10);
        datos2.agregar(9);
        datos2.agregar(2);
        datos2.agregar(3);
        System.out.println("Cola original 2: " + datos2.verCola());
        datos2.invertirPrimeros(3);
        System.out.println("Cola resultante 2: " + datos2.verCola());
        System.out.println("");

        Cola datos3 = new Cola();
        datos3.agregar(77);
        datos3.agregar(85);
        datos3.agregar(66);
        datos3.agregar(35);
        datos3.agregar(-1);
        datos3.agregar(5);
        datos3.agregar(45);
        System.out.println("Cola original 3: " + datos3.verCola());
        datos3.invertirPrimeros(6);
        System.out.println("Cola resultante 3: " + datos3.verCola());
        System.out.println("");

        Cola datos4 = new Cola();
        datos4.agregar(5);
        datos4.agregar(4);
        datos4.agregar(3);
        datos4.agregar(2);
        datos4.agregar(1);
        System.out.println("Cola original 4: " + datos4.verCola());
        datos4.invertirPrimeros(2);
        System.out.println("Cola resultante 4: " + datos4.verCola());
    
            
} 
}
