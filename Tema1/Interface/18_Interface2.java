package com.CursoJava.Interfaces;

import com.CursoJava.Coche;
import com.CursoJava.CocheElectrico;
import com.CursoJava.Interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche Deportivo");
        return new CocheElectrico();
    }

    @Override
    public Coche DestruirCocheDemo(Coche coche) {
        System.out.println("COCHE DEPORTIVO DESTRUIDO");
    }
}
