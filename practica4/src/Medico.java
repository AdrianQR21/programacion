import java.time.Year;

public class Medico {
    // ATRIBUTOS
    private String DNI;
    private String nombre;
    private int Edad;
    private String Sexo;
    private double sueldoBruto;
    private int fechaInicio;
    private Areas areas;
    private int aniosAntiguedad;
    //CONSTRUCTOR
    public Medico (String DNI, String nombre, int edad, String sexo, double sueldoBruto, int fechaInicio, Areas areas, int aniosAntiguedad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaInicio = fechaInicio;
        this.areas = areas;
        this.aniosAntiguedad = aniosAntiguedad;
        areas.contadorNumMedicos();
    }
    // METODOS GET Y SET


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

    public double getSueldoBruto() {
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

    public Areas getAreas() {
        return areas;
    }
    // CALCULO SUELDO NETO
    public void setAreas(Areas areas) {
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

    public boolean (Object obj) {
        return super.equals(obj);
    }
}
