package cruz.alejandro.cruzalejandropiedrapapeltijera;

import java.util.Scanner;
import java.util.Random;

/*
- Permir 3 jugadas 
- Que tenga un tablero con los puntos de los jugadores, que se muestre al final del juego indicando el ganador.
 */
public class PiedraPapelTijera1906 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp1 = "";
        String resp2 = "";
        int numerorandom;
        String jugador1 = "";
        String jugador2 = "R2D2";
        Random RD = new Random();
        numerorandom = RD.nextInt(3) + 1;
        int contador = 0;
        String jugador[] = new String[3];
        int puntajeJugador[] = new int[3];
        int puntaje = 0;

        System.out.println("PIEDRA ,  PAPEL o TIJERA\n");
        // Pedir a los jugadores su nombre

        do {

            System.out.print("Ingrese el nombre del Jugador. Intento numero: " + (contador + 1) + " maximo 3 intentos\n");
            jugador1 = leer.next();
            jugador[contador] = jugador1;

            // Dar inicio al juego
            System.out.println("Inicior del Juego\n");
            System.out.println("La P es Piedra");
            System.out.println("La L es Pepel");
            System.out.println("La T es Tijera");

            // pedir a los jugadrores que ingrese una opcion
            System.out.println("\nINTRODUCE OPCION P/L/T\n" + jugador1 + ":");
            resp1 = leer.next();

            switch (numerorandom) {
                case 1:
                    resp2 = "P";
                    break;
                case 2:
                    resp2 = "T";
                    break;
                case 3:
                    resp2 = "L";
                    break;
            }

            System.out.println("\nLa OPCION DE R2D2 FUE:" + resp2);
            //Comparar el dato ingresado

            if (resp1.equals("P") && resp2.equals("P")) {
                System.out.println("\nEMPATE\n");
                puntaje = 1;
            }
            if (resp1.equals("P") && resp2.equals("L")) {
                System.out.println("\nGANADOR\n" + jugador2 + "\n");

            }
            if (resp1.equals("P") && resp2.equals("T")) {
                System.out.println("\nGANADOR\n" + jugador1 + "\n");
                puntaje = 3;
            }

            if (resp1.equals("L") && resp2.equals("L")) {
                System.out.println("\nEMPATE\n");
                puntaje = 1;
            }
            if (resp1.equals("L") && resp2.equals("P")) {
                System.out.println("\nGANADOR\n" + jugador1 + "\n");
                puntaje = 3;
            }
            if (resp1.equals("L") && resp2.equals("T")) {
                System.out.println("\nGANADOR\n" + jugador2 + "\n");
            }

            if (resp1.equals("T") && resp2.equals("T")) {
                System.out.println("\nEMPATE\n");
                puntaje = 1;
            }
            if (resp1.equals("T") && resp2.equals("P")) {
                System.out.println("\nGANADOR\n" + jugador2 + "\n");
            }
            if (resp1.equals("T") && resp2.equals("L")) {
                System.out.println("\nGANADOR\n" + jugador1 + "\n");
                puntaje = 3;
            }

            puntajeJugador[contador] = puntaje;
            contador++;

        } while (contador < 3);

        //Tabla con puntajes
        System.out.println("==== Tabla de Puntajes ====");
        for (int i = 0; i < jugador.length; i++) {

            System.out.println("Jugador: " + jugador[i] + " Puntaje: " + puntajeJugador[i]);

        }

        System.out.println("GRACIAS POR PARTICIAR");

    }

}
