package org.codigomorsa;

import static org.codigomorsa.Utils.input;
import static org.codigomorsa.Utils.println;

public class EjVoid {

    public static void main(String[] args) {
        //saludar(input("Ingresa tu nombre: "), input("Ingresa tu apellido: "));

        String nombre = "Morsa";
        int edad = 33;
        boolean tengoHijo = false;

        pronosticoDelDia();

        String pais = "Alemania";
        String origen = "Chile";

        pronosticoDelDia();
    }

    public static void saludar(String nombre, String apellido) {
        println("Hola "+ nombre + " " + apellido + "! Bienvend@ a nuestro tutoriala de Java!!!");
    }

    public  static  void  pronosticoDelDia() {
        println("Buscando informacion en el servidor...");
        println("La temperatura de hoy es de 24 grados.");
        println("Guardando la temperatura en la base de datos local.");

        saludar( "Carla", "bruni");
    }
}
