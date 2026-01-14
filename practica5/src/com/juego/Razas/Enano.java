package com.juego.Razas;

public class Enano implements Raza {

    @Override
    public String getNombre() {
        return "Enano";
    }

    @Override
    public int getFuerza() {
        return 7;
    }

    @Override
    public int getInteligencia() {
        return 4;
    }

    @Override
    public int getDestreza() {
        return 4;
    }

    @Override
    public int getVidaBase() {
        return 110;
    }

    @Override
    public String getEspecialidad() {
        return "Resistencia: Ideal para Guerreros y Paladines.";
    }
}