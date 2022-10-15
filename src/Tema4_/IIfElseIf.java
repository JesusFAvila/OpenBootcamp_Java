package Tema4_;

public class IIfElseIf {
    public static void main(String[] args) {
        int edad = 21;
        int dinero = 30000;
        int entrada = 30;


        if (edad >= 18 && dinero  >= entrada) {
            System.out.println("Cumples todos los requisitos para comprar tu entrada y pasar");
        }    else if (edad < 18 && dinero  >= entrada) {
            System.out.println("Eres menor de edad pero vas forrado, sobórname");
        }    else{
            System.out.println("Menor de edad, no puedes pasar");
        }
    }
}
