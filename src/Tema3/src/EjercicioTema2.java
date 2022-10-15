package Tema3.src;

public class EjercicioTema2 {

    public static void main(String[] args) {
        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido
        double precioFinal  = precioIva(10,0.21);
        System.out.println("En un producto que cuesta 10 € hay que pagar un IVA de: " + precioFinal + "€.");

    }

    public static double precioIva ( double precioSinIva, double iva ){
        return precioSinIva * iva;

    }

}
