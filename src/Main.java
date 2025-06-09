// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        System.out.println("**_____________________________________________**");
        System.out.println("**                                             **");
        System.out.println("**   Demostración de la lista enlazada simple  **");
        System.out.println("**                                             **");
        System.out.println("**_____________________________________________**");

        System.out.println("Es una lista vacía: " + lista.esListaVacia());

        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        lista.insertarAlFinal(5);
        lista.eliminar(20);
        lista.eliminarAlInicio();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("EXISTE EL NÚMERO 20: "+ lista.buscar(20));
        System.out.println("EXISTE EL NÚMERO 10: "+ lista.buscar(10));
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("Tamaño de la lista: " +lista.tamaño());
        System.out.println("Informe de memoria: "+  lista.informacionMemoria());
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.imprimir();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}