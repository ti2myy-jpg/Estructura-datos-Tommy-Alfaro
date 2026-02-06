/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem04;



/**
 *
 * @author tommy
 */
public class Pila {
    private Dato cima;
    public Pila(){
        cima=null;
    }
    
    public void apilar(int valor){
        Dato nuevoDato=new Dato(valor);
        if(esVacia()){
            cima = nuevoDato;
            
        }else{
            nuevoDato.setAbajo(cima);
            cima=nuevoDato;
           
        }
        
    }
    
    public int desapilar(){
        if(esVacia()){
            System.out.println("Pila vacia");
            return -1;
        }else{
            int valor=cima.getValor();
            cima=cima.getAbajo();
            return valor;
                   
        }
    }
    
    public boolean esVacia(){
        return cima ==null;
        
    }
    
    public String mostrarPila(){
        if(esVacia()){
            return "Pila vacia";
        }
        StringBuilder sb = new StringBuilder();
        Dato actual=cima;
        while(actual != null){
        sb.append(actual.getValor()).append(" ");
        actual = actual.getAbajo();
    }

    return sb.toString().trim();
    }
    
}
