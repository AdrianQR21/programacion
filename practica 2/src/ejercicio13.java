import java.util.ArrayList;
import java.util.Scanner;

//Ejercicio 13
//Crea un programa que:
//Cree una lista de enteros (ArrayList<Integer>).
//Pida números por teclado hasta que el usuario introduzca un número negativo (ese
//no se añade).
//Muestre por pantalla todos los números de la lista y la suma total de los mismos.

public class ejercicio13 {
    public static void  main(String[] args){
        //definimos la variable escaner y el arraylist de enteros
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        //definimos la variable de numeros
        int numeros;
        //Leer números hasta que se introduzca un número negativo
        do {
            System.out.println("Introduzca un número por teclado (cuando sea negativo se parará)");
            numeros = sc.nextInt();
            if (numeros >= 0){
                lista.add(numeros);
            }
        } while (numeros >= 0);

        //definimos la variable suma y recorremos el array list sumando los elementos
        int suma= 0;
        for (int integer : lista) {
            suma += integer;
        }
        // Mostrar los números introducidos
        System.out.println("Números introducidos: " + numeros);

        // Mostrar la suma total
        System.out.println("Suma total: " + suma);

    }
}