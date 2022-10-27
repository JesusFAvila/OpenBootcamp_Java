package Tema8;

import java.util.LinkedList;

public class DatosAvanzadosLinkedList {
    public static void main(String[] args) {
        //LinkedList se declara igual que un array list
        //DIFERENCIA ARRAYLIST
            //1- Un arraylist utiliza un array (Mucho más rápido a la hora de almacenar y buscar datos) de forma subyace, un linked list no, utiliza una lista doblemente enlazada (Más rápida cuando queremos modificar datos, no almacenar ni buscar).
            //2- El array list deriva de la clase list, la lista enlazada implementa los interface, podemos utilizar la linked-list para utilizar colas.
        LinkedList<String> listaEnlazada = new LinkedList<String>();
        listaEnlazada.add("Element A");
        listaEnlazada.add("Element B");
        listaEnlazada.add("Element C");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.size());
        System.out.println(listaEnlazada.add("Element D"));
        System.out.println(listaEnlazada);


    }
}
