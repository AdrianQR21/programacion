package com.juego.presentacion;
import com.juego.habilidades.habilidad;
import com.juego.modelo.personaje;

public interface Vista {
    void mostrarMensaje(String mensaje);
    void mostrarEstado(personaje p1, personaje p2);
    habilidad elegirHabilidad(personaje p);
    void anunciarGanador(personaje ganador);
}