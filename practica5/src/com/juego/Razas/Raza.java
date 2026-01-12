package com.juego.Razas;

public interface  Raza {
  /*  // Es abstracto ya que raza sirve como plantilla o base de las subclases
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
    }*/
    String getNombre();
    int getFuerza();
    int getInteligencia();
    int getDestreza();
    int getVidaBase();
    String getEspecialidad();

    }

