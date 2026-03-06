package utils;

import com.rpg.Ciudad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {
    public static void leerCiudades(){
        try {
            List<String> lineas = Files.readAllLines(Paths.get("practica07/ficheros/ciudades.txt"));
            List<Ciudad>listaCiudades = new ArrayList<>();
        }catch (IOException e){
            System.out.println();
        }
    }

}
