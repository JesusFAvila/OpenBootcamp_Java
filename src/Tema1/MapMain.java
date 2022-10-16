package Tema1;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        //Interfaz Map: personas.("clave","valor");
        //Keyset: para obtener las claves
        //Values: para obtener el valor
        //entrySet(): para obterner elemento entry
        Map<String, String> personas = new HashMap<>();
        personas.put("71571164H", "Michael"); //Para las claves se utilizan un valor único, luego va el valor
        personas.put("64491375P", "Marian");
        personas.put("17749573G", "Bernardo");
        System.out.println(personas);

        //Creamos for para iterar el map, utilizamos keyset para que nos devuelva el cojunto de claves
        for(String key : personas.keySet()){
            System.out.println(key);
        }

        //Creamos for para iterar el map, utilizamos values para que nos devuelva el cojunto de valores
        for(String value : personas.values()){
            System.out.println(value);
        }

        //Creamos for para iterar el map, utilizamos entrySet() para que nos devuelva el cojunto de valores
        for(Map.Entry<String, String> entry : personas.entrySet()){
            System.out.println("entrySet() "+ entry.getKey() + " - " + entry.getValue());
        }

    }

}
