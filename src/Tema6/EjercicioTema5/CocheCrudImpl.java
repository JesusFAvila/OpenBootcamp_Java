package Tema6.EjercicioTema5;

public class CocheCrudImpl implements CocheCRUD {

    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "Guardando";
    String findAll = "Buscando";
    String delete= "Eliminando";

    @Override
    public String toString() {
        return "CocheCrudImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
