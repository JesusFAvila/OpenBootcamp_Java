package Tema1;

public class ArrayMain {
    public static void main(String[] args) {


        //ARRAYS
        String nombre1 = "Jesús Fernández";
        String nombre2 = "Jhon Wick";
        String nombre3 = "Pepo";
        int numero1 = 12;
        int numero2 = 13;
        int numero3 = 14;

        int [] numeros = new int[3];
        String [] nombres = new String[3];
        String [] nombres2 = new String []{nombre1, nombre2, nombre3}; //Opción más corta

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        System.out.println(nombres[1]);

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }


    }
}
