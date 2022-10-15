package Tema1;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "llueve";

        switch (weather){
            case "sunny":
                System.out.println("Es verano");
                break;
            case "winter":
                System.out.println("Es invierno");
                break;
            case "cloudy":
                System.out.println("Está nublado");
                break;
            default:
                System.out.println("No se reconoce ningún tiempo con la característica: '" + weather + "'");
        }
    }
}
