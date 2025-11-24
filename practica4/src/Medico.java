public class Medico {
    // ATRIBUTOS
    private String DNI;
    private String nombre;
    private int Edad;
    private String Sexo;
    private double sueldoBruto;
    private int fechaInicio;
    private Areas areas;
    //CONSTRUCTOR
    public Medico (String DNI, String nombre, int edad, String sexo, double sueldoBruto, int fechaInicio, Areas areas) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaInicio = fechaInicio;
        this.areas = areas;
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

    public void setAreas(Areas areas) {
        this.areas = areas;
    }
    public double calcularSueldoNeto (double retencion) {
        return sueldoBruto - sueldoBruto * (5/100);
    }
}
