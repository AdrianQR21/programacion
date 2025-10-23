import java.util.Scanner;

//Ejercicio 10
//Crea un programa que muestre por pantalla la nota de un estudiante,
// de entre una lista de estudiantes con sus respectivas notas.
// El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).
// Utiliza un array para los nombres de los alumnos y otro para las notas.
// ¿Serías capaz de hacerlo con un array BIdimensional?

public class ejercicio10 {
    public static void main(String[] args){
        //definimos los array de nombres y notas
        Scanner sc = new Scanner(System.in);
        String[] nombres={"Adrián","Jaime","Ismael","Jose Manuel","Abelardo"};
        double[] notas={10,5,7,9,6.5,};
        //Definimos la variable y la posición del último estudiante
        String estudiante;
        int ultimoEst= nombres.length - 1;

        //Pedimos por teclado el nombre del estudiante
        System.out.println("Dime tu nombre de estudiante: ");
        estudiante = sc.nextLine();

        //busca el nombre en el array
        for (int i = 0; i < nombres.length; i++) {

            //si lo encuentra mostrará al estudiante y su nota
            if (estudiante.equals(nombres[i])) {
                System.out.printf("La nota del estudiante %s es: %.2f", nombres[i], notas[i]);
                break;
            }
            //Imprimimos si no existiese el estudiante encontrado
            else if (i == ultimoEst && !estudiante.equals(nombres[i])) {
                System.out.println("No existe ese estudiante solicitado");
                break;
            }
        }
    }
}