package Tema8;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("rawtypes")
//Utilizamos SupressWarnings para eliminar aviso de error: Raw use of parameterized class 'Map.Entry'
public class DatosAvanzadosMaps {
    public static void main(String[] args) {
        //MAPAS / ARRAY ASOCIATIVO
        //Diccionario donde tenemos una clave y un valor

        //La forma más primitiva de mapa es el HashMap:
        //En el ejemplo vemos el tiempo de dato String e Integer: Esto significa que mi mapa es un diccionario cuyas -
            // claves van a ser cadenas de texto y los valores asociados a cada una de esas claves van a ser un entero.
        //Los HashMap tienen una peculiaridad y es que no podemos tener la clave duplicada.
        HashMap<String, Integer> mapPrimitivo = new HashMap<>();
        //Añadir elemento al HashMap mediante .put
        //Utilizaremos los dos parametros, la clave y el valor
        mapPrimitivo.put("clave1", 120);
        mapPrimitivo.put("clave2", 987);
        mapPrimitivo.put("clave3", 32);
        System.out.println(mapPrimitivo);

        //El valor se sobreescribe mediante .put
        mapPrimitivo.put("clave4", 11);
        //mapPrimitivo.put("clave4", 22);
        //Con el .put podemos pisar valores.
        System.out.println(mapPrimitivo);

        //Método para consultar una clave determinada mediante.get
        System.out.println
                ("Utilizamos el metodo .get " + mapPrimitivo .get("clave3"));

        //Reemplazar un valor mediante .replace
        System.out.println
                ("Clave2: " + mapPrimitivo.get("clave2"));
        mapPrimitivo .replace("clave2", 1);
        System.out.println
                ("Clave2: " + mapPrimitivo.get("clave2"));

        //Eliminar mediante .remove
        System.out.println("Mapa en su totalidad: " + mapPrimitivo);
        mapPrimitivo.remove("clave2");
        System.out.println("Clave 2 eliminada del map: " + mapPrimitivo);

        //Recorrer un mapa:
        for (Map.Entry elemento : mapPrimitivo.entrySet()) {
            System.out.println
                    ("Elemento: " + elemento.getKey() + " con clave: "+ elemento.getValue());
        }
    }
}
