package Tema8;

import java.util.Scanner;
public class ErrorRunTime {
    public static void main(String[] args) {
        funcionDivide(20,0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        //Cuando dividimos en numero1 4 y numero2 0 se produce un error de runtime
        //Para evitar que el user itroduzca en el numero2 el valor 0 utilizaremos try:
        //En el carch especidicamos la excepción que queremos capturar mediante exception e .

        //int resultado = numero1 / numero2;
        //System.out.println("El resultado es: " + resultado);

        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Boom!, excepción es: " + e.getClass());
        }catch (Exception e){
            //Exception e calcula todas las excepciones que hay en Java , para calcular 1 especifica tenemos que decir-
            //la excepcion especifica que quiero controlar, en este caso la aritmética
            System.out.println("La excepción no es aritmética");
        }finally {
            System.out.println("Fin del programa error");
        }

    }
    public static void funcionDivide(Integer numeroA, Integer numeroB) throws ArithmeticException {
        int resultadoDivision = 0;
        try{
            resultadoDivision=numeroA / numeroB;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        System.out.println(resultadoDivision);
    }




    }
