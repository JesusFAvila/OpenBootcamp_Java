package Tema6.EjercicioTema5;

public class Main {
    static CocheCRUD cocheCrud;

    public static void main(String[] args) {

        cocheCrud.findAll();
        cocheCrud.save(new CocheCrudImpl("Mercedes", "Benz"));
        cocheCrud.delete(cocheCrud);

        System.out.println(CocheCrudImpl.marca);

    }
}
