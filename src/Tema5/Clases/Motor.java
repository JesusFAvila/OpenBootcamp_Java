package Tema5.Clases;

public class Motor {
    //1- ATRIBUTOS
    int capacidadDeposito;
    String tipo;
    String combustible;
    boolean turbo;
    int numCilindros;
    double velMax;

    //2 MÉTODOS CONSTRUCTORES
    public Motor(){}

    public Motor(int capacidadDeposito, String tipo, String combustible, boolean turbo, double velMax) {
        this.capacidadDeposito = capacidadDeposito;
        this.tipo = tipo;
        this.combustible = combustible;
        this.turbo = turbo;
        this.velMax = velMax;
    }

    //3 MÉTODOS

}
