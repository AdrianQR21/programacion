package utils;

import java.io.*;
import java.time.LocalDateTime;

public class LoggerCustom {

    public static void log(String mensaje) {
        //Pongo la ruta donde van a ir los logs
        String path = "practica07/Ficheros/errores.log";
        //Creamos un bufferedwriter que contiene la ruta del archivo a traves del filewriter, le ponemos que no sobreescriba sino que añada
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            //Escribimos el mensaje y hacemos un salto de linea para el proximo mensaje
            writer.write(mensaje);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}


/* modifica la creacion total de personajes para que el peso total de
los items en equipos ids no superen la capacidad de carga de los personajes,
carga maxima = fuerza de ataque*5
Crear una excepción de sobrecarga de equipamiento
 */