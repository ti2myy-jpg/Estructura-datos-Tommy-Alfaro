/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author tommy
 */
public class Taylor {
    
  
    
    
    
      public static int factorial(int k, int x) {
        if (k == 1) {   
            return 1;
        } else {
            return x * factorial(x, k - 1); 
        }
    }
      
    
    
}
