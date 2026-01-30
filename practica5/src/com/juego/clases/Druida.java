package com.juego.clases;
import com.juego.habilidades.cuerpo_a_cuerpo;
import com.juego.habilidades.habilidad;
import java.util.ArrayList;
import java.util.Arrays;

public class Druida implements clase {
    private String nombre = "Druida";
    private int bonifFuerza = 2;
    private int bonifInteligencia = 1;
    private int bonifDestreza = 0;
    private int vidaMaxima = 100;

    public String getNombre() { return nombre; }
    public int getBonifFuerza() { return bonifFuerza; }
    public int getBonifInteligencia() { return bonifInteligencia; }
    public int getBonifDestreza() { return bonifDestreza; }
    public int getVidaMaxima() { return vidaMaxima; }

    @Override
    public ArrayList<habilidad> getHabilidades() {
        return new ArrayList<>(Arrays.asList(new cuerpo_a_cuerpo()));
    }
}

