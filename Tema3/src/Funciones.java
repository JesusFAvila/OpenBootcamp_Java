public class Funciones {

    public static void main(String[] args) {
        showMenu();
        getMenu();
        //La funcion getMenu no devolvería nada invocándola, por lo que hayq ue crear una variable e imprimir esa variable para mostrarla por pantalla.
       //OPCION 1 DE IMPRESION GET MENU
        String menu = getMenu();

        System.out.println(menu);
        //OPCION 2 DE IMPRESION GET MENU
        System.out.println(getMenu());
        //OPCION 2 DE IMPRESION GET PRICE, MISMA FORMA
        System.out.println(getPrice());

        //FUNCIÓN CON PARÁMETROS Y SIN TIPO DE RETORNO
        imprimirSaludo("Buenos días");

        //FUNCION CON PARÁMETRO Y RETORNO DEFINIDO
        //opción 1
        System.out.println(obtenerSaludo1("Jesús","Fernández"));

        //opción 2
        String nombre = "Clara";
        String apellido = "Espinosa";
        String saludo = obtenerSaludo2(nombre, apellido);
        System.out.println(saludo);

        //opcion2 suma

        int resultado = sumaNumeros(500, 100);
        System.out.println(resultado);

        int numeroA = 30;
        int numeroB = 10;
        int resultadoResta = numeroA - numeroB;
        System.out.println(resultadoResta);
    }

    //Creamos la función showMenu sin parámetros ni tipo de retorno (VOID), únicamente imprime en pantalla.
     public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1- Sección primera showMenu");
        System.out.println("2- Sección segunda showMenu");
        System.out.println("3- Sección tercera showMenu");
        System.out.println("4- Sección cuarta showMenu");
        System.out.println("5- Sección quinta showMenu");
    }

    //Creamos la función getMenu sin parámetros, pero que devuelve un tipo de retorno (String),  imprime en pantalla y devuelve tipo texto.
    public static String getMenu(){
        return "Menu: \n 1- Sección primera getMenu \n 2- Sección segunda getMenu \n 3- . . .";
    }
    public static int getPrice() {
        return 300;
    }

    //Creamos la función imprimirSaludo con parámetros, pero que no devuelve un tipo de retorno (Void).
    public static void imprimirSaludo(String saludo) {
        System.out.println("Esto es una función con parámetro saludo: " + saludo);
    }
    //Creamos la función recibirSaludo con parámetros y con un tipo de retorno (String).

    //opcion 1
    public static String obtenerSaludo1(String nombre, String apellido){
        return "Hola, mi nombre es: "+ nombre + " "+ apellido;
    }
    //opcion 2
    public static String obtenerSaludo2(String nombre, String apellido){
        return "Hola, mi nombre es: "+ nombre + " "+ apellido;
    }

    public static int sumaNumeros (int numero1,  int numero2){
        return numero1 + numero2;
    }

    //Otra forma de suma


}
