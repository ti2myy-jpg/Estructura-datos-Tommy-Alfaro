/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec08;

/**
 *
 * @author tommy
 */
public class Lec08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarInicio(30);
        System.out.println("Lista despues de insertar");
        lista.recorrer();
        lista.eliminarNodo(20);
        System.out.println("Lista despues de eliminar");
        lista.recorrer();
        System.out.println("10 en lista?: " + lista.buscat(10));
        System.out.println("40 en lista?: " + lista.buscat(40));
        lista.insertarInicio(99);
        lista.insertarInicio(50);
        System.out.println("Lista despues de insertar");
        lista.recorrer();
    }

}
