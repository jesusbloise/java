package org.codigomorsa;

import static org.codigomorsa.Utils.println;

public class Numeros {

    public static void main(String[] args) {
        println(2);
        println(2+2);
        println("2+2");
        println("2"+"2");
        println(3*2);
        println(10 - 5);
        println(10 / 5);
        println(10 / 3);
        println(10 / 200);
        println(20.5 + 2.1);
        println(20.5 + 10);
        println(10 / 3.0);

        int numero = 3;
        double conDecimales = 10.5;
        float esOtroDecimal = 10.5f;

        double resultado = numero + conDecimales;

        println(resultado);
        println("Resultado");
        println("El resultado es: " + resultado);

        String resultadoContexto = "El resultado es: " + resultado;
        println(resultadoContexto);
    }
}
