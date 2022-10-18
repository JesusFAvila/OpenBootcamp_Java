package Tema6;

public class Main {
    public static void main(String[] args) {
        //INTERFACES
        //Creación de objeto de la clase EmpleadoCRUD
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado empleado1 = new Empleado("Jesús", "Fernández", 30, 1300,false,"Desarrollador web");
        Empleado empleado2 = new Empleado("Clara", "Espinosa", 28, 800,true,"Animadora Sociocultural");
        Empleado empleado3 = new Empleado("Ana", "Medina", 32, 1350,true,"Optometrista");
        Empleado empleado4 = new Empleado("Bárbara", "Fernández", 28, 1200,true,"Recursos Humanos");
        Empleado empleado5 = new Empleado("Jaime", "Espigares", 31, 1600,true,"Funcionario del Estado");

        empleadoCRUD.guardarEmpleados(empleado1);
        empleadoCRUD.guardarEmpleados(empleado2);
        empleadoCRUD.guardarEmpleados(empleado3);
        empleadoCRUD.guardarEmpleados(empleado4);
        empleadoCRUD.guardarEmpleados(empleado5);
    }
}
