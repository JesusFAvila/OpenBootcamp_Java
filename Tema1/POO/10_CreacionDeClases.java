package com.CursoJava;

public class Coche {
    //ATRIBUTOS: Caracterísiticas de la clase y que la distingue de eotras (Altura, color, caballos...)
    String color;
    String marca;
    String modelo;
    Double peso;
    int caballos;
    double velocidad;

    //CONSTRUCTORES: Métodos especiales que nos permiten crear objetos de la clase. Por defecto siempre hay un constructor vacío
    public Coche (String color, String marca, String modelo, Double peso,int caballos){
        //el método constructor debe tener el mismo nombre de la clase.
        this.color = color; //utilizamos this para indicar que el objeto que se ha creado a partir de la calse sea una referencia a la propeidad de este objeto.
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.caballos = caballos;
        this.velocidad = 0.0;
    }


    //COMPROTAMIENTOS
    public void acelerar(int cantidad){
        //limitamos la velocidad mediante esturcutra de control if.
        if (this.velocidad > 0 && velocidad <= 120){
            this.velocidad += cantidad;
        }
    }
// CREATE TO STRING para imprimir objetos
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", caballos=" + caballos +
                ", velocidad=" + velocidad +
                '}';
    }
}
