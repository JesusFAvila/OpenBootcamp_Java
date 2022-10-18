package Tema6;
import java.util.ArrayList;
import  java.util.List;
public class EmpleadoCRUD {
    //Creamos un arrayList para simular una BBDD
    List<Empleado> empleados = new ArrayList<>();


    public void guardarEmpleados(Empleado empleado){
        empleados.add(empleado);

    }

}
