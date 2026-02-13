/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec05;

/**
 *
 * @author tommy
 */
  public class PilaArreglo{
        private int [] pila;
        private int top;
        private int maxSize;
    
    public PilaArreglo(int tamano){
        maxSize=tamano;
        pila= new int[maxSize];
        top=-1;
    }
    public void push(int elemento){
        if(top==maxSize-1){
            System.out.println("Desbordamiento");
            
        }else{
            pila[++top]=elemento;
        }
    }
    
    public int pop(){
        if(top==-1){
            System.out.println("Subdesbordamiento");
            return -1;
        }else{
            return pila[top--];
        }
    }
    public int peek(){
        if (top==-1){
            System.out.println("Desbordamiento");
            return -1;
        }else{
            return pila[top];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
    