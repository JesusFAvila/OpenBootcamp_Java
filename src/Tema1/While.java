package Tema1;

public class While {
    public static void main(String[] args) {
        //BUCLES WHILE muy utilizada con contadores
        boolean check = true;
        int count = 0;
        while(count < 5){
            System.out.println("se ha recorrido while " + count + " veces.");
            count ++; //operador incremento para sumar 1 a count y no tener un bucle infinito
        }
    }


}
