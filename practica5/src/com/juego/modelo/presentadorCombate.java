package com.juego.modelo;

import com.juego.clases.*; // Importamos todas las clases
import com.juego.razas.Elfo;
import com.juego.razas.Enano;
import com.juego.razas.Humano;
import com.juego.razas.Raza;

import java.util.Scanner;

public class presentadorCombate {
    private Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Jugar");
        System.out.println("2. Crear personaje");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        return leerOpcionNumerica();
    }

    public personaje crearPersonaje() {
        System.out.println("\n--- Creación de Personaje ---");

        System.out.print("Introduce el nombre del personaje: ");
        String nombre = sc.nextLine();
        if (nombre.trim().isEmpty()) {
            nombre = "Héroe Anónimo";
        }

        // Elegir la Raza
        System.out.println("Elige una raza:");
        System.out.println("1. Enano");
        System.out.println("2. Elfo");
        System.out.println("3. Humano");
        System.out.print("Opción: ");
        int opcionRaza = leerOpcionNumerica();
        Raza razaSeleccionada;
        switch (opcionRaza) {
            case 1:
                razaSeleccionada = new Enano();
                break;
            case 2:
                razaSeleccionada = new Elfo();
                break;
            case 3:
            default:
                razaSeleccionada = new Humano();
                break;
        }
        System.out.println("Has elegido: " + razaSeleccionada.getNombre());

        // Elegir la Clase
        System.out.println("\nElige una clase:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Pícaro");
        System.out.println("4. Sacerdote");
        System.out.println("5. Paladín");
        System.out.println("6. Monje");
        System.out.println("7. Druida");
        System.out.println("8. Bardo");
        System.out.print("Opción: ");
        int opcionClase = leerOpcionNumerica();
        clase claseSeleccionada;
        switch (opcionClase) {
            case 1:
                claseSeleccionada = new Guerrero();
                break;
            case 2:
                claseSeleccionada = new Mago();
                break;
            case 3: claseSeleccionada = new Pícaro(); break; // Usamos la clase renombrada
            case 4: claseSeleccionada = new Sacerdote(); break;
            case 5: claseSeleccionada = new Paladin(); break;
            case 6: claseSeleccionada = new Monje(); break;
            case 7: claseSeleccionada = new Druida(); break;
            case 8: default: claseSeleccionada = new Bardo(); break;
        }
        System.out.println("Has elegido: " + claseSeleccionada.getNombre());

        personaje nuevoPersonaje = new personaje(
                nombre,
                razaSeleccionada,
                claseSeleccionada,
                claseSeleccionada.getHabilidades()
        );

        System.out.println("\n¡Personaje '" + nuevoPersonaje.getNombre() + "' creado con éxito!");
        return nuevoPersonaje;
    }

    private int leerOpcionNumerica() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
