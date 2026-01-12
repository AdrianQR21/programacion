package com.juego.Clases;

public class Guerrero implements Clase{
    @Override
    public int getBonifiacionFuerza() {
        return 3;
    }

    @Override
    public int getBonificacionInteligencia() {
        return 0;
    }

    @Override
    public int getBonificacionDestreza() {
        return 0;
    }

    @Override
    public int getVidaMax() {
        return 120;
    }
}
