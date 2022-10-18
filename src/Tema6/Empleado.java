package Tema6;

public class Empleado {
    //1- ATRIBUTOS
    String nombre;
    String apellidos;
    int edad;
    int salario;
    boolean activoBaja;
    String empleo;

    //2- CONSTRUCTOR
    public Empleado(){}
    public Empleado(String nombre, String apellidos, int edad, int salario, boolean activoBaja, String empleo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
        this.empleo = empleo;
    }

    //3- MÉTODOS
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activoBaja=" + activoBaja +
                ", empleo='" + empleo + '\'' +
                '}';
    }
}
