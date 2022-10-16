package Tema1;

import java.util.ArrayList;
import java.util.List;

public class ListaMain {


    public static void main(String[] args) {
        //Interfaz List nos ofrece diferentes métodos: size(),contains(Object o)...
        List<String> nombreLista = new ArrayList<>(); //Creación de lista dinámica de String
        nombreLista.add("Jesús Fernández");
        nombreLista.add("Jhonny Deep");
        nombreLista.add("Wolfgang Amadeus Mozart");
        System.out.println(nombreLista);

        //ArrayList: Nos permiten trabajar con datos de forma dinámica
        for(String nombre : nombreLista){
            System.out.println(nombre);
        }
        //CREACIÓN DE OBJETOS MEDIANTE ARRAYLIST
        List<CochesMain> coches = new ArrayList<>();
        coches.add(new CochesMain("Renault"));
        coches.add(new CochesMain("Tesla"));
        coches.add(new CochesMain("Volkswagen"));
        System.out.println(coches);
    }

}
