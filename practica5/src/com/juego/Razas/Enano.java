package com.juego.Razas;

public class Enano implements Raza {

    @Override
    public String getNombre() {
        return "Enano";
    }

    @Override
    public int getFuerza() {
        return 0;
    }

    @Override
    public int getInteligencia() {
        return 0;
    }

    @Override
    public int getDestreza() {
        return 0;
    }

    @Override
    public int getVidaBase() {
        return 0;
    }

    @Override
    public String getEspecialidad() {
        return "";
    }
}