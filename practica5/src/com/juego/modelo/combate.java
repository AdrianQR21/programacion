package com.juego.modelo;

import com.juego.habilidades.habilidad;
import com.juego.presentacion.Vista;

public class Combate {
    private personaje p1;
    private personaje p2;
    private Vista vista; // Usamos la interfaz Vista

    // El constructor ahora recibe una Vista
    public Combate(personaje p1, personaje p2, Vista vista) {
        this.p1 = p1;
        this.p2 = p2;
        this.vista = vista;
    }

    public void iniciar() {
        int turno = 1;
        personaje atacante, defensor;

        // El bucle no acaba hasta que la vida de un jugador sea 0
        while (p1.estaVivo() && p2.estaVivo()) {
            vista.mostrarMensaje("\n---------------------------------");
            vista.mostrarMensaje(" Turno: " + turno);
            vista.mostrarMensaje("---------------------------------");

            // Determinar atacante y defensor según el turno
            if (turno % 2 != 0) {
                atacante = p1;
                defensor = p2;
            } else {
                atacante = p2;
                defensor = p1;
            }

            // Mostrar estado de los personajes a través de la vista
            vista.mostrarEstado(p1, p2);

            // El jugador elige una habilidad a través de la vista
            habilidad habilidadElegida = vista.elegirHabilidad(atacante);

            // Usar la habilidad
            if (habilidadElegida.getUsos() > 0) {
                // Si cura, es a sí mismo, si no, al oponente.
                personaje objetivo = (habilidadElegida.getNombre().toLowerCase().contains("curar")) ? atacante : defensor;
                vista.mostrarMensaje(atacante.getNombre() + " usa '" + habilidadElegida.getNombre() + "' sobre " + objetivo.getNombre() + ".");
                habilidadElegida.usar(atacante, objetivo);
            } else {
                vista.mostrarMensaje("¡No quedan usos para '" + habilidadElegida.getNombre() + "'! Pierdes el turno.");
            }

            turno++;
        }

        // Determinar y anunciar al ganador a través de la vista
        personaje ganador = null;
        if (p1.estaVivo()) {
            ganador = p1;
        } else if (p2.estaVivo()) {
            ganador = p2;
        }

        vista.anunciarGanador(ganador);
        vista.mostrarEstado(p1, p2); // Muestra el estado final
    }
}
