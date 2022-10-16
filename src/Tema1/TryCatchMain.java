package Tema1;

public class TryCatchMain {
    public static void main(String[] args) {

        //TryCatch se utiliza para realizar el programa más robusto y evitar que no cointinue la ejecución de código por un error aritético en este caso.
        //Entre el Try se añade la función problemática o que puede dar problemas ye ntre el catch el código que llevara a cabo si se produce el problema.
        //Podemos añadir el Finally para cerrar recursos opcionalmente
        try {
            int divisionProblematica = 5/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("Prueba error");

    }
}
