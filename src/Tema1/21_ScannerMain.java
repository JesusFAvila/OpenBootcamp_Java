package Tema1;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        //Println() : imprimir en una nueva linea
        //System.out : Para imprimir datos
        //System.in : Para introducir datos. Creamos el objeto scanner para utilizar en él el System.in
        // nextLine :  Nos permite introducir un dato String.
        //nextInt : Nos permite introducir un dato Int;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca un nombre.");
        String nombre = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Por favor introduzca su edad.");
        int numero = scanner.nextInt();
        scanner.nextInt();

        System.out.println("Usted se llama: " + nombre +", y tiene: "+ numero +" años, Gracias.");
        System.out.println("Fin");




    }
}
