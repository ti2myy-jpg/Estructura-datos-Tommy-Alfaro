/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author tommy
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;

    }

    public void insertarInicio(String CodRastreo, String Destino, double Peso, String Estado) {
        Nodo nuevo = new Nodo(CodRastreo, Destino, Peso, Estado);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;

    }

    public void mostrarManifiesto() {
        System.out.println("Manfiesto de Carga: :");
        mostrarManifiestoRec(cabeza);
    }

    private void mostrarManifiestoRec(Nodo actual) {
        if (actual == null) {
            return;
        }

        System.out.println("Codigo:" + actual.getCodRastreo() + " | " + " Destino: " + actual.getDestino() + " | " + "Peso: " + actual.getPeso() + " | " + "Estado: " + actual.getEstado());
        mostrarManifiestoRec(actual.getSiguiente());
    }

    public boolean marcarEntregado(String codigo) {

        return marcarEntregado(cabeza, codigo);
    }

    private boolean marcarEntregado(Nodo actual, String codigo) {
        if (actual == null) {
            return false;
        }

        if (actual.getCodRastreo() == codigo) {
            actual.setEstado("Entregado");
            return true;
        }

        return marcarEntregado(actual.getSiguiente(), codigo);
    }
    
    
    // El metodo aqui pide como return al metodo calcularPesoTotalREc, basandose en el NODO Cabeza (lista completa)
     public double calcularPesoTotal() {
        return calcularPesoTotalRec(cabeza);
    }
// Ponemos un while que lo que va a hace es hacer el metodo mientras actual no sea nulo, una vez que actual sea null o se acaba.
    private double calcularPesoTotalRec(Nodo actual) {
       while(actual != null){
            return actual.getPeso() + calcularPesoTotalRec(actual.getSiguiente());
       }
        return 0;
    }

}
