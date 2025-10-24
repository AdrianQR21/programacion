import java.util.Scanner;

//Programa Java para leer la altura de N personas y calcular la altura media.
// Calcular cuántas personas tienen una altura superior a la media y cuántas
// tienen una altura inferior a la media. El valor de N se pide por teclado
// y debe ser entero positivo.

public class ejercicio8 {
    public static void main(String[] args){
        //definimos la variable que va a guardar el tamaño del array alt y el scanner
        int n;
        Scanner sc = new Scanner(System.in);
        //creamos la variable de control de nuestro bucle while que va a pedir datos por pantalla hasta que los datos sean positivos
        boolean positivo = false;
        do {
            System.out.println("dime un número de personas que vas a medir");
            n = sc.nextInt();
            //si es mayor o igual que 0 es positivo por lo cual cambiaremos positivo a true
            if (n >= 0){
                positivo=true;
            } else{
                System.out.println("El número debe ser positivo");
            }
        } while (!positivo);
        //creamos el array con el tamaño del dato introducido por pantalla
        double[] alt = new double[n];

        //creamos nuestra variable que almacenará la suma de las alturas para después hacer la media
        double sumaAlt = 0;

        //un bucle que recorre el array alt metiendo los datos que le vamos  introduciendo por teclado
        for (int i = 0; i < alt.length; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + " (en metros): ");
            alt[i] = sc.nextDouble();
            sumaAlt += alt[i];
        }

        //calculamos la media de todas las alturas y la suma de ellas
        double media = (double) sumaAlt / (double) alt.length;

        //creamos las dos variables, una inferior y otra superior
        int inferior = 0;
        int superior = 0;
        //Con un bucle vemos si son mayores o menores que la media
        for (double v : alt) {
            if (v < media) {
                inferior++;
            } else if (v > media) {
                superior++;
            }
        }
        // Imprimimos los valores en pantalla.
        System.out.printf("%nAltura media: %.2f metros%n", media);
        System.out.println("Personas con altura superior a la media: " + superior);
        System.out.println("Personas con altura inferior a la media: " + inferior);

    }
}