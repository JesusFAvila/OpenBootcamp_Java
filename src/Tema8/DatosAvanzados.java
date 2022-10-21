package Tema8;

public class DatosAvanzados {
    public static void main(String[] args) {

        String cadenaTexto = "Esto es una cadena de texto";
        int calcularTexto = cadenaTexto.length();
        System.out.println("La longitud de mi cadena de texto es de: " + calcularTexto);

        String cadenaMayus = cadenaTexto.toUpperCase();
        System.out.println(cadenaMayus);

        String cadenaMinus = cadenaTexto.toLowerCase();
        System.out.println(cadenaMinus);

        boolean pruebaFuncionEmpiezaString = cadenaTexto.startsWith("Esto es");
        System.out.println("la función cadenaTexto empieza por 'Esto es': "+ pruebaFuncionEmpiezaString);

        boolean pruebaFuncionAcabaString = cadenaTexto.endsWith("de texto");
        System.out.println("la función cadenaTexto acaba por 'de texto': "+ pruebaFuncionAcabaString);

        char letra = cadenaTexto.charAt(3);
        System.out.println("La letra que ocupa posición 5 de la cadena 'Esto es una cadena de texto' es la letra: " + letra);

        for (int i=0; i<cadenaTexto.length(); i++){
            System.out.println("utilizamos un for para recorrer un String como si se tratara de un array: " +cadenaTexto.charAt(i));
        }

        //Ejercicio: invertir un Strin en Java.
        String invertirString = "";
        for (int i = cadenaTexto.length() -1; i >= 0; i--){
            invertirString += cadenaTexto.charAt(i);
        }
        System.out.println("Cadena de texto original: "+ cadenaTexto);
        System.out.println("Cadena de texto invertida: "+ invertirString);






    }

}
