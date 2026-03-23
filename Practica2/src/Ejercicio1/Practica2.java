/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author tommy
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Validador objeto1 = new Validador();
        String texto1 = "{Yes}";
        String texto2 = "{(Kashmere)}}";
        String texto3 = "(";
        String texto4 = "[True]";
        String texto5 = "[{]";
        System.out.println(texto1 + " = " + objeto1.revisarExpresion(texto1));
        System.out.println(texto2 + " = " + objeto1.revisarExpresion(texto2));
        System.out.println(texto3 + " = " + objeto1.revisarExpresion(texto3));
        System.out.println(texto4 + " = " + objeto1.revisarExpresion(texto4));
        System.out.println(texto5 + " = " + objeto1.revisarExpresion(texto5));
    }
    
}
