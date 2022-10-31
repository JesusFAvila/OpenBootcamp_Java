package Tema9;

import java.io.*;

public class BufferInputStream {
    public static void main(String[] args) {
        //clase BufferedInputStream
        //BufferedInputStream No trabaja con ficheros trabaja con entradas
        try {
            //Fichero con el que quiero trabajar: input.txt
            InputStream fichero = new FileInputStream("input.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {
                int dato = ficheroBuffer.read();
                //Detener bucle while en el último elemento
                while (dato != -1){
                    //EOF = END OF FILE
                    System.out.println((char)dato);
                    dato = ficheroBuffer.read();
                }
            }catch (IOException e){
                System.out.println("Imposible leer el fichero " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("No existe el archivo seleccionado " + e.getLocalizedMessage());
        }
    }
}
