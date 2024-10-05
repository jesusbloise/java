package org.codigomorsa;

import static org.codigomorsa.Utils.*;

public class Programa2 {

    public static void main(String[] args) {

        int edad = inputInt("Cual es tu edad? ");
        int limiteEdad = 18;
        int senior = 65;
        int ultraAnciano = 100;

        if ( edad < limiteEdad) {
            println("No tienes la edad suficiente aun. ");
        } else if (edad >= limiteEdad && edad < senior) {
            println("Puedes pasar a la disco.");
        } else if(edad < ultraAnciano){
            println("Te felicito por tener tanta energia. ");
        }else {
            println("Eres de verdad??");
        }
    }
}
