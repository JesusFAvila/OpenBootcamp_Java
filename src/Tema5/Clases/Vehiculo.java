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
        //Podemos aplicar la encapsulación a atributos mediante private y solo se podrá hacer uso desde el método main
        private String atributoEncapsulado;
        Motor motor; //creamos motor como objeto en la calse Motor

        //2- Métodos Constructores
        public Vehiculo (){}

        public Vehiculo(String marca, String modelo, String fabricante, Double Caballos, String color, boolean modeSport, int year, Double velocidad,Motor motor){
                this.marca= marca;
                this.modelo= modelo;
                this.fabricante= fabricante;
                this.Caballos= Caballos;
                this.color= color;
                this.modeSport= modeSport;
                this.year= year;
                this.velocidad= velocidad;
                this.motor= motor;
            }

        //3- Métodos
        public void acelerar( int cantidad){
            this.velocidad += cantidad;



    }
}
