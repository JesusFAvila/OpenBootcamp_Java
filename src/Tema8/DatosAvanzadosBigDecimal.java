package Tema8;

import java.math.BigDecimal;

public class DatosAvanzadosBigDecimal {
    public static void main(String[] args) {
        //PARA DATOS FINANCIEROS / CÁLCULOS DE DECIMALES CON ALTA PRECISIÓN NO UTILIZAR FLOAT / DOUBLE
        //Utilizaremos la clase BigDecimal

        //Método BigDecimal multiply()
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4f);
        BigDecimal resultadoMulti = valorA.multiply(valorB);
        System.out.println
                ("Resultado de la multiplicación: " + resultadoMulti);

        //Método BigDecimal suma add()
        BigDecimal resultadoSuma = valorA.add(valorB);
        System.out.println
                ("Resultado de la suma: " + resultadoSuma);



    }
}
