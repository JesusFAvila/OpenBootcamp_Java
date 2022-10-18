package Tema6.ConInterfaces;

import Tema6.SinInterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {

    //Los métodos se declaran no se implementan
    //Dicen lo que hay que hacer pero no lo hacen

    //MÉTODO SAVE
    void save (Empleado empleado);

    //MÉTODO CONSULTAR
    List<Empleado> findAll();

    //MÉTODO BORRAR
    void delete(Empleado empleado);
}
