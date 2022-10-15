package Tema3.src;

public class FuncionesAnonimas {
    public static void main(String[] args) {

        //La sobrecarga de funciones nos permite duplicar funciones siempre que cambiemos o añadamos parámetros, ajemplos:
       int resultado = suma(500,400);
        System.out.println(resultado);
    }
    public static int suma (int numero1, int numero2){
        return numero1 + numero2;
    }
    //Clonamos función suma y añadimos numero3 para que acepte la sobrecarga de función.
    public static int suma (int numero1, int numero2, int numero3){
        return numero1 + numero2;
    }
}
