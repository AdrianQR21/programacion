import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        // A continuación se recorre el array y calcula cuántos números son positivos
        // cuántos negativos y cuántos ceros.

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 10 números enteros");

        // dar valores a la función
        int contpositivos = 0;
        int contnegativos = 0;
        int[] array = new int[10];
        int sumapositivos = 0;
        double mediapositivos = 0;
        int sumanegativos = 0;
        double medianegativos = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        } // Calcular y mostrar medias
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumapositivos = sumapositivos + array[i];
                contpositivos++;

            } else if (array[i] < 0) {
                    sumanegativos = sumanegativos + array[i];
                    contnegativos++;
            }
            mediapositivos = (double) sumapositivos/contpositivos;
            medianegativos = (double) sumanegativos/contnegativos;
        } // Imprimimos resultados
            System.out.println("Resultado valores media negativos: " + medianegativos);
            System.out.println("Resultado media valores positivos: " + mediapositivos);
    }
}