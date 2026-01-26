package com.juego.presentacion;
import com.juego.habilidades.habilidad;
import com.juego.modelo.personaje;
import java.util.Scanner;

public class vistaConsola implements Vista {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarEstado(personaje p1, personaje p2) {
        System.out.println(p1.mostrarDatos());
        System.out.println(p2.mostrarDatos());
    }

    @Override
    public habilidad elegirHabilidad(personaje p) {
        System.out.println("\nTurno de: " + p.getNombre());
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

    @Override
    public void anunciarGanador(personaje ganador) {
        System.out.println("\n=================================");
        System.out.println("¡EL COMBATE HA TERMINADO!");
        System.out.println("=================================");
        if (ganador != null) {
            System.out.println("¡El ganador es " + ganador.getNombre() + "!");
        } else {
            System.out.println("¡Ha sido un empate!");
        }
    }
}
