/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprogramada2;

/**
 *
 * @author tommy
 */
public class PracticaProgramada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaPrioridad cola = new ColaPrioridad();

cola.encolar("Juan", (int)(Math.random()*10+1));
cola.encolar("Pedro", (int)(Math.random()*10+1));
cola.encolar("Maria", (int)(Math.random()*10+1));
cola.encolar("Luis", (int)(Math.random()*10+1));

try {
    System.out.println("El dato con mayor prioridad es: ");
    System.out.println( cola.obtenerMayor() );
} catch (Exception e) {
    System.out.println(e.getMessage());
}
    }
}


