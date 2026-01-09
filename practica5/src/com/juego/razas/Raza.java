package com.juego.razas;

public abstract class Raza {
    // Es abstracto ya que raza sirve como plantilla o base de las subclases
    protected String nombre;
    protected int fuerza;
    protected int inteligencia;
    protected int destreza;
    protected int vidaBase;
    protected String especialidad;
    // Utilizamos protected para modificar en las subclases, si fuera private no podría.

    // Constructor
    public Raza(String nombre, int fuerza, int inteligencia, int destreza, int vida, String especialidad) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vidaBase = vidaBase;
        this.especialidad = especialidad;
    }

    public int getFuerza() {
        return fuerza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public int getDestreza() {
        return destreza;
    }
    public int getVidaBase() {
        return vidaBase;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
