
public static void main(String[] args){
    Bloque1 bloque1 = new Bloque1();
    ArrayList<String>muerte = bloque1.RegistroMuertes();
    HashSet<String>nombreVillanos = bloque1.CensoUnico();

    bloque1.CensoUnico();
    bloque1.BolsaOro();
    bloque1.LimpiezaCalabozo(muerte);
    bloque1.MercadoHechizos();
    bloque1.ExpulsionReino(nombreVillanos);

    Bloque2 bloque2 = new Bloque2();
    bloque2.RepositoriosGremios();
    bloque2.SistemaLoot();
    bloque2.RastreadorEstadistica();
    bloque2.BuscadorTaidores();







}
