package Tema8;

import java.util.Vector;

public class DatosAvanzadosVectores {
    public static void main(String[] args) {
        //A diferencia del array no hace falta asignarle un tamaño al principio o al final.
        //Tienen dos propiedades el tamaño (.size) y la capacidad (.capacity)
        //La capacidad del vector inicialmente es siempre 10 (Capacidad real del array subyacente), pero aumentará de 10 en 10 progresivamente.
        //Podemos especificar la capacidad el vector y el incremento al declarar el vector: ejemplo con 30 de capacidad de inicial e incremento de 12
        //    Vector <Integer> vectorInt = new Vector<Integer>(30,12);

        //VECTOR INT
        Vector <Integer> vectorInt = new Vector<Integer>();
        vectorInt.add(12);
        vectorInt.add(18);
        vectorInt.add(36);
        vectorInt.add(21);
        vectorInt.add(80);
        vectorInt.add(99);
        vectorInt.add(30);
        System.out.println
                ("Datos del vectorInt: " + vectorInt);

        //metodo de vector para eliminar indices
        vectorInt.remove(2);
        System.out.println
                ("Datos del vectorInt: " + vectorInt);

        //Métodos para comprabar la capacidad y el tamaño del vector
        System.out.println
                ("Comprobamos el capacidad del vectorInt: " + vectorInt.capacity() + " y de tamaño: " + vectorInt.size());

        //VECTOR STRING
        Vector <String>vectorString =  new Vector<String>();
        vectorString.add("Hola");
        vectorString.add("esto");
        vectorString.add("es");
        vectorString.add("un");
        vectorString.add("vector tipo String");
        System.out.println
                ("Datos del vectorString: " + vectorString);

        vectorString.remove(4);
        System.out.println
                ("Datos del vectorString: " + vectorString);
        vectorString.remove("Hola");
        System.out.println
                ("Datos del vectorString: " + vectorString);
        System.out.println
                ("Comprobamos el capacidad del vectorString: " + vectorString.capacity() + " y de tamaño: " + vectorString.size());

        //VECTOR INT LIMITADO EN CAPACIDAD
        Vector <Integer> vectorIntLimit = new Vector<Integer>(1,50);
        vectorIntLimit.add(23);
        vectorIntLimit.add(24);

        System.out.println
                ("Datos del vectorIntLimit: " + vectorIntLimit);
        System.out.println
                ("Comprobamos el capacidad del vectorIntLimit: " + vectorIntLimit.capacity() + " y de tamaño: " + vectorIntLimit.size());

        //COMPARAR VECTORES mediante equals()
        Vector <Integer> vectorComparate1 = new Vector<Integer>();
        vectorComparate1.add(1);
        vectorComparate1.add(2);
        vectorComparate1.add(3);
        vectorComparate1.add(4);
        vectorComparate1.add(5);
        vectorComparate1.add(6);

        Vector <Integer> vectorComparate2 = new Vector<Integer>();
        vectorComparate2.add(1);
        vectorComparate2.add(2);
        vectorComparate2.add(3);
        vectorComparate2.add(4);
        vectorComparate2.add(5);
        vectorComparate2.add(6);

        boolean resultado = vectorComparate1.equals(vectorComparate2);
        System.out.println
                ("El resultado de la comparación es: " + resultado);
        
        //RECORRER UN VECTOR
        //forma corta
        for (int i : vectorComparate2){
            System.out.println
                    ("Recorriendo el vector mediante for corto:" +  i);
        }

        //forma larga
        for (int i = 0; i < vectorComparate1.size(); i++){
            System.out.println
                    ("Recorriendo el vector mediante for largo: " + vectorComparate1.get(i));
            //System.out.println("Recorriendo el vector mediante for largo: " + i);
        }

        //añadiendo dos numeros mas mediante un if
        for (int i = 0 ; i < vectorComparate2.size(); i++){
            //Si el resultado de dividir i entre 2 es 0 el resto es 0. Si el resultado es 0 elimina el elemento del vestor.
            if(i % 2 == 0){
                vectorComparate2.remove(i);
                continue;
            }
            System.out.println
                    ("Añadiendo dos numeros al vector, el valor es: " + vectorComparate2.get(i) + " En posición: " + i);
        }

        //Decrecer un vector de forma segura mediante trimtosize
        Vector <Integer> vectorDecrecer = new Vector<Integer>(5,2);
        vectorDecrecer.add(1);
        vectorDecrecer.add(2);
        vectorDecrecer.add(3);
        vectorDecrecer.add(4);
        vectorDecrecer.add(5);
        vectorDecrecer.add(6);
        System.out.println
                ("VectorDecrecer Capacidad: " + vectorDecrecer.capacity() + " Tamaño: " + vectorDecrecer.size());

        vectorDecrecer.trimToSize();
        //reduce la capacidad hasta su tamaño real, así conseguimos ahorrar/liberar memoria.
        System.out.println
                ("VectorDecrecer Capacidad: " + vectorDecrecer.capacity() + " Tamaño: " + vectorDecrecer.size());
    }
}
