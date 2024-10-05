package org.codigomorsa;

import static org.codigomorsa.Utils.*;

public class Booleanos {

    public static void main(String[] args) {
        int pan1 = inputInt("Ingresa precio pan 1: ");
        int pan2 = inputInt("Ingresa precio pan 2: ");

        boolean esPan1MasCaroQuePan2 = pan1 > pan2;

        if (esPan1MasCaroQuePan2) {
            println("Efectivamente el pan 1 es mas cara que pan 2");
            println("adios. ");
        } else {
            println("El pan 2 es mas caro que el pan 1.");
        }

        String nombre1 = input("Ingresa un nombre: ");
        String nombre2 = input("Ingresa otro nombre: ");

        boolean numerosComparacion = 1 == 1;//con numeros si se utiliza == para comparar
        boolean esNombre1IgualANombre2 = nombre1.equals(nombre2);//para comparar string en java e utiliza .equals

        if (esNombre1IgualANombre2) {
            println("El nombre 1 es igual al nombre 2");
        } else {
            println("El nombre 1 NO es igual al nombre 2");

        }
    }
}



