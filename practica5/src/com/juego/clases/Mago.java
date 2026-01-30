package com.juego.clases;

import com.juego.habilidades.BolaDeFuego; // <-- 1. IMPORTAMOS LA NUEVA HABILIDAD
import com.juego.habilidades.distancia;
import com.juego.habilidades.habilidad;
import java.util.ArrayList;
import java.util.Arrays;

public class Mago implements clase {
    private String nombre = "Mago";
    private int bonifFuerza = 0;
    private int bonifInteligencia = 3;
    private int bonifDestreza = 0;
    private int vidaMaxima = 90;

    @Override
    public String getNombre() { return nombre; }
    @Override
    public int getBonifFuerza() { return bonifFuerza; }
    @Override
    public int getBonifInteligencia() { return bonifInteligencia; }
    @Override
    public int getBonifDestreza() { return bonifDestreza; }
    @Override
    public int getVidaMaxima() { return vidaMaxima; }

    @Override
    public ArrayList<habilidad> getHabilidades() {
        // 2. AÑADIMOS LA NUEVA HABILIDAD A LA LISTA DEL MAGO
        return new ArrayList<>(Arrays.asList(
                new distancia(),
                new BolaDeFuego()
        ));
    }
}

