package Tema5.EjercicioTema4;

public class Main {
    public static void main(String[] args) {
        Smartphone iphone13 = new Smartphone(true,18.0,true,true);
        iphone13.sistemaOperativo ="iOS";
        iphone13.versionSistema = 68.6;
        iphone13.pulgadas = 20;
        iphone13.memoriaRam = 18;
        iphone13.instalacionApp = true;
        iphone13.color = "Blanco";
        iphone13.tipo = "SmartPhone";
        System.out.println("Iphone13: Tipo de dispositivo: "+ iphone13.tipo + ", Tipo de SO: "+ iphone13.sistemaOperativo + ", Versión SO:  " + iphone13.versionSistema + ", Pulgadas: " +  iphone13.pulgadas + ", Memoria RAM: " + iphone13.memoriaRam + ", Instalación de apps: " + iphone13.instalacionApp+ ", Color: " + iphone13.color + "Pulgadas de cámara: "+iphone13.pulgadasCamara + "Incluye funda protectora: " +iphone13.fundaProtectora+"Modo Gaming: "+iphone13.modoGaming+"Memoria RAM: "+ iphone13.memoriaRam);


        Smartwatch samsungWatch = new Smartwatch(false,false,true,true,true);
        samsungWatch.sistemaOperativo ="Android";
        samsungWatch.versionSistema = 17.0;
        samsungWatch.pulgadas = 5;
        samsungWatch.memoriaRam = 4;
        samsungWatch.instalacionApp = false;
        samsungWatch.color = "Negro";
        samsungWatch.tipo = "SmartWatch";
        System.out.println("SamsungWatch: Tipo de dispositivo: "+ samsungWatch.tipo + ", Tipo de SO: "+ samsungWatch.sistemaOperativo + ", Versión SO:  " + samsungWatch.versionSistema + ", Pulgadas: " +  samsungWatch.pulgadas + ", Memoria RAM: " + samsungWatch.memoriaRam + ", Instalación de apps: " + samsungWatch.instalacionApp+ ", Color: " + samsungWatch.color + ", Modo llamada: "+samsungWatch.llamadas + ", Incluye correa: " +samsungWatch.correa+", Modo deportivo: "+samsungWatch.modoSport+", Memoria RAM: "+ samsungWatch.memoriaRam);


    }


}
