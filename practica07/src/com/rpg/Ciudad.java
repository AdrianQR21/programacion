package com.rpg;

public class Ciudad {
    String nombre;
    int población;
    String clima;
    int nivelRiesgo;

    public Ciudad(String nombre, int población, String clima, int nivelRiesgo) {
        this.nombre = nombre;
        this.población = población;
        this.clima = clima;
        this.nivelRiesgo = nivelRiesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblación() {
        return población;
    }

    public void setPoblación(int población) {
        this.población = población;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(int nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }
}
