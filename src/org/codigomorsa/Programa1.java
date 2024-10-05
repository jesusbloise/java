package org.codigomorsa;


import static org.codigomorsa.Utils.*;

public class Programa1 {

    public static void main(String[] args) {
        String nombreUsuario = input("Hola Ingresa tu nombre: ");
        int edad = inputInt("Ahora ingresa tu edad: ");

        println("Hola " + nombreUsuario + "! Tu edad es " + edad);
    }
}
