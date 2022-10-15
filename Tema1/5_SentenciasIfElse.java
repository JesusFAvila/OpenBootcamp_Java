package com.CursoJava;

public class IfElse {
    public static void main(String[] args) {
        //ESTRUCTURAS DE CONTROL
        boolean check = 5 < 10;
        int number1 = 12;
        int number2 = 20;
        int number3 = 1;

        //if(check){
        if (number2 >= number1 && number3 > number1 || check){
            //Si 20 es mayor o igual a 12 (Se cumple) Y 1 es mayor que 12 (no se cumple) O 5 es menor que 10 (Se cumple gracias al O, sino entraría el else.)
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }

        //ELSE IF
        if (number1 == number3){
            System.out.println("Primera condicion");
        }else if(number3 > number2){
            System.out.println("Segunda condicion");
        }else{
            System.out.println("Tercera condicion");
        }
    }
}
