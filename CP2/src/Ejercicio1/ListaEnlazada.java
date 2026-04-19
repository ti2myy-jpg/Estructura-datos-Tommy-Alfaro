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

    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;

    }

    public void eliminarNodo(int valor) {
        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null && actual.getDato() != valor) {
            anterior = actual;
            actual = actual.getSiguiente();

        }

        if (actual == null) {
            return;
        }
        if (anterior == null) {
            cabeza = actual.getSiguiente();
        } else {
            anterior.setSiguiente(actual.getSiguiente());
        }

    }
    
    public boolean buscat(int valor){
        Nodo actual= cabeza;
        while (actual!= null){
            if(actual.getDato() == valor){
                return true;
                
            }
            actual= actual.getSiguiente();
            
        }
            return false;
    }
    
    public void recorrer(){
       Nodo actual= cabeza;
        while (actual!= null){
           System.out.println( "--> " + actual.getDato());
            actual= actual.getSiguiente();   
    }
        System.out.println("NULL");
}
        // a) size()
    public int size() {
        return sizeRec(cabeza);
    }

    private int sizeRec(Nodo actual) {
        if (actual == null) {
            return 0;
        }
        return 1 + sizeRec(actual.getSiguiente());
    }

    // b) esVacia()
    public boolean esVacia() {
        return cabeza == null;
    }

    // c) existe(valor)
    public boolean existe(int valor) {
        return existeRec(cabeza, valor);
    }

    private boolean existeRec(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (actual.getDato() == valor) {
            return true;
        }

        return existeRec(actual.getSiguiente(), valor);
    }

    // d) valorEn(indice)
    public int valorEn(int indice) {
        if (indice < 0) {
            return -1;
        }
        return valorEnRec(cabeza, indice);
    }

    private int valorEnRec(Nodo actual, int indice) {
        if (actual == null) {
            return -1;
        }

        if (indice == 0) {
            return actual.getDato();
        }

        return valorEnRec(actual.getSiguiente(), indice - 1);
    }

    // e) insertarAlFrente(valor)
    public void insertarAlFrente(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
    }

    // f) insertarAlFinal(valor)
    public void insertarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            insertarAlFinalRec(cabeza, nuevo);
        }
    }

    private void insertarAlFinalRec(Nodo actual, Nodo nuevo) {
        if (actual.getSiguiente() == null) {
            actual.setSiguiente(nuevo);
            return;
        }

        insertarAlFinalRec(actual.getSiguiente(), nuevo);
    }

    // g) removerFrente()
    public int removerFrente() {
        if (cabeza == null) {
            return -1;
        }

        int valor = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        return valor;
    }

    // h) removerFinal()
    public int removerFinal() {
        if (cabeza == null) {
            return -1;
        }

        if (cabeza.getSiguiente() == null) {
            int valor = cabeza.getDato();
            cabeza = null;
            return valor;
        }

        return removerFinalRec(cabeza);
    }

    private int removerFinalRec(Nodo actual) {
        if (actual.getSiguiente().getSiguiente() == null) {
            int valor = actual.getSiguiente().getDato();
            actual.setSiguiente(null);
            return valor;
        }

        return removerFinalRec(actual.getSiguiente());
    }

    // i) removerValor(valor)
    public boolean removerValor(int valor) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getDato() == valor) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        return removerValorRec(cabeza, valor);
    }

    private boolean removerValorRec(Nodo actual, int valor) {
        if (actual.getSiguiente() == null) {
            return false;
        }

        if (actual.getSiguiente().getDato() == valor) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return removerValorRec(actual.getSiguiente(), valor);
    }

    // j) eliminar(indice)
    public boolean eliminar(int indice) {
        if (indice < 0 || cabeza == null) {
            return false;
        }

        if (indice == 0) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        return eliminarRec(cabeza, indice);
    }

    private boolean eliminarRec(Nodo actual, int indice) {
        if (actual == null || actual.getSiguiente() == null) {
            return false;
        }

        if (indice == 1) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return eliminarRec(actual.getSiguiente(), indice - 1);
    }

    // k) frente()
    public int frente() {
        if (cabeza == null) {
            return -1;
        }
        return cabeza.getDato();
    }

    // l) atras()
    public int atras() {
        if (cabeza == null) {
            return -1;
        }
        return atrasRec(cabeza);
    }

    private int atrasRec(Nodo actual) {
        if (actual.getSiguiente() == null) {
            return actual.getDato();
        }

        return atrasRec(actual.getSiguiente());
    }

    // m) insertar(indice, valor)
    public boolean insertar(int indice, int valor) {
        if (indice < 0) {
            return false;
        }

        if (indice == 0) {
            insertarAlFrente(valor);
            return true;
        }

        if (cabeza == null) {
            return false;
        }

        return insertarRec(cabeza, indice, valor);
    }

    private boolean insertarRec(Nodo actual, int indice, int valor) {
        if (actual == null) {
            return false;
        }

        if (indice == 1) {
            Nodo nuevo = new Nodo(valor);
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
            return true;
        }

        return insertarRec(actual.getSiguiente(), indice - 1, valor);
    }

    // n) reversar()
    public void reversar() {
        cabeza = reversarRec(cabeza);
    }

    private Nodo reversarRec(Nodo actual) {
        if (actual == null || actual.getSiguiente() == null) {
            return actual;
        }

        Nodo nuevaCabeza = reversarRec(actual.getSiguiente());
        actual.getSiguiente().setSiguiente(actual);
        actual.setSiguiente(null);

        return nuevaCabeza;
    }

    
    
    
}
