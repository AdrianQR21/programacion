package com.juego.clases;
import com.juego.habilidades.cuerpo_a_cuerpo;
import com.juego.habilidades.habilidad;
import java.util.ArrayList;
import java.util.Arrays;

public class Monje implements clase {
    private String nombre = "Monje";
    private int bonifFuerza = 2;
    private int bonifInteligencia = 0;
    private int bonifDestreza = 1;
    private int vidaMaxima = 110;

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

