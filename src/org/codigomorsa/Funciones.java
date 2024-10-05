package org.codigomorsa;

import static org.codigomorsa.Utils.inputInt;
import static org.codigomorsa.Utils.println;

public class Funciones {

    public static void main(String[] args) {

        int edad = inputInt("Que edad tienes? ");

        if (esMayorDeEdad(edad)) {
            println("Si eres mayor de edad.");
        }else {
            println("Aun no eres mayor de edad");
        }
    }

    public static boolean esMayorDeEdad(int edadPersona) {
       // boolean esMayorA18 = edadPersona >= 18; asi es normal
        return  edadPersona >= 21; //mas optimisada
    }
}
