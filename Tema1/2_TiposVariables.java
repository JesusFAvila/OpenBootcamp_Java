package com.CursoJava;

public class tipos{
        public static void main(String[] args) {
            //tipo de dato, identificador y operador igual junto con valor

            //1- TIPOS DE ENTEROS *PRIMITIVO (cada variable tipo byte, short, int... tienen una capacidad diferente)
            // INT Y LONG son los más utilizados
            byte number1 = 1; //1 byte
            short number2 = 2;// 2 byte
            int number3 = 3;// 4 byte
            long number4 = 4l;// 8 byte

            //2- TIPOS DEPUNTO FLOTANTE *PRIMITIVO
            float decimal1 = 4.9f;
            double decimal2 = 9.99;

            //3- TIPOS DE CARACTER *PRIMITIVO
            char caracter1 = 'a';

            //4- TIPOS DE BOOLEANOS *PRIMITIVO
            boolean verdadero = true;
            boolean falso = false;

            //5- TIPOS DE CADENAS DE TEXTO *NO PRIMITIVO
            String nombre = "Jesus";
            String apellido = "FerAvila";

            //6- TIPOS DE ENVOLTORIO
            Integer numero = null; //Envuelve las variables primitivas para utilizarlas en resultados null, por ejemplo.
            Long numero2 = 2L;
        }
}
