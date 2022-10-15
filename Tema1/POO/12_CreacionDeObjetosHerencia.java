package com.CursoJava;

public class CocheElectrico extends Coche {
    //La clase CocheElectrico hereda de Coche los atributos mediante extends
    //Creamos su constructor en la clase CocheMain
    int bateriaCocheElectric;
    public CocheElectrico() {
        this.bateriaCocheElectric = 380;
    }

    // Método SUPER para reutilizar código de la clase CocheMain
    public CocheElectrico(String color, String marca, String modelo,String tipoMotor, Double peso,int caballos,int bateriaCocheElectric) {
        super(color, marca, modelo, tipoMotor, peso, caballos);
        this.bateriaCocheElectric = bateriaCocheElectric;
      }

    @Override //Elemento sintactico que aporta metadatos a los métodos o clases, override indica al compilador que compruebe si existe el método acelerar en la clase superior.
    //Debemos evitar duplicar código mediante los mecanismos del sistema, como el método Super
    public void acelerar(int cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "bateriaCocheElectric=" + bateriaCocheElectric +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", peso=" + peso +
                ", caballos=" + caballos +
                ", velocidad=" + velocidad +
                '}';
    }
}



