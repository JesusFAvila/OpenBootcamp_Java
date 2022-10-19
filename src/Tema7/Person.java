package Tema7;

public class Person {

    String nombre;
    String apellidos;
    int DNI;
    String genero;
    Boolean hijos;
    Boolean casado;
    String nombrePerro;

    private Sistema sistema;
    private Addres addres;

    public Person(){}
     public Person (String nombre,String apellido, int DNI, String genero, Boolean hijos, Boolean casado, String nombrePerro ){
         this.nombre = nombre;
         this.apellidos = apellido;
         this.DNI = DNI;
         this.genero = genero;
         this.hijos = hijos;
         this.casado = casado;
         this.nombrePerro = nombrePerro;
     }


}


