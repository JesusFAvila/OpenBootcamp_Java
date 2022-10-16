package Tema4_;

public class EjercicioTema3 {
    public static void main(String[] args) {
    //Concatenar textos en array mediante bucle
        String[] nombres = {"Jesús","Clara","Victoria","Bárbara","Raúl","Juan","Gorki","Cora","Ana","Laura","Luisa","César","Lucio","Juan Luis","Marisol","Víctor","Patxi","Gorka"};
        String[] apellidos = {"Fernández","Ávila","Rodríguez","Vílchez","Espinosa","Carpintero","Molina","Hidalgo","López","Megias","Rodriguez","Úbeda"};
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = nombres[i] + " " + apellidos[i];
            System.out.println(nombres[i]);
        }
    }
}
