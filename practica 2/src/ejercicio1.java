import jdk.jshell.EvalException;

import java.util.Scanner;

public class ejercicio1 {

    //Crea un array de 10 posiciones de números con valores pedidos
    // por teclado. Muestra por consola el indice y el valor al que
    // corresponde.

    public static void main(String[] args) {
        //Crea un array de 10 posiciones de numeros con valores pedidos por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce otro numero");
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = sc.nextInt();
            //Muestra por consola el indice y el valor al que corresponde.
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("indice " + i + " --> " + arrayInt[i]);
        }
    }
}