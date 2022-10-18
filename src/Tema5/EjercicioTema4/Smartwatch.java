package Tema5.EjercicioTema4;

public class Smartwatch extends Smartdevice {
    Boolean  correa;
    Boolean  llamadas;
    Boolean auriculares;
    Boolean ritmoCardiaco;
    Boolean  modoSport;

    public Smartwatch(Boolean correa, Boolean llamadas, Boolean auriculares, Boolean ritmoCardiaco, Boolean modoSport) {
        this.correa = correa;
        this.llamadas = llamadas;
        this.auriculares = auriculares;
        this.ritmoCardiaco = ritmoCardiaco;
        this.modoSport = modoSport;
    }
}
