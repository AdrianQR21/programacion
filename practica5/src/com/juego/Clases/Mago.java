package com.juego.Clases;

public class Mago implements Clase{
    @Override
    public int getBonifiacionFuerza() {
        return 0;
    }

    @Override
    public int getBonificacionInteligencia() {
        return 3;
    }

    @Override
    public int getBonificacionDestreza() {
        return 0;
    }

    @Override
    public int getVidaMax() {
        return 90;
    }
}
