package com.juego.Habilidades;

import com.juego.Modelo.Personaje;

public interface HabilidadBase {
    //Para restar el uso de las habilidades
    boolean usar();
    int escaladoPoder(Personaje pj);
    void infoHabilidad();
    void nombreHabilidad();

}