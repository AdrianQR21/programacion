import com.juego.clases.*;
import com.juego.habilidades.*;
import com.juego.modelo.combate;
import com.juego.modelo.personaje;
import com.juego.razas.*;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("¡Bienvenido al juego de combate por turnos!");
    System.out.println("Preparando a los luchadores...");

    // --- Creación del Personaje 1: Un Guerrero Enano ---
    personaje p1 = new personaje(
            "Josemi, el Guerrero",
            new Enano(),
            new Guerrero(),
            // Las clases ahora proporcionan las habilidades directamente
            new Guerrero().getHabilidades()
    );

    // --- Creación del Personaje 2: Un Mago Elfo ---
    personaje p2 = new personaje(
            "Adrian, el Mago", // Vamos a imaginar que Legolas es mago para el ejemplo
            new Elfo(),
            new Mago(),
            new Mago().getHabilidades()
    );

    System.out.println("\n¡Luchadores listos!");
    System.out.println(p1.getNombre() + " ha entrado en la arena.");
    System.out.println(p2.getNombre() + " ha entrado en la arena.");

    // --- Iniciar el combate ---
    combate nuevoCombate = new combate(p1, p2);
    nuevoCombate.iniciar();
  }
}
