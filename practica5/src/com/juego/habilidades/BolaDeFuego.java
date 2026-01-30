package com.juego.habilidades;

import com.juego.modelo.personaje;

public class BolaDeFuego implements habilidad {
    private int usos = 3; // Esta habilidad tendrá 3 usos

    @Override
    public String getNombre() {
        return "Bola de Fuego";
    }

    @Override
    public int getUsos() {
        return usos;
    }

    @Override
    public void usar(personaje origen, personaje objetivo) {
        if (usos > 0) {
            // El daño escala con la Inteligencia del lanzador
            int daño = origen.getInteligencia() * 10;
            System.out.println("¡La Bola de Fuego impacta causando " + daño + " puntos de daño!");
            objetivo.recibirDaño(daño);
            usos--; // Se gasta un uso
        }
    }
}

