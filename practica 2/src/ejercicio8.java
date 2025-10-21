import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        //Programa Java para leer la altura de N personas y calcular la altura media.
        // Calcular cuántas personas tienen una altura superior a la media
        // y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado
        // y debe ser entero positivo.

        // Poner el numero de personas
            do {
            Scanner sc = new Scanner(System.in);
            int num;
            int num = sc.nextInt();
            System.out.println("introduce el número de personas (entero positivos):");
            if (num <= 0) ;
            {
                System.out.println("Por favor, introduce un número positivo");
            }
            while (num <= 0) ;
            double[] alturas = new double[num];
            int suma = 0;
            for (int i = 0; i < num; i++) {
                System.out.println("Introduce la altura de la persona " + (i + 1) + " en metros");
                alturas[i] = sc.nextInt();
                suma += alturas[i];
            }
            double media = (double) suma / num;
            int superior = 0;
            int inferior = 0;
            for (int i = 0; i < num; i++) {
                if (alturas[i] > media) {
                    inferior++;
                }
            }
    }
}