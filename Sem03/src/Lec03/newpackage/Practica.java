/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec03.newpackage;



/**
 *
 * @author tommy
 */
public class Practica {
    
 
    int i =0;

    public int sumarElementos(int [] lista, int index ){
        if(lista.length==index){
            return 0;
        }else{
            return lista[index]+sumarElementos(lista,index+1);
        }
    
        
    }
    
    public int MaxIter(int[] lista){
        int max=0;
        for(int i=0; i<lista.length;i++){
            if(lista[i]>max){
                max = lista[i];
            }
        }
        return max;
    }
    public int maxRec(int[]lista,int indice, int max){
        if(indice<lista.length){
            if(lista[indice]>max){
              max=lista[indice];
            }
            return maxRec(lista,indice+1,max);
        }else{
            return max;
        }
    }
        
    }
    

