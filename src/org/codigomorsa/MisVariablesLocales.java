package org.codigomorsa;

import static org.codigomorsa.Utils.print;
import static org.codigomorsa.Utils.println;

public class MisVariablesLocales {
    public static void main(String[] args) {


        int numero = 123;

        String direcion = "Alameda 12345";

        llamarNumero(numero);

        enviarCarta(direcion);

        println("Direccion en main: " + direcion);
    }
    public static void enviarCarta(String direccion) {
        println("Enviando carta a ala direccion " + direccion);
        direccion = "Washington 1234";
        println("Nueva direccion: " + direccion);
    }
    public  static void llamarNumero(int whatsapp) {
        println("Llamar al numero " + whatsapp);
    }
}
