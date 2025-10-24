import java.util.Arrays;
//Escribe un programa java que invierta el orden de los valores de un array.
// Por invertir el orden de los valores de un array,
// me refiero que el último pasa a ser el primero,
// el penúltimo el segundo y así sucesivamente.
// PRUEBA CON UN ARRAY DE TAMAÑO 6.

public class ejercicio11 {
    public static void main(String[] args) {
        // Declaramos un array de tamaño 6 con valores de ejemplo y lo imprimimos
        int[] numeros = {1, 2, 3, 4, 5, 6};

        System.out.println("Array normal: " + Arrays.toString(numeros));

        // Invertimos el orden del array
        for (int i = 0; i < numeros.length / 2; i++) {
            int numsinv = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = numsinv;
        }

        // Mostramos el resultado del array invertido
        System.out.println("Array invertido: " + Arrays.toString(numeros));
    }
}
