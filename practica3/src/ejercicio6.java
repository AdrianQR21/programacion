public class ejercicio6 {
    public static void main() {
        int[][] array_bi = new int[6][10]; // Crear array bidimensional
        // rellenar datos del array entre 20 y 40
        for (int i = 0; i < array_bi.length; i++) {
            for (int j = 0; j < array_bi[i].length; j++) {
                array_bi[i][j] = (int) (Math.random() * 41);
                if (array_bi[i][j]<20) {
                    array_bi[i][j] += 20;
                }
                // hacer que no se repitan los numeros
                if (array_bi[i][j]==(array_bi[i][j]+1)) {
                    array_bi[i][j] = 0;
                }
            }
        }
        // calcular maximos y minimos
        int max = array_bi[0][0];
        int min = array_bi[0][0];
        int columna = 0;
        int fila = 0;
        for (int i = 0; i < array_bi.length; i++) {
            for (int j = 0; j < array_bi[i].length; j++) {
                // excluye los numeros repetidos (los que valen 0)
                if (array_bi[i][j] >= max) {
                    if (array_bi[i][j]!=0) {
                        max = array_bi[i][j];
                        columna = j;
                        fila = i;
                    }
                }
            }
        }
        System.out.println("El valor maximo es: " + max + " y esta en la fila " + fila + " y columna " + columna);


        for (int i = 0; i < array_bi.length; i++) {
            for (int j = 0; j < array_bi[i].length; j++) {
                if (array_bi[i][j] < min) {
                    // excluye los numeros repetidos (los que valen 0)
                    if (array_bi[i][j]!=0) {
                        min = array_bi[i][j];
                        columna = j;
                        fila = i;
                    }
                }
            }
        }
        System.out.println("El valor minimo es: " + min + " y esta en la fila " + fila + " y columna " + columna);
        // obtener suma de todas las filas y columnas
        int suma_total = 0;
        for (int i = 0; i < array_bi.length; i++) {
            for (int j = 0; j < array_bi[i].length; j++) {
                suma_total += array_bi[i][j];
            }
        }
        System.out.println("La suma total será: " + suma_total);
        // obtener suma de filas
        int[] suma_filas = new int[array_bi.length];
        for (int i = 0; i < array_bi.length; i++) {
            for (int j = 0; j < array_bi[i].length; j++) {
                suma_filas[i] += array_bi[i][j];
            }
        }
        for (int i = 0; i < suma_filas.length; i++) {
            System.out.println("La suma de la fila " + i + " es : " + suma_filas[i]);
        }
        // obtener suma de columnas
        int[] suma_columnas = new int[array_bi[0].length];
        for (int i = 0; i < array_bi.length; i++) {
            for (int j = 0; j < array_bi[i].length; j++) {
                suma_columnas[j] += array_bi[i][j];
            }
        }
        for (int i = 0; i < suma_columnas.length; i++) {
            System.out.println("La suma de la columna " + i + " es: " + suma_columnas[i]);
        }
    }
}

