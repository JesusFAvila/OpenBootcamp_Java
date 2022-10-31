package Tema9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Scanner {
    public static void main(String[] args) throws FileNotFoundException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        boolean ok = false;
        do{
            System.out.println("Introduce nombre y primer apellido");
            scanner.reset();
            try{
                String nombre = scanner.next();
                String apellido = scanner.next();
                ok = true;
                System.out.println("Los valores introducidos son: " + nombre + " " + apellido);
            }catch (Exception e){
                System.out.println("DATOS NO VÁLIDOS");
            }

        } while (!ok);

        scanner1();
    }

    public static void scanner1(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Introduce tres numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Los valores introducidos son: " + num1 + ", " + num2 + " y " + num3);
    }
}
