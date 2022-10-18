package Tema6.SinInterfaces;

import java.util.List;

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

        //GUARDAR EMPLEADOS
        empleadoCRUD.guardarEmpleados(empleado1);
        empleadoCRUD.guardarEmpleados(empleado2);
        empleadoCRUD.guardarEmpleados(empleado3);
        empleadoCRUD.guardarEmpleados(empleado4);
        empleadoCRUD.guardarEmpleados(empleado5);

        //MOSTRAMOS DATOS DE EMPLEADO ESPECIFICO GRACIAS AL TOSTRING() DE LA CLASE EMPLEADO
        System.out.println(empleado5);

        //CONSULTAR EMPLEADOS
        List<Empleado>empleados = empleadoCRUD.consultarEmpelados();
        //System.out.println(empleados);
    }


}
