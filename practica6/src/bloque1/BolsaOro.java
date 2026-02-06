package bloque1;

import java.util.HashMap;

public class BolsaOro {
    HashMap<String, Integer>BolsaOro = new HashMap<>();
    public BolsaOro(){
        BolsaOro.put("Raphinha",50);
        BolsaOro.put("Lewandowski",20);
        BolsaOro.put("Lamine",70);
        String nombre = "Lamine";

        System.out.println("Bolsa de oro: el oro de " + nombre +"  es " + BolsaOro.get(nombre));

    }
}
