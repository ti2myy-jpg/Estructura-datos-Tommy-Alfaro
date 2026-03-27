/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec10;

/**
 *
 * @author tommy
 */
public class Lec10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        //Insertar
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        //inorden

        System.out.println("Recorrido inorden");
        arbol.inorden();

        //Eliminar
        arbol.eliminar(40);
        arbol.eliminar(30);
        arbol.eliminar(70);
        
        //posorden
        System.out.println("Recorrido postorden");
        arbol.postorden();

    }

}
