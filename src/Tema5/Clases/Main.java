package Tema5.Clases;

public class Main {
    public static void main(String[] args) {
        //Creación de objeto
        Vehiculo coche2 = new Vehiculo("mercedes","Benz","Audi",300.5,"Gris Metalizado",false,2022,0.0);
        Vehiculo coche1 = new Vehiculo("Ford", "Mondeo","Ford",300.0,"Rojo",true,2022, 0.0);
        System.out.println(coche1.marca);
        System.out.println(coche2.modeSport);

        System.out.println("Velocidad coche1: "+coche1.velocidad + "km/h");
        coche1.acelerar(100);
        System.out.println("Velocidad coche1: "+coche1.velocidad + "km/h");

        System.out.println("Velocidad coche2: "+coche2.velocidad +"km/h");
        coche2.acelerar(190);
        System.out.println("Velocidad coche2: "+coche2.velocidad +"km/h");




    }
}