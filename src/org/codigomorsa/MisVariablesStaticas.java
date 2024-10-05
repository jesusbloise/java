package org.codigomorsa;

import static org.codigomorsa.Utils.println;

public class MisVariablesStaticas {

    public static String nombre = "Martin";

    public static void main(String[] args) {


        saludarEnCastellano();
        saludarEnIngles();

    }
    public static void  saludarEnCastellano() {
        println("Feliz cumpleaños " + nombre);
    }
    public static void  saludarEnIngles() {
        println("Happy birthday " + nombre);
    }
}
