public class Area {
    // Creamos los atributos para el constructor AREAS.
    private String nombre;
    private String identificador;
    private int planta;
    private Hospital hospital; // Asociacion: Area que pertenece a un hospital
    private int numMedicos;
    public Area (String nombre, String identificador, int planta, Hospital hospital) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.planta = planta;
        this.hospital = hospital;
        this.numMedicos = 0;
    }

    public Area(String cardiología) {
    }
    // UTILIZAMOS SET Y GET

    //NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //IDENTIFICADOR
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    //PLANTA
    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
    //HOSPITAL
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    //MEDICOS
    public int getNumMedicos() {
        return numMedicos;
    }

    public void setNumMedicos(Integer numMedicos) {
        this.numMedicos = numMedicos;
    }
    public void incrementarmedicos() {
        this.numMedicos++;
    }
    public void decrementarmedicos() {
        if (this.numMedicos > 0) {
            numMedicos--;
        }
    }

    //Comprobación y Comparación médicos y areas, pongo String en vez de void (porque es un texto)
    public String compararMedicos(Area otraArea) {
        //Miro en cual de las 2 areas hay más médicos
        if (this.numMedicos > otraArea.getNumMedicos()) {
            return "El Area " + this.nombre + " es mayor que el Area " + otraArea.getNombre();  //devuelvo cual tiene más medicos
        }else if (this.numMedicos == otraArea.getNumMedicos()) {
            return "El Area " + this.nombre + " es igual que el Area " + otraArea.getNombre();
        } else {
            return "El Area "+ otraArea.getNombre() +" es mayor que el Area "+ this.nombre;  //devuelvo cual tiene más medicos
        }
    }

    //Calculo de Capacidad
    public int calcularCapacidadRestante(int capacidadMaxima) {
        return capacidadMaxima - this.numMedicos;
    }
}
