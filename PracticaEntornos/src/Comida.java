import java.util.List;
import java.util.ArrayList;

public class Comida extends Producto {
    private List<String> alergenos;
    private int tiempoCocinado;

    public Comida(String nombre, double precioBase, int tiempoCocinado) {
        super(nombre, precioBase);
        this.tiempoCocinado = tiempoCocinado;
        this.alergenos = new ArrayList<>();
    }

    public void agregarAlergeno(String alergeno) {
        this.alergenos.add(alergeno);
    }

    public List<String> getAlergenos() {
        return alergenos;
    }
}
