import java.time.Year;
import java.util.ArrayList;

public class Medico {
    // ATRIBUTOS
    private String DNI;
    private String nombre;
    private int Edad;
    private String Sexo;
    private double sueldoBruto;
    private int fechaInicio;
    private Area areas;
    private int aniosAntiguedad;
    private ArrayList<Paciente> pacientes;
    //CONSTRUCTOR
    public Medico(String DNI, String Nombre, Integer Edad, String Sexo, Double SueldoBruto, Integer FechaInicio, Area area){
        this.DNI = DNI;
        this.nombre = nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaInicio = fechaInicio;
        this.aniosAntiguedad = aniosAntiguedad;
        this.pacientes = new ArrayList<>();
        this.areas = areas;
    }
    // METODOS GET Y SET
    public void agregarPaciente (Paciente Paciente ) {
        this.pacientes.add(Paciente);
    }
    public int numeroPaciente() {
        return this.pacientes.size();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getsueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Area getAreas() {
        return areas;
    }
    // CALCULO SUELDO NETO
    public void setAreas(Area areas) {
        this.areas = areas;
    }
    public double calcularSueldoNeto (double retencion) {
        return sueldoBruto - sueldoBruto * (5/100);
    }
    // CALCULO AÑOS DE ANTIGÜEDAD
    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        // CREAMOS LA VARIABLE ANIO ACTUAL
        int anio = Year.now().getValue();
        this.aniosAntiguedad = fechaInicio - anio;
    }
    public double calcularImpuestosAnuales(double tasaImpositiva) {
        //CALCULAMOS EL PORCENTAJE DE IMPUESTOS QUE ES EL 25%
        return this.sueldoBruto * (25/100);
    }
    public boolean esMayorDeEdad (int MayoriaDeEdad) {
        return MayoriaDeEdad >= 18;
    }

    //Cálculo de Aumento
    public double proximoAumento (double porcentajeAumento, int aniosRequeridos) {
        if (getAniosAntiguedad() >= aniosRequeridos) {
            porcentajeAumento = getsueldoBruto() * porcentajeAumento;
            double Sueldobrutoaumento = getsueldoBruto() + (porcentajeAumento / 100);
            return Sueldobrutoaumento;
        } else {
            return getsueldoBruto();
        }
    }

    //Gestión de Area
    public void cambiarArea(Area nuevaArea) {
        getAreas().decrementarmedicos();
        areas.decrementarmedicos();
        nuevaArea.incrementarmedicos();
        this.areas = nuevaArea;
    }
}

