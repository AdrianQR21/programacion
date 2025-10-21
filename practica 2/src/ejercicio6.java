import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        // A continuación se recorre el array y calcula cuántos números son positivos
        // cuántos negativos y cuántos ceros.
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce 10 números enteros");
        // dar valores a la función
        int[] array = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros =0;
        for (int i = 0; i< array.length; i++) {
            array[i] = sc.nextInt();
        }
        for(int i =0; i< array.length; i++) {
            if (array[i] > 0) {
                // calcular números que son positivos
                positivos++;
                // calcular números que son negativos
            } else if (array[i] < 0) {
                negativos++;
                // calcular números que son ceros
            }else {
                ceros++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
