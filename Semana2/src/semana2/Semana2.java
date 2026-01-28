/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

/**
 *
 * @author tommy
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for (int x=5; x>0;x--){
//            System.out.println(x);
//        }
     //   imprime(5);
        int x=5;
      System.out.println("El factorial de "+ x + " es " +factorial(x));
//sumaRecursiva(x);
//System.out.println("el resultado de la suma es"+ sumaRecursiva(x));
        
    }

    public static void imprime(int n) {

        if (n == 0) {    //caso base 
            return;
        } else {
            System.out.println(n);
            imprime(n - 1);   //Caso recursivo 
        }
    }

    public static int factorial(int n) {
        if (n == 1) {   // Caso base: cuandon es 1
            return 1;
        } else {
            return n * factorial(n - 1); // Llamadarecursiva
        }
    }
//    public static int sumaRecursiva (int n) {
//        if (sumaRecursiva(n)<=n+) {   
//            return n;
//        } else {
//            return n + sumaRecursiva(n); 
//        }
//    }
    
    
   

}
