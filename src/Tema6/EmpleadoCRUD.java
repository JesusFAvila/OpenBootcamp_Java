package Tema6;
import java.util.ArrayList;
import  java.util.List;
public class EmpleadoCRUD {
    //Creamos un arrayList para simular una BBDD
    //Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

//Operaciones CRUD
    //CREATE
    public void guardarEmpleados(Empleado empleado){
        empleados.add(empleado);

    }

    //Funcion para mostrar empleados
    public List<Empleado> consultarEmpelados(){
        return empleados;
    }

}
