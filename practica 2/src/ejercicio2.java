public class ejercicio2 {
    public static void main(String[] args) {
        //Muestra por pantalla todos los elementos de un array
        // de números enteros separados por un espacio.

        // array de números enteros
        int[] n = {5, 10, 15, 20, 25, 30, 50, 100};

        // Muestra por pantalla separados por un espacio
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}