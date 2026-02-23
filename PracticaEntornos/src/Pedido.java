import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private LocalDateTime fecha;
    private String estado;
    private List<LineaPedido> lineas;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.fecha = LocalDateTime.now(); // Asigna fecha/hora actual
        this.estado = "Abierto";
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(LineaPedido linea) {
        this.lineas.add(linea);
    }

    public void cancelarPedido() {
        this.estado = "Cancelado";

    }

    public double calcularTotalPedido() {
        double total = 0;
        for (LineaPedido linea : lineas) {
            linea.calcularSubTotal();
            total += linea.getSubtotal();
        }
        return total;
    }
}
