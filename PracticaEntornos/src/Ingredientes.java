import java.util.ArrayList;

// Clase simple de datos
public class Ingredientes {
    private String nombre;
    private double cantidadDisponible;

    public Ingredientes(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public double getCantidad() { return cantidadDisponible; }
    public void restarCantidad(double cant) { this.cantidadDisponible -= cant; }
}
