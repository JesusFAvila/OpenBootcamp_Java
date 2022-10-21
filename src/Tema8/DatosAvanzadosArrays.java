package Tema8;

public class DatosAvanzadosArrays {
    public static void main(String[] args) {
        //Declarar un array: tipo, id, corchetes, igual new tipo y entre corchetes cantidad de elementos que tendrá el array
        //Primera forma de hacerlo cuando NO sabemos qué valores tendrá cada elemento del array

        int arrayNum[] = new  int [5];
        arrayNum[0] = 1;
        arrayNum[1] = 2;
        arrayNum[2] = 3;
        arrayNum[3] = 4;
        arrayNum[4] = 5;

        //Segunda forma de hacerlo. Declaramos e inicializamos el array en un único paso.
        int arrayNumDos[] ={1,2,3,4,5,6,7,8,9,10};

        //FORMAS DE RECORRER UN ARRAY
        for (int i = 0; i <= arrayNumDos.length; i++){
            System.out.println("Primer for con concicionales: "+ i);
        }

        //FORMA CORTA: También se llama foreach. Consiste en declarar el for y en el interior declarar la variable temporal i (Del mismo tipo que el array. seguido de : id , que quiere decir que por cada elemento del array le asigne temporalmente la variable i )
        for (int i : arrayNum){
            System.out.println("Segundo for sin concicionales: "+i);
        }

        String arrayString [] = {
                "Pepe",
                "Juan",
                "Francisco",
                "Patxi"
        };

        System.out.println("Longitud del array + nombres.legth: "+ arrayString.length);
        System.out.println(arrayString[1]);

        for (String i : arrayString){
            System.out.println("Forma corta de recorrer un array mediante un for: "+i);
        }

        for (int i = 0; i <= arrayString.length; i++){
            //System.out.println("Forma larga de recorrer un array mediante un for: "+ arrayString[i] + "En posición: " + i);
        }

        //ARRAY BIDIMENSIONALES
        //El primer elemento es el numero de fila y el segundo es el número de columna
        int arrayBidi [][] = new int[2][4];
        //COLUMNAS
        //El orden seria: primera fila primera columna
        arrayBidi[0][0] = 1;
        //El orden seria: primera fila primera columna
        arrayBidi[0][1] = 2;
        //El orden seria: primera fila primera columna
        arrayBidi[0][2] = 3;
        //El orden seria: primera fila primera columna
        arrayBidi[0][3] = 4;

        //FILAS
        //El orden seria: SEGUNDA fila primera columna
        arrayBidi[1][0] = 10;
        //El orden seria: SEGUNDA fila segunda columna
        arrayBidi[1][1] = 20;
        //El orden seria: SEGUNDA fila tercera columna
        arrayBidi[1][2] = 30;
        //El orden seria: SEGUNDA fila cuarta columna
        arrayBidi[1][3] = 40;

        //Por cada dimension se mete un for en otro for

        for (int i = 0; i< arrayBidi.length; i++) {
            System.out.println("El array bidimensional vale: " + i);
            //mostrar el contenido de cada columna
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Estoy en i = "+ i + ", j = "+ j);
                System.out.println(arrayBidi[i][j]);
            }
        }





    }


}
