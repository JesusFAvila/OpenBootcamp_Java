public class Operadores {
    public static void main(String[] args) {
        //OPERADORES ARITMÉTICOS
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;
        int numero5 = 40;
        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero2 - numero1;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero2 / numero1;
        System.out.println(resultadoSuma + "," + resultadoResta + "," + resultadoMultiplicacion + "," + resultadoDivision);

        //OPERADORES DE COMPARACIÓN
        boolean resultado1 = numero1 < numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero2 < numero1;
        System.out.println(resultado2);

        boolean resultado3 = numero4 == numero5;
        System.out.println(resultado3);

        boolean resultado4 = numero4 != numero5;
        System.out.println(resultado4);

        //OPERADORES LÓGICOS
        int mayorEdad = 17;
        int dinero = 6000;
        int entrada = 20;
        if (mayorEdad >= 18 && dinero >= entrada) {
            System.out.println("Puedes pasar, eres mayor de edad y puedes pagar la entrada ");
        } else if (mayorEdad < 18) {
            System.out.println("No puedes pasar, eres menor de edad");
        } else if (mayorEdad >= 18 && dinero < entrada) {
            System.out.println("No puedes pasar, eres mayor de edad pero estás pelao");
        }
    }
}
