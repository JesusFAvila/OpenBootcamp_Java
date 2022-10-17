package Tema5.Clases;

import Tema5.Herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        //Creación de objeto
        Motor motorGti = new Motor(70,"cuatro tiempos","diesel",true,250);
        Motor motorBenz = new Motor(120,"cuatro tiempos","gasolina",false,200);
        Vehiculo coche2 = new Vehiculo("mercedes","Benz","Audi",300.5,"Gris Metalizado",false,2022,0.0,motorBenz );
        Vehiculo coche1 = new Vehiculo("Ford", "Mondeo","Ford",300.0,"Rojo",true,2022, 0.0,motorGti);
        System.out.println(coche1.marca);
        System.out.println(coche2.modeSport);
        System.out.println(coche1.motor.velMax);
        System.out.println(coche2.motor.velMax);

        Motocicleta ducatiMonster = new Motocicleta(true,"Disco",true,false);
        ducatiMonster.marca = "Ducati";
        ducatiMonster.modelo = "Monster";

        System.out.println(ducatiMonster.marca);



        System.out.println("Velocidad coche1: "+coche1.velocidad + "km/h");
        coche1.acelerar(100);
        System.out.println("Velocidad coche1: "+coche1.velocidad + "km/h");

        System.out.println("Velocidad coche2: "+coche2.velocidad +"km/h");
        coche2.acelerar(190);
        System.out.println("Velocidad coche2: "+coche2.velocidad +"km/h");


        System.out.println("FIN DE PROGRAMA");

    }
}
