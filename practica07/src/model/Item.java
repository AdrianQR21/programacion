package model;

public class Item {
    private String id;
    private String nombre;
    private double peso; // Nuevo atributo necesario

    // Constructor vacío para Gson o constructor completo
    public Item(String id, String nombre, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // añadimo el nuevo atributo peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
