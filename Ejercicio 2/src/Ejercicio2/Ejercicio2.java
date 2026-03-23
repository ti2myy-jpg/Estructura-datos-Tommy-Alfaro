/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author tommy
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ColaPaquete p = new ColaPaquete();
        p.encolar("Juan", "P01", "Normal", 2);
        p.encolar("Maria", "P02", "Urgente", 1);
        p.encolar("Luis", "P03", "Normal", 3);
        p.encolar("Ana", "P04", "Urgente", 1);
        p.encolar("Pedro", "P05", "Normal", 5);
        p.mostrar();

        //p.frente();
    }

}
