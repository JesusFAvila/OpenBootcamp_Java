package Tema6.ConInterfaces;

import Tema6.SinInterfaces.Empleado;

public class Main {
    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {


        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
        System.out.println("Hola mundo");

    }
}
