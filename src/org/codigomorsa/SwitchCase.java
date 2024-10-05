package org.codigomorsa;

import static org.codigomorsa.Utils.*;

public class SwitchCase {

    public static void main(String[] args) {

        String elDiaDeHoy = input("Que dia es hoy? ");

        switch (elDiaDeHoy) {
            case "Lunes": {
                println("Hoy toca lavar ropa. ");
                break;
            }
            case "Martes": {
                    println("Hoy toca ver serie. ");
                    break;
            }
            case "Miercoles": {
                println("Hoy toca subir video al canal / escribir blog en medio. ");
            }
            case "Jueves": {
                println("Hoy toca ir al cine ");
                break;
            }
            case "Viernes": {
                println("Hoy se sale. ");
                break;
            }
            case "Sabado": {
                println("Hoy toca modear en micrasf. ");
                break;
            }
            case "Domingo": {
                println("Hoy toca ir a misa. ");
                break;
            }
            default:{
                println("No escribiste un dia de la semana. ");
            }
        }

        int numero = inputInt("Escribe un digito entre el 0 y el 9 ");

        switch (numero) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:{
                println("Es un numero par");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:{
                println("Es un numero inpar");
                break;
            }
            default: {
                println("Recuerda que solo se acepta un numero entre 0 y 9");
            }
        }
    }
}
