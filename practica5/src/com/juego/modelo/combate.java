package com.juego.modelo;

import com.juego.habilidades.habilidad;
import java.util.Scanner;

public class combate {
    private personaje p1;
    private personaje p2;
    private Scanner scanner;

    public combate(personaje p1, personaje p2) { //Constructor
        this.p1 = p1;
        this.p2 = p2;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int turno = 1;
        personaje atacante, defensor;

        // El bucle no acaba hasta que la vida de un jugador sea 0
        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\n---------------------------------");
            System.out.println(" Turno: " + turno);
            System.out.println("---------------------------------");

            // Determinar atacante y defensor según el turno
            if (turno % 2 != 0) {
                atacante = p1;
                defensor = p2;
            } else {
                atacante = p2;
                defensor = p1;
            }

            // Mostrar estado de los personajes
            System.out.println(p1.mostrarDatos());
            System.out.println(p2.mostrarDatos());
            System.out.println("\nTurno de: " + atacante.getNombre());

            // El jugador elige una habilidad
            habilidad habilidadElegida = elegirHabilidad(atacante);

            // Usar la habilidad
            if (habilidadElegida.getUsos() > 0) {
                // Lógica simple de objetivo: si cura, es a sí mismo, si no, al oponente.
                personaje objetivo = (habilidadElegida.getNombre().toLowerCase().contains("curar")) ? atacante : defensor;
                System.out.println(atacante.getNombre() + " usa '" + habilidadElegida.getNombre() + "' sobre " + objetivo.getNombre() + ".");
                habilidadElegida.usar(atacante, objetivo);
            } else {
                System.out.println("¡No quedan usos para '" + habilidadElegida.getNombre() + "'! Pierdes el turno.");
            }

            turno++;
        }

        // Determinar y anunciar al ganador
        System.out.println("\n=================================");
        System.out.println("¡EL COMBATE HA TERMINADO!");
        System.out.println("=================================");
        if (p1.estaVivo()) {
            System.out.println("¡El ganador es " + p1.getNombre() + "!");
        } else if (p2.estaVivo()) {
            System.out.println("¡El ganador es " + p2.getNombre() + "!");
        } else {
            System.out.println("¡Ha sido un empate!");
        }
        System.out.println(p1.mostrarDatos());
        System.out.println(p2.mostrarDatos());
    }

    private habilidad elegirHabilidad(personaje p) {
        System.out.println("Elige una habilidad:");
        for (int i = 0; i < p.getHabilidades().size(); i++) {
            habilidad h = p.getHabilidades().get(i);
            System.out.println((i + 1) + ". " + h.getNombre() + " (Usos: " + h.getUsos() + ")");
        }

        int eleccion = -1;
        while (eleccion < 1 || eleccion > p.getHabilidades().size()) {
            System.out.print("Introduce el número de la habilidad: ");
            try {
                eleccion = Integer.parseInt(scanner.nextLine());
                if (eleccion < 1 || eleccion > p.getHabilidades().size()) {
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número.");
            }
        }
        return p.getHabilidades().get(eleccion - 1);
    }
}


