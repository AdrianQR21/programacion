    import java.util.Scanner;

    //Crea un programa en Java que:
    //Pida al usuario por teclado 10 números enteros y los guarde en un array.
    //Recorra el array para encontrar:
    //El valor máximo y la posición en la que aparece.
    //El valor mínimo y la posición en la que aparece.
    //Muestre el resultado en consola

    public class ejercicio9 {
        public static void  main(String[] args){
            //Leemos los 10 números enteros
            Scanner s= new Scanner(System.in);
            int[] nums = new int[10];

            //ahora añadimos los números en el array pidiéndolos por pantalla
            for (int i = 0; i < nums.length ; i++) {
                System.out.println("Dime un número entero por pantalla:");
                nums[i] = s.nextInt();
            }

            //definimos las variables max y min.
            int max = nums[0];
            int min = nums[0];
            int numPos = 0;

            //comparamos para ver que el número del contador es mayor que el max.
            for (int n = 0; n < nums.length; n++) {
                if (nums[n] >= max){
                    max=nums[n];
                    numPos=n+1;
                }
            }
            //mostramos el máximo y su posicion en pantalla
            System.out.printf("El número máximo es %d y su posición es %d%n",max,numPos);

            //asignamos el número de posición a 0 para poder volver a usar la variable
            numPos=0;

            //comparamos para ver que el número del contador es menor que el mín.
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= min){
                    min=nums[i];
                    numPos=i+1;
                }
            }
            //imprimimos el número min en pantalla.
            System.out.printf("El numero minimo es %d y su posición es %d",min,numPos);
        }
    }

