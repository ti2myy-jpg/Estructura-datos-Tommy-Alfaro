/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author tommy
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio("TRK-101", "San Jose, centro", 3.5, "Pendiente");
        lista.insertarInicio("TRK-102", "Desamparados", 1.2, "Pendiente");
        lista.insertarInicio("TRK-103", "Escazu", 7.8, "Pendiente");
        lista.insertarInicio("TRK-104", "Santa-Ana", 0.9, "Pendiente");
        lista.insertarInicio("TRK-105", "Alajuelita", 4.4, "Pendiente");
        lista.insertarInicio("TRK-106", "Curridabat", 2.1, "Pendiente");
        lista.insertarInicio("TRK-107", "Perez Zeledon", 11.0, "Pendiente");
        lista.mostrarManifiesto();
        System.out.println("Marcando a TRK-103 como entregado: " + lista.marcarEntregado("TRK-103"));
        System.out.println("Marcando a TRK-103 como entregado: " + lista.marcarEntregado("TRK-999"));
        System.out.println("Peso total del manifiesto: " + lista.calcularPesoTotal());

    }

}
