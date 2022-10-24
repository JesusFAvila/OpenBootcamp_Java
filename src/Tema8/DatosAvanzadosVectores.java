package Tema8;

import java.util.Vector;

public class DatosAvanzadosVectores {

    public static void main(String[] args) {
        //A diferencia del array no hace falta asignarle un tamaño al principio o al final.
        //Tienen dos propiedades el tamaño (.size) y la capacidad (.capacity)

        Vector <Integer> vectorInt = new Vector<Integer>();
        vectorInt.add(12);
        vectorInt.add(18);
        vectorInt.add(36);
        vectorInt.add(21);
        vectorInt.add(80);
        vectorInt.add(99);
        vectorInt.add(30);
        System.out.println("Datos del vectorInt: " + vectorInt);

        //metodo de vector para eliminar indices
        vectorInt.remove(2);
        System.out.println("Datos del vectorInt: " + vectorInt);

        //Métodos para comprabar la capacidad y el tamaño del vector
        System.out.println("Comprobamos el capacidad del vectorInt: " + vectorInt.capacity() + " y de tamaño: " + vectorInt.size());

        Vector <String>vectorString =  new Vector<String>();
        vectorString.add("Hola");
        vectorString.add("esto");
        vectorString.add("es");
        vectorString.add("un");
        vectorString.add("vector tipo String");
        System.out.println("Datos del vectorString: " + vectorString);

        vectorString.remove(4);
        System.out.println("Datos del vectorString: " + vectorString);
        vectorString.remove("Hola");
        System.out.println("Datos del vectorString: " + vectorString);

        System.out.println("Comprobamos la tamaño del vectorString: " + vectorString.size());
        System.out.println("Comprobamos el capacidad del vectorString: " + vectorString.capacity());



    }
}
