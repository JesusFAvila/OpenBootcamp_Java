package Tema5.Herencia;

import Tema5.Clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;
    String freno;
    boolean carenado;
    boolean mezclaAceite;

    public Motocicleta(boolean baul, String freno, boolean carenado, boolean mezclaAceite) {
        this.baul = baul;
        this.freno = freno;
        this.carenado = carenado;
        this.mezclaAceite = mezclaAceite;
    }


}
