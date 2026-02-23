import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private double descuento;

    public Combo(String nombre, double descuento) {
        super(nombre, 0.0);
        this.descuento = descuento;

    }

    public double calcularPrecioFinal() {
        double sumaPrecios = 0;
        // El descuento se resta al total
        return sumaPrecios - descuento;
    }

    @Override
    public double getPrecio() {
        return calcularPrecioFinal();
    }
}
