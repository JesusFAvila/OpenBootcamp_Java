package Tema8;

import java.util.ArrayList;

public class DatosAvanzadosArrayList {
    public static void main(String[] args) {
        //Array List: listas en formato array
        //La principal diferencia respecto un vector es la capacidad que ocupa, mientras que el vector la dobla, el array list aumenta sun 50%
        //Los arraylist no están sincronizados, no se pueden modificar de forma concurrente dos arraylist

        ArrayList<String> listaString = new ArrayList<String>();
        listaString.add("Element A");
        listaString.add("Element B");
        listaString.add("Element C");
        System.out.println
                ("Mostrar elementos de lista: " + listaString);

        //Eliminar elementos
        listaString.remove("Element B");
        System.out.println
                ("Mostrar elementos de lista actualizados: " + listaString);

        //Recorrer Arraylist
        //Forma larga
        for (int i = 0 ; i < listaString.size() ; i++){
            System.out.println
                    ("La posicion del elemento " + listaString.get(i) + " es: " + i);
        }

        //Forma corta
        for (String i : listaString){
            System.out.println
                    ("La posicion es: " + i);
        }

        //Convertir un arraylist en un array mediante size para utilizar el tamaño del arraylist
        String array[] = new String[listaString.size()];
        for (int i=0 ; i< listaString.size(); i++ ){
            array[i] = listaString.get(i);
        }
        for (String elemento : array){
            System.out.println("Elemento es: " + elemento);
        }




    }
}
