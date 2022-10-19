package Tema7;
public class ConsolidateDuplicate {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incident;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if (isElegibleExtraSalary()){
            result = 500;
        }else{
            result = 0;
        }
        sendMessage();
        return result;
    }

    private void sendMessage(){
        System.out.println("Enviando mensaje...");
    }

    private boolean isElegibleExtraSalary() {
    }



}
