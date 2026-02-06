/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec03.newpackage;

import java.util.*;

/**
 *
 * @author tommy
 */
public class Main {

    public static void main(String[] args) {
//        List<Integer> miLista = new ArrayList<>();
//        miLista.add(2);
//        miLista.add(4);
//        miLista.add(99);
        int indice= 0;
//        System.out.println(contarElementos(miLista, indice));
        
        Practica p = new Practica();
        int[] miOtraLista = {2,5,3,7,2};
        // System.out.println(p.sumarElementos(miOtraLista, indice));
        System.out.println(p.maxRec(miOtraLista,0,0));
         
        
    }

    public static int contarElementos(List<Integer> lista, int index) {
        if (index == lista.size()) {
            return 0;

        } else {
            return 1 + contarElementos(lista, index + 1);
        }
    }

    
    
}
