public class LineaPedido {
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.calcularSubTotal();
    }

    public void calcularSubTotal() {
        // Obtenemos el precio del producto y multiplicamos
        this.subtotal = this.producto.getPrecio() * this.cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }
}