package Ejercicio4;


public class Main {

    public static void main(String[] args) {

        ListaEnlazadaRecords lista = new ListaEnlazadaRecords();

        // Primeros 10 elementos
        lista.agregar("jwrecker45", 1512);
        lista.agregar("blaster1066", 5667);
        lista.agregar("the_pacifier_1999", 1103);
        lista.agregar("decisiveOne_1403", 2556);
        lista.agregar("344Shago443", 300);
        lista.agregar("daniWheels", 465);
        lista.agregar("MayhemDom99", 567);
        lista.agregar("invictus54", 1669);
        lista.agregar("imperatorMaximusDecimus231", 3001);
        lista.agregar("cornwellGraduate", 1560);

        lista.recorrer();

        System.out.println();
        System.out.println("Lista Nueva:");

        // Elemento 11
        lista.agregar("axesin0", 6700);

        lista.recorrer();

        System.out.println();
        System.out.println("Lista eliminando 3 elementos:");

        lista.removerNElementos(3);
        lista.recorrer();
    }
}