public class ejercicio4 {
    //Crea un array de números de 100 posiciones, que contendrá los
    // números del 1 al 100. Obtén la suma de todos ellos y la media.

    public static void main(String[] args) {
        int[] array = new int[100];
        int suma = 0;
        double media;

        //Recorremos el array con los numeros del 1 al 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            suma = suma + array[i];
        }
        //Calculamos la media
        media = (double)  suma / array.length;

        // Imprimimos los resultados
        System.out.println("La suma de los números del 1 al 100 es:" + suma);
        System.out.println("La media de los números del 1 al 100 es: " + media);
    }
}
