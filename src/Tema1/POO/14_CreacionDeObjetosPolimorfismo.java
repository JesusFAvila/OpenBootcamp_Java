package Tema1.POO;

public class PolimorfismoMain {
    public static void main(String[] args) {
        //POLIMORFISMO: Nos permite utilizar estructuras de datos o bucles para poder iterar sobre la lista de coches a pesar de que cada uno sea de un tipo diferente.
        Coche cocheObj = new CocheElectrico();
        Coche cocheObj2 = new CocheHibrido();

        //instanceoff: nos permite comprobar si cocheObj es CocheElectrico o CocheHibrido. Comprobamos si cocheObj2 es instancia de la clase CocheHibrido
        if(cocheObj instanceof Coche){
            System.out.println("Coche");
        }
        if(cocheObj instanceof CocheHibrido){
            System.out.println("CocheHibrido");
        }else if(cocheObj instanceof CocheElectrico){
            System.out.println("CocheElectrico");
        }


    }
}
