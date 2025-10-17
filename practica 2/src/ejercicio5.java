import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

    //Crea un array de números donde le indicamos por teclado el tamaño del array,
    //rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla
    //el valor de cada posición y la suma de todos los valores.
    Scanner sc = new Scanner(System.in);

    //Imprimo el tamaño del array
    System.out.println("Introduce un número para el tamaño del array");
    int tamaño = sc.nextInt();

    //Creamos el array
    int [] array = new int[tamaño];

    //Relleno el array con números aleatorios de 0 y 9
        for (int i = 0; i < tamaño; i++) {
            array[i] = rand.nextInt(10); // genera números entre 0 y 9
        }

    }
}
