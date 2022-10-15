package com.CursoJava;

public class Funciones {
    public static void main(String[] args) {
        funcionHolaMundo(); //Llamada a la función en MAIN
        funcionHolaMundo("Jhon Wick"); //Pasamos el parámetro name desde la llamada a la función
        funcionHolaMundo("Paquito el de los palotes"); //Pasamos otro parámetro name desde la llamada a la función
        String variableTexto = funcionDevolverTexto(); // Creamos una variable que contenga la llamada a la función para imprimir la variable en pantalla
        System.out.println(variableTexto);
        funcionDevolverTextoProtected();
    }

    //FUNCIONES: Agrupaciones de sentencias que podrán ser utilizadas en cualquier punto de la aplicación
    //Las funciones se componen por el identificador (funcionHolaMundo), por el tipo de retorno de dato (Void, String, Int...), el modificador, que indica  que pertenece a la clase (Static), y el modificador de visibilidad (public, private...) que nos permite que sea privada, publica o protegida, para ser invicada fuera de la clase o no.
    public static void funcionHolaMundo() {
        System.out.println("Primera funcion Hola mundo");
        System.out.println("Primera funcion Hola mundo");
    }
    public static void funcionHolaMundo(String name) { //Pedimos que la función pueda contener el parámetro String (name)
        System.out.println("Segunda funcion Hola "+ name);
    }

    private static String funcionDevolverTexto(){
        return "Funcion devolver un texto";
    }

    protected static void funcionDevolverTextoProtected(){ //La visibilidad Protected significa que se restringe el acceso solo a clases hijas (En el mismo paquete)
        System.out.println("Funcion devolver un texto Protected");
    }
    //Para llamar a funciones desde otras clases se llamaría primero a la clase y luego a la funión seguida de punto, ejemplo:
    //Funciones.funcionDevolverTextoProtected();
}
