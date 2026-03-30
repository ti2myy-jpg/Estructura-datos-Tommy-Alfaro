/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada5_tommyalfaro;

/**
 *
 * @author tommy
 */
public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }
        if (valor <= raiz.getDato()) {
            raiz.setIzquierda(insertarRec(raiz.getIzquierda(), valor));
        } else if (valor > raiz.getDato()) {
            raiz.setDerecha(insertarRec(raiz.getDerecha(), valor));

        }
        return raiz;
    }

    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.getIzquierda());
            postordenRec(raiz.getDerecha());
            System.out.println(raiz.getDato() + " ");
        }
    }
//Un arbol perfecto es donde sus hijos tanto del lado derecho como el izquierdo son iguales, en este caso no es asi.

    // Aqui tenemos elprimer metodo que se encarga de crear el booleano para la comprobacion 
    //tambein declara la variable que vamos a usar en el otro metodo (esPerfectoRec)
    public boolean esPerfecto() {
        int nivelHoja = hojas(raiz);
        return esPerfectoRec(raiz, 0, nivelHoja);
    }
//Para poder saber si tenemos los dos lados de igual profundidad o tamaño, usamos este metodo para que el pueda contar
//los datos de un  lado y luego comparar, en resumen es un contador.

    private int hojas(Nodo nodo) {
        int nivel = 0;

        while (nodo != null) {
            nivel++;
            nodo = nodo.getIzquierda();
        }

        return nivel;
    }
//Este metodo de aqui es el segundo booleano el cual se va a encargar de comparar que ambos lados tenga la misma profundidad
    private boolean esPerfectoRec(Nodo nodo, int nivelActual, int nivelHoja) {
        if (nodo == null) {
            return true;
        }

        //Este IF ccompara lado con lado, si no es null, le agrega un 1 a cada subarbol para confirmar la cantidad de niveles
        if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
            return (nivelActual + 1) == nivelHoja;
        }

        // luego pasa a este IF el cual cuando confirme que alguno de los dos es null, hace el return de falso y asi decir que no es perfecto 
        if (nodo.getIzquierda() == null || nodo.getDerecha() == null) {
            return false;
        }

        // Y este return, vuelve a inicializar el metodo y añada a cada lado un 1 
        return esPerfectoRec(nodo.getIzquierda(), nivelActual + 1, nivelHoja) && esPerfectoRec(nodo.getDerecha(), nivelActual + 1, nivelHoja);
    }

}
