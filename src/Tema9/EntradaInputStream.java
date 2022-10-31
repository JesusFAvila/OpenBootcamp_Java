package Tema9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaInputStream {
    public static void main(String[] args) {
        //clase InputStream
        //FileInputStream para leer desde ficheros, se declara la variable FileInputStream e inicializo el objeto FileInputStream
        try {
            //Fichero con el que quiero trabajar: input.txt
            InputStream fichero = new FileInputStream("input.txt");
            try {
                //Dónde quiero el fichero: variable datos
                byte[] datos = fichero.readAllBytes();
                //Mostrar datos mediante for:
                for (byte dato : datos) {
                    System.out.println((char)dato);
                }
            }catch (IOException e){
                System.out.println("Imposible leer el fichero " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("No existe el archivo seleccionado " + e.getLocalizedMessage());
        }
    }
}
