package Tema5.Clases;

public class Vehiculo {

        //1- Atributos
        String marca;
        String modelo;
        String fabricante;
        Double Caballos;
        String color;
        boolean modeSport;
        int year;
        Double velocidad;

        //2- Métodos Constructores
        public Vehiculo(String marca, String modelo, String fabricante, Double Caballos, String color, boolean modeSport, int year, Double velocidad){
            this.marca= marca;
            this.modelo= modelo;
            this.fabricante= fabricante;
            this.Caballos= Caballos;
            this.color= color;
            this.modeSport= modeSport;
            this.year= year;
            this.velocidad= velocidad;
        }

        public Vehiculo (){}

        public void acelerar( int cantidad){
            this.velocidad += cantidad;
        }

    //3- Métodos
        public static void main(String[] args) {



        }
}
