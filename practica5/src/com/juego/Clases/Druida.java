package com.juego.Clases;

public class Druida implements Clase{
    @Override
    public int getBonifiacionFuerza() {
        return 2;
    }

    @Override
    public int getBonificacionInteligencia() {
        return 1;
    }

    @Override
    public int getBonificacionDestreza() {
        return 0;
    }

    @Override
    public int getVidaMax() {
        return 100;
    }
}
