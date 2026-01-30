package com.juego.modelo;
import java.util.ArrayList;


public class gestorPersonajes {
    private ArrayList<com.juego.modelo.personaje> personaje = new ArrayList<>();
    public ArrayList<com.juego.modelo.personaje> getPersonajes() { return personaje;}

    public void agregarPersonaje(com.juego.modelo.personaje p) {
        personaje.add(p);
    }
}
