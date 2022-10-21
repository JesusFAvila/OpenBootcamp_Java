package Tema8;

public class DatosAvanzados {
    public static void main(String[] args) {
        String cadenaTexto = "Esto es una cadena de texto";
        int calcularTexto = cadenaTexto.length();
        System.out.println("La longitud de mi cadena de texto es de: " + calcularTexto);
        String cadenaMayus = cadenaTexto.toUpperCase();
        String cadenaMinus = cadenaTexto.toLowerCase();
        System.out.println(cadenaMayus);
        System.out.println(cadenaMinus);

    }

}
