import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private double descuento;

    public Combo(String nombre, double descuento) {
        // Inicializamos con precio base 0 porque se calculará con los productos
        super(nombre, 0.0);
        this.descuento = descuento;

    }

    // Metodo del diagrama: suma los precios y aplica descuento
    public double calcularPrecioFinal() {
        double sumaPrecios = 0;
        // El descuento se resta al total
        return sumaPrecios - descuento;
    }

    // Sobreescribimos el metodo getPrecio del padre
    @Override
    public double getPrecio() {
        return calcularPrecioFinal();
    }
}
