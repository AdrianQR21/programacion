public class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Metodo Get precios
    public double getPrecio() {
        return this.precioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}