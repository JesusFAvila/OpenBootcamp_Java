package Tema7;

public class ConsolidateConditional {
    //ConsolidateConditional:

    private double extraSalary;
    private int seniority;
    private int education;
    private int incident;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if(esCandidatoValido()){
            return result;
        }

        //calculamos salario extra



        return result;
    }

    public boolean esCandidatoValido(){
        //agrupamos condiciones con and y or
        boolean estudios = seniority < 1 || education < 1;
        boolean antiguedad = incident > 10 && !certification;
        return estudios || antiguedad;


    }

}
