package com.juego.modelo;

import com.juego.clases.clase;
import com.juego.habilidades.habilidad;
import com.juego.razas.Raza;
import java.util.ArrayList;
import java.util.List;

public class personaje {
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vida;
    private int vidaMaxima; // Añadimos un campo para la vida máxima
    private ArrayList<habilidad> habilidades;

    public personaje(String nombre, Raza raza, clase clase, List<habilidad> habilidades) {
        this.nombre = nombre;
        this.fuerza = raza.getFuerza() + clase.getBonifFuerza();
        this.inteligencia = raza.getInteligencia() + clase.getBonifInteligencia();
        this.destreza = raza.getDestreza() + clase.getBonifDestreza();

        // Calculamos la vida máxima y la guardamos
        this.vidaMaxima = clase.getVidaMaxima() + raza.getVidaBase();
        // La vida actual empieza siendo la máxima
        this.vida = this.vidaMaxima;

        this.habilidades = new ArrayList<>(habilidades);
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void curar(int cantidad) {
        this.vida += cantidad;
        // Un personaje no puede tener más vida que su máximo
        if (this.vida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        }
    }

    public String mostrarDatos() {
        // Mostramos la vida actual y la máxima para más claridad
        return nombre + " | Puntos de salud: " + vida + "/" + vidaMaxima;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    // --- GETTERS
    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getDestreza() { return destreza; }


    // Ahora devuelve la variable vida actual, no la recalcula.
    public int getVida() { return this.vida; }

    public int getVidaMaxima() { return this.vidaMaxima; }

    public ArrayList<habilidad> getHabilidades() {
        return habilidades;
    }
}


