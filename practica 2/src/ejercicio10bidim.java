import java.util.Scanner;

//Ejercicio 10 BIDIMENSIONAL
//Crea un programa que muestre por pantalla la nota de un estudiante,
// de entre una lista de estudiantes con sus respectivas notas.
// El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).
// Utiliza un array para los nombres de los alumnos y otro para las notas.
// ¿Serías capaz de hacerlo con un array BIdimensional?

public class ejercicio10bidim {
    public static void main(String[] args){
        //definimos los array bidimensionales de nombres y notas
        Scanner s = new Scanner(System.in);
        String[][] estudianteNota= {{"Adrián","10"},{"Jaime","10"},{"Ismael","7"}};

        //guardamos el estudiante que pide por pantalla en una variable
        System.out.println("dime un el nombre del alumno");
        String estudiante = s.nextLine();
        //guardamos la ultima posicion del array en una variable
        int ultimoEst = estudianteNota.length -1;
        //ahora recorremos el array bidimensional comparando si los los nombres son iguales que la entrada
        for (int i = 0; i < estudianteNota.length; i++) {
            if (estudiante.equals(estudianteNota[i][0])){
                System.out.printf("La nota del estudiante %s es: %s",estudianteNota[i][0],estudianteNota[i][1]);
                break;
            }
            //Imprimimos si no existiese el estudiante encontrado en la última posición
            else if (i == ultimoEst && !estudiante.equals(estudianteNota[i][0])) {
                System.out.println("No existe el estudiante solicitado");
            }
        }
    }
}