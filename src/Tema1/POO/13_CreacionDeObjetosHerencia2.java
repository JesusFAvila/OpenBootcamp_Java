package Tema1.POO;

public class CocheHibrido extends Coche{
    int bateriaCocheHibrido;
    public CocheHibrido() {
        this.bateriaCocheHibrido = 150;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "bateriaCocheHibrido=" + bateriaCocheHibrido +
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
