package org.codigomorsa;

import static org.codigomorsa.Utils.println;

public class OperadoresBooleanos {

    public static void main(String[] args) {

        boolean estaSoleado = true;
        int temperaturaHoy = 22;
        boolean esMayorA25LaTemp = temperaturaHoy >= 25;
        //& significa AND, && es el operador logico AND
        boolean puedoIrALaPlaya = estaSoleado && esMayorA25LaTemp;
        println("Puedo ir a la playa? " + puedoIrALaPlaya);

        //operador OR, ||
        boolean estaAbiertaPanaderiaCarlitos = false;
        boolean estaAbiertaPanederiaMaria = false;
        boolean hayAlgunaPanaderiaAbierta = estaAbiertaPanaderiaCarlitos || estaAbiertaPanederiaMaria;
        println("Hay alguna panaderia abierta? " + hayAlgunaPanaderiaAbierta);

        //NOT operador ! transforma de flase a true o de true a false
        println((!false) + "");
        println("Estan todas las panaderias cerradas? " + !hayAlgunaPanaderiaAbierta);
    }
}
