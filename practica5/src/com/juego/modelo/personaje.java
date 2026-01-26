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
    private ArrayList<habilidad> habilidades;

    public personaje(String nombre, Raza raza, clase clase, List<habilidad> habilidades) {
        this.nombre = nombre;
        this.fuerza = raza.getFuerza() + clase.getBonifFuerza();
        this.inteligencia = raza.getInteligencia() + clase.getBonifInteligencia();
        this.destreza = raza.getDestreza() + clase.getBonifDestreza();
        this.vida = clase.getVidaMaxima() + raza.getVidaBase();
        this.habilidades = new ArrayList<>(habilidades);
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) { // Es mejor usar < 0 que <= 0
            vida = 0;
        }
    }

    public String mostrarDatos() {
        return nombre + " | Puntos de salud: " + vida;
    }

    public void curar(int cantidad) {
        vida += cantidad;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getDestreza() { return destreza; }
    public int getVida() { return vida; }

    // Añadimos el metodo para obtener las habilidades del personaje
    public ArrayList<habilidad> getHabilidades() {
        return habilidades;
    }
}
