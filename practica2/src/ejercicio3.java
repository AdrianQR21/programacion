public class ejercicio3 {
    //Crea un array que contenga 5 números. Realiza un programa que
    // te muestre por pantalla SOLO el más pequeño de ellos.
    public static void main(String[] args) {
        int[] x = {23, 2, 7, 10, 11};
        int menor = x[0];
        for (int i = 0; i < x.length; i++)
           if (x[i] < menor) {
                menor = x[i];
           }
        System.out.println("El número mas pequeño es:" + menor);
    }
}