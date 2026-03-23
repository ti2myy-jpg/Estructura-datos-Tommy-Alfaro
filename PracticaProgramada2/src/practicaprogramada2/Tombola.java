/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada2;

import java.util.Random;

/**
 *
 * @author tommy
 */
public class Tombola {
    public void Tombola(){
    

      Random rand = new Random();

        int numero = rand.nextInt(10); // genera entre 0 y 9
        System.out.println(numero);

}
}
