package com.juego.clases;
import com.juego.habilidades.cuerpo_a_cuerpo;
import com.juego.habilidades.habilidad;
import java.util.ArrayList;
import java.util.Arrays;

public class Bardo implements clase {
    private String nombre = "Bardo";
    private int bonifFuerza = 0;
    private int bonifInteligencia = 3;
    private int bonifDestreza = 0;
    private int vidaMaxima = 90;

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

