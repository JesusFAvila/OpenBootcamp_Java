package com.CursoJava;

public class CocheMain {
    public static void main(String[] args) {
        //OBJETOS
        // .1 Tenemos que asignar el tipo de dato. (Coche)
        // .2 El identificador (cocheObj)
        // .3 Operador igual para designar.
        //.4 Operador new que nos permite crear un objeto a partir de una clase, por lo que debe tener el mismo nombre.
        //.5 Parentesis para invocar la creación del objeto.
        Coche cocheObj2 = new Coche();
        Coche cocheObj = new Coche("rojo", "Mercedes", "Benz","Diesel", 1450.50,300);
        cocheObj.acelerar(90);
        System.out.println(cocheObj);

        cocheObj.peso = 1350.20; //Podemos cambiar un atributo ya definido desde aquí
        System.out.println(cocheObj);


        //Creamos el constructor de la clase CocheElectrico
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.marca = "Tesla";
        cocheElectrico.modelo = "Clase A";
        cocheElectrico.color = "verde";
        cocheElectrico.peso = 1350.20;
        cocheElectrico.tipoMotor="Eléctrico";
        cocheElectrico.bateriaCocheElectric=160;
        cocheElectrico.caballos=300;
        cocheElectrico.acelerar(100);
        System.out.println(cocheElectrico);

        //Creamos el constructor de la clase CocheHibrido
        CocheHibrido cocheHibrido = new CocheHibrido();
        cocheHibrido.marca = "Peugeot";
        cocheHibrido.modelo = "308";
        cocheHibrido.color = "azul";
        cocheHibrido.peso = 1900.50;
        cocheHibrido.tipoMotor="Gasolina-Eléctrico";
        cocheHibrido.bateriaCocheHibrido = 150;
        cocheHibrido.acelerar(100);
        System.out.println(cocheHibrido);

        //Probando el método SUPER
        CocheElectrico cocheElectrico2 = new CocheElectrico("blanco","Renault","Megane","Electrico",2000.20, 300,100);
        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

    }

}

