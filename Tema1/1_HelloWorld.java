package com.CursoJava;

/**
 * Clase HelloWorld, punto de entrada a la aplicación
 * @author JesusFAvila
 */
public class HelloWorld {
    /**
     * Funcion main principal
     * @param args;
     * @since 1.0
     */
    public static void main(String [] args){ // ATAJO: main
        Funciones.funcionHolaMundo("jhon wick"); //Función llamada de la calse Funciones
        Funciones.funcionDevolverTextoProtected();
        /*Modificadores del método:
            PUBLIC (Es publico, puede ser ejecutado desde fuera de la clase)
            STATIC (Indica que pertenece a esta clase, no es necesario crear un objeto)
            VOID (Tipo de retorno, void no devuelve nada)
            MAIN (Indica el nombre del método, main concretamente es el método principal reservado, solo debe haber 1)
            STRING [] ARGS: Array de argumentos.
         */
        System.out.println("Hola mundo desde clase HelloWorld"); //ATAJO: sout
    }

}
