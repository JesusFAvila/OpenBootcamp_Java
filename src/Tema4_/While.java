package Tema4_;

public class While {
    public static void main(String[] args) {
        int contador  = 0;
        while (contador < 10){
            contador++;
            System.out.println("Contador es " +contador);
            if (contador == 5){
                break;
            }
        }
    }
}
