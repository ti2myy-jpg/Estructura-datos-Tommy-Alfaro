/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author tommy
 */
public class Nodo {

    private String CodRastreo;
    private String Destino;
    private double Peso;
    private String Estado;
    private Nodo siguiente;

    public Nodo(String CodRastreo, String Destino, double Peso, String Estado) {
        this.CodRastreo = CodRastreo;
        this.Destino = Destino;
        this.Peso = Peso;
        this.Estado = Estado;
        this.siguiente = null;
    }

    public String getCodRastreo() {
        return CodRastreo;
    }

    public void setCodRastreo(String CodRastreo) {
        this.CodRastreo = CodRastreo;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
