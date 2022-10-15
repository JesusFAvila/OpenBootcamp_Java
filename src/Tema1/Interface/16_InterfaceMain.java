package Tema1.Interface;

import com.CursoJava.Coche; //importamos clase Coche porque está en otro paquete.

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService cocheservice =  new CocheServiceClassicImpl();
        CocheService cocheservice2 = new CocheServiceSportImpl();

        Coche coche1 = cocheservice.crearCocheDemo();
        Coche coche2 = cocheservice2.crearCocheDemo();

    }
}
