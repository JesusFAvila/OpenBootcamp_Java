package Tema7;

public class ExtractClass {
    //Cuando tenemos demasiados atributos de una misma clase.
    //Lo correcto es dividir los atributos en diferentes clases: Class system, class addres, class person.
    public static void main(String[] args) {
        Person person = new Person("Jesus","Fernández",75577777,"Hombre",false,false,"Gorki");
        System.out.println(person.nombrePerro);
    }




}
