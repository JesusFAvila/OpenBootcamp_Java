package Tema4_;

public class Switch {
    public static void main(String[] args) {
        String dia = "lunea";
        switch (dia) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            case "miercoles":
                System.out.println("Hoy es miercoles");
                break;
            case "jueves":
                System.out.println("Hoy es jueves");
                break;
            case "viernes":
                System.out.println("Hoy es viernes");
                break;
            case "sabado":
                System.out.println("Hoy es sabado");
                break;
            case "domingo":
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("'" + dia + "' no es un día válido");
        }
    }
}
