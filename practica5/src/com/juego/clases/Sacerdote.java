package com.juego.clases;

import com.juego.habilidades.curar;
import com.juego.habilidades.habilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Sacerdote implements clase {
    private String nombre = "Sacerdote";
    private int bonifFuerza = 0;
    private int bonifInteligencia = 3;
    private int bonifDestreza = 0;
    private int vidaMaxima = 95;

    public String getNombre() {
        return nombre;
    }

    public int getBonifFuerza() {
        return bonifFuerza;
    }

    public int getBonifInteligencia() {
        return bonifInteligencia;
    }

    public int getBonifDestreza() {
        return bonifDestreza;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    @Override
    public ArrayList<habilidad> getHabilidades() {
        // Un Sacerdote debe poder curar
        return new ArrayList<>(Arrays.asList(new curar()));
    }
}
