import java.util.ArrayList;
import java.util.Scanner;

//Ejercicio 14
//Crea un programa que:
//Cree una lista de Strings (ArrayList<String>).
//Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
//Luego pida un nombre a buscar y diga si está en la lista o no, mostrando también en
//qué posición se encuentra si existe.

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        // Definimos dónde vamos a guardar los nombres y la entrada de datos
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String entrada;

        // Vamos dando nombres hasta que no sea igual a "fin"
        do {
            System.out.println("Introduce un nombre (fin = salir)");
            entrada = sc.nextLine();

            // Si no es igual a "fin", entonces añadirá el nombre a la lista
            if (!entrada.equals("fin")) {
                lista.add(entrada);
            }
        } while (!entrada.equals("fin"));

        // Pedimos el nombre a buscar
        System.out.println("Dime un nombre a buscar: ");
        String entradaNom = sc.nextLine();

        // Buscamos manualmente sin usar el contains
        int posicion = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(entradaNom)) {
                posicion = i;
                break;
            }
        }

        // /Imprimimos por pantalla el nombre que vamos a buscar
        if (posicion != -1) {
            System.out.printf("El nombre existe y se encuentra en la posición %d", posicion);
        } else {
            System.out.printf("El nombre %s no existe", entradaNom);
        }


    }
}