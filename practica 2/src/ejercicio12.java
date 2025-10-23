import java.util.Scanner;

//En España cada persona está identificada con un Documento Nacional de Identidad (DNI)
// en el que figura un número y una letra,
// por ejemplo 56999545W.
// Realiza un programa donde le pidas al usuario
// SOLO el número del dni y el programa te devuelva la letra.
// Para calcular la letra solo tienes que dividir el número del DNI entre 23,
// el resto de esta división se corresponde con la posición de la letra en el abecedario.
// Utiliza un array para guardar CADA letra del abecedario.

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array de letras distinto (inventado para el ejercicio)
        String[] letras = {
                "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
                "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"
        };

        // Pedir el número del DNI
        System.out.print("Introduce tu número de DNI (sin letra): ");
        int numeroDni = sc.nextInt();

        // Calcular la posición correspondiente
        int posicion = numeroDni % 23;

        // Obtener la letra correspondiente del nuevo array
        String letraDni = letras[posicion];

        // Imprimimos el resultado en pantalla
        System.out.printf("tu letra de Dni es la %s",letraDni);

    }
}