package bloque1;

import java.util.ArrayList;

public class RegistroMuertes {

    public ArrayList<String> RegistroCombate;
    public RegistroMuertes(){
        RegistroCombate = new ArrayList<>();

        RegistroCombate.add("Orco derrotado");
        RegistroCombate.add("Pocion usada");
        RegistroCombate.add("Vida Establecida");
        RegistroCombate.add("Guerrero curado");
        RegistroCombate.add("Mago Dañado");

        System.out.println("El tercer evento del combate fue: " + RegistroCombate.get(2));
    }
}
