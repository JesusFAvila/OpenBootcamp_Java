package Tema8;

import java.util.HashMap;

public class DatosAvanzadosMaps {
    public static void main(String[] args) {
        //MAPAS / ARRAY ASOCIATIVO
        //Diccionario donde tenemos una clave y un valor

        //La forma más primitiva de mapa es el HashMap:
        //En el ejemplo vemos el tiempo de dato String e Integer: Esto significa que mi mapa es un diccionario cuyas claves van a ser cadenas de texto y los valores asociados a cada una de esas claves van a ser un entero.
        //Los HashMap tienen una peculiaridad y es que no podemos tener la clave duplicada.
        HashMap<String, Integer> mapPrimitivo = new HashMap<String, Integer>();

        //Añadir elemento al HashMap mediante .put
        //Utilizaremos los dos parametros, la clave y el valor
        mapPrimitivo.put("clave1", 120);
        mapPrimitivo.put("clave2", 987);
        mapPrimitivo.put("clave3", 32);
        mapPrimitivo.put("clave4", 11);

        System.out.println(mapPrimitivo);





    }
}
