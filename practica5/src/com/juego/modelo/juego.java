package com.juego.modelo;

import com.juego.clases.Guerrero;
import com.juego.clases.Mago;
import com.juego.presentacion.vistaConsola; // Importamos la vista concreta
import com.juego.razas.Elfo;
import com.juego.razas.Enano;

import java.util.Scanner;

public class juego {

    private personaje p1;
    private personaje p2;
    private presentadorCombate presentador;
    private Scanner scanner;
    private vistaConsola vista; // Añadimos la vista

    public juego() {
        this.presentador = new presentadorCombate();
        this.scanner = new Scanner(System.in);
        this.vista = new vistaConsola(); // Creamos la vista
        crearPersonajesPorDefecto();
    }

    public void iniciar() {
        vista.mostrarMensaje("¡Bienvenido al juego de combate por turnos!");
        vista.mostrarMensaje("\nPersonajes por defecto listos:");
        vista.mostrarMensaje("P1: " + p1.getNombre());
        vista.mostrarMensaje("P2: " + p2.getNombre());

        int opcion;
        do {
            opcion = presentador.menuPrincipal();
            gestionarOpcionMenu(opcion);
        } while (opcion != 3);

        scanner.close();
        vista.mostrarMensaje("\n¡Gracias por jugar! Saliendo del programa...");
    }

    private void crearPersonajesPorDefecto() {
        Guerrero claseGuerrero = new Guerrero();
        this.p1 = new personaje("Josemi, el Guerrero", new Enano(), claseGuerrero, claseGuerrero.getHabilidades());

        Mago claseMago = new Mago();
        this.p2 = new personaje("Adrian, el Mago", new Elfo(), claseMago, claseMago.getHabilidades());
    }

    private void gestionarOpcionMenu(int opcion) {
        switch (opcion) {
            case 1:
                iniciarCombate();
                break;
            case 2:
                gestionarCreacionPersonaje();
                break;
            case 3:
                break;
            default:
                vista.mostrarMensaje("\nOpción no válida. Por favor, elige una opción del menú.");
                break;
        }
    }

    private void iniciarCombate() {
        vista.mostrarMensaje("\nIniciando combate entre " + p1.getNombre() + " y " + p2.getNombre());
        // Pasamos la vista al combate
        Combate nuevoCombate = new Combate(p1, p2, vista);
        nuevoCombate.iniciar();
    }

    private void gestionarCreacionPersonaje() {
        vista.mostrarMensaje("¿Qué personaje quieres crear/reemplazar? (1 o 2): ");
        int slot = -1;
        try {
            slot = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // No hace nada
        }

        if (slot == 1) {
            this.p1 = presentador.crearPersonaje();
            vista.mostrarMensaje("Personaje 1 actualizado.");
        } else if (slot == 2) {
            this.p2 = presentador.crearPersonaje();
            vista.mostrarMensaje("Personaje 2 actualizado.");
        } else {
            vista.mostrarMensaje("Opción no válida. Volviendo al menú.");
        }
    }
}
