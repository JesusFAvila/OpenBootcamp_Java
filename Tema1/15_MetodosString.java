package com.company;

import java.util.Locale;

public class StringMain {
        public static void main(String[] args) {
            //LA CLASE STRING
                /*MÉTODOS DE STRING
                     *length() : para obtener la longitud
                     *toUpperCase(): Nos devuelve el mismo texto en mayúscula
                     *trim() : Para eliminar espacios en blanco
                     *equals(): Para comparar mensajes
                     *
                     * */

            String mensaje = " Hola mundo ";
            //Ejecucion length
            System.out.println("Ejecución Length en Hola mundo: " + mensaje.length());

            //Ejecucion toUpperCase (Para utilizarlo hay que crear otra variable)
            String mayuscula = mensaje.toUpperCase();
            System.out.println(mayuscula);

            //Ejecucion trim()
            System.out.println(mayuscula.trim());

            //Ejecucion equals()
            String otroMensaje = " Hola mundo ";
            if(mensaje.equals(otroMensaje)){
                System.out.println("Coinciden");
            }else{
                System.out.println("No coinciden");
            }


        }
    }




