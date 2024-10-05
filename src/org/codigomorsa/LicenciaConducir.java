package org.codigomorsa;

import static org.codigomorsa.Funciones.esMayorDeEdad;
import static org.codigomorsa.Utils.inputInt;
import static org.codigomorsa.Utils.println;

public class LicenciaConducir {

    public static void main(String[] args) {

        int edad = inputInt("Enter your age: ");

        if (esMayorDeEdad(edad)) {
            println("driving is allowed");
        }else {
            println("driving is not allowed");
        }
    }
}
