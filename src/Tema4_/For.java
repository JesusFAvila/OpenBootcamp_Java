package Tema4_;

public class For {
    public static void main(String[] args) {
        //imprimir texto 10 veces
        for (int i = 0; i < 10; i++) {
            System.out.println("hola mundo " + i + " veces." );
        }

        //For para recorrer array nombres
        String[] nombres = {"nombre1","nombre2","nombre3","nombre4","nombre5","nombre6","nombre7","nombre8","nombre9","nombre10",};
        for(int i =0; i <  nombres.length ; i++){
            System.out.println(nombres[i]);
        }
    }
}
