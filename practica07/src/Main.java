
import services.GestionMundo;


public class Main {
    public static void main(String[] args) {
        GestionMundo g = new GestionMundo();

        g.cargarTodo();

        g.menu();
    }
}
