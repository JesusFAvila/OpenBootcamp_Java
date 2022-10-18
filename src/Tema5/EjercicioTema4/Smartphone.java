package Tema5.EjercicioTema4;


public class Smartphone extends Smartdevice {
    Boolean fundaProtectora;
    Double pulgadasCamara;
    Boolean camaraFrontal;
    Boolean modoGaming;

    public Smartphone(Boolean fundaProtectora, Double pulgadasCamara, Boolean camaraFrontal, Boolean modoGaming) {
        this.fundaProtectora = true;
        this.pulgadasCamara = 16.0;
        this.camaraFrontal = true;
        this.modoGaming = true;

    }
}
