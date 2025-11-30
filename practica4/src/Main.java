import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Listas
    public static ArrayList<Hospital> hospitales = new ArrayList<>();
    public static ArrayList<Area> areas = new ArrayList<>();
    public static ArrayList<Medico> medicos = new ArrayList<>();
    public static ArrayList<Contrato> contratos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Precargar datos iniciales
        CargarDatosIniciales();

        //Ejecutar menú inicial
        MenuGestor gestor = new MenuGestor();
        gestor.ejecutarMenuPrincipal();
    }

    public static void CargarDatosIniciales() {

        //Creamos las Direcciones con sus Hospitales
        Direccion d1 = new Direccion("Calle Manuel Fdez Caballero", 72, 11406, "Jerez de la Frontera", "Cádiz");
        Hospital h1 = new Hospital("Hospital Taylor Swift ", "CIF123", d1);

        Direccion d2 = new Direccion("Calle Jerez", 22, 11406, "Jerez de la Frontera", "Cádiz");
        Hospital h2 = new Hospital("Hospital Falete", "CIF321", d2);

        //Añadimos los hospitales h1 y h2 al ArrayList Hospitales
        hospitales.add(h1);
        hospitales.add(h2);

        //Creamos las Areas
        Area a1 = new Area("Pediatría", "A001", 1, h1);
        Area a2 = new Area("Neurología", "A002", 1, h2);
        Area a3 = new Area("Dermatología", "A003", 2, h2);

        //Añadimos las Areas
        areas.add(a1);
        areas.add(a2);
        areas.add(a3);


        //Añadimos las Areas a los hospitales

        h1.getAreas().add(a1);
        h2.getAreas().add(a2);
        h2.getAreas().add(a3);

        //Creación de médicos
        Medico m1 = new Medico("12345678E", "Adrian", 25, "Masculino", 2150.00, 2024, a3);
        Medico m2 = new Medico("92445278L", "Paola", 26, "Femenino", 1870.00, 2020, a2);
        Medico m3 = new Medico("56442311W", "Pedro", 24, "Masculino", 1350.00, 2021, a1);
        a1.incrementarmedicos();
        a2.incrementarmedicos();
        a3.incrementarmedicos();

        //Añadimos los Médicos
        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);

        //Creación de Contratos
        Contrato c1 = new Contrato(2024, m1, h2);
        Contrato c2 = new Contrato(2020, m2, h2);
        Contrato c3 = new Contrato(2021, m3, h1);

        //Añadimos los contratos
        contratos.add(c1);
        contratos.add(c2);
        contratos.add(c3);
    }
    //Metodos utilitarios de busqueda

    //Buscar Medico
    public static Medico buscarMedico(String dni) {
        for (int i = 0; i < medicos.size(); i++) {
            Medico m = medicos.get(i);              //Cogemos el médico de la posición 1
            if (m.getDNI().equals(dni)) {           //Comprobamos si su DNI es igual al DNI buscado
                return m;                           //Devolvemos el médico con el que corresponda la busqueda
            }
        }
        return null;        //si no encuentra el médico, devuelve null
    }

    //Buscar Area
    public static Area buscarArea(String id) {
        for (int i = 0; i < areas.size(); i++) {
            Area a = areas.get(i);
            if (a.getIdentificador().equals(id)) {
                return a;
            }
        }
        return null;
    }

    //Buscar Hospital
    public static Hospital buscarHospital(String cif) {
        for (int i = 0; i < hospitales.size(); i++) {
            Hospital h = hospitales.get(i);
            if (h.getCIF().equals(cif)) {
                return h;
            }
        }
        return null;
    }
}