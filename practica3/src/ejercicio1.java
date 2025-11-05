public class ejercicio1 {
    public static void main(String[] args) {

        //Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores
        // según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
        // de tabla como se muestra en la figura.

        //definimos el array de tipo double, y poner el número 100 para sustituirlo por el espacio.
        double[][] numeros = {
                {0, 30, 2, 100, 100, 5},
                {75, 100, 100, 100, 0, 100},
                {100, 100, -2, 9, 100, 11}
        };
        //Imprimimos la primera fila
            System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|Array num |Columna 0 | Columna 1 |Columna 2 |Columna 3 |Columna 4 |Columna 5 |");
        //Recorremos el array bucle con la variante i
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("|----------+----------+----------+----------+----------+----------+-----------|");
            System.out.print("|Fila " + i + "    |");
            //recorremos el array con un bucle con la variable j, para que dentro de cada fila se rellenen las columnas,
            // y cada vez que se rellenen las columnas de una fila salte a la otra.
            for(int j = 0; j < numeros[i].length; j++) {
                //sustituye el 100 por un espacio
                if (numeros[i][j] == 100) {
                    System.out.print("         |");
                    //si no hay 100 imprime los numeros normales.
                    // el %9 hace que se cree 9 espacios y luego se ponga el numero
                    // (si fuera %-9 el numero iria primero y los espacios a la derecha)
                } else {
                    System.out.printf("%9.0f |", numeros[i][j]);
                }
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
