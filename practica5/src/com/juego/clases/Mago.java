package com.juego.clases;

import com.juego.habilidades.distancia;
import com.juego.habilidades.habilidad;
import java.util.ArrayList;
import java.util.Arrays;

public class Mago implements clase{
    // ... (atributos y constructor sin cambios)
    private String nombre;
    private int bonifFuerza;
    private int bonifInteligencia;
    private int bonifDestreza;
    private int vidaMaxima;

    public Mago() {
        this.nombre = "Mago";
        this.bonifFuerza = 0;
        this.bonifInteligencia = 3;
        this.bonifDestreza = 0;
        this.vidaMaxima = 90;
    }

    @Override
    public String getNombre() { return nombre;}
    @Override
    public int getBonifFuerza() { return bonifFuerza;}
    @Override
    public int getBonifInteligencia() { return bonifInteligencia;}
    @Override
    public int getBonifDestreza() { return bonifDestreza;}
    @Override
    public int getVidaMaxima() { return vidaMaxima;}

    @Override
    public ArrayList<habilidad> getHabilidades() {

        return new ArrayList<>(Arrays.asList(new distancia()));
    }
}
