package Tema1;

public class WhileContinueBreak {
    public static void main(String[] args) {
        //PALABRAS RESERVADAS BREAK Y CONTINUE
        int count = 0;
        while(count < 10){
            count ++; //operador incremento para sumar 1 a count y no tener un bucle infinito
            if (count == 6)
                continue; //Salta el valor 6 y continua a la siguiente iteración
                //break;//Rompe el flujo de ejecución
                System.out.println("se ha recorrido while " + count + " veces.");
        }
        System.out.println("FIN");

    }
}
