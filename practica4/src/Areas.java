public class Areas {
    // Creamos los atributos para el constructor AREAS.
    private String nombre;
    private String identificador;
    private int planta;
    private Hospital hospital; // Asociacion: Area que pertenece a un hospital
    private int numMedicos;
    public Areas (String nombre, String identificador, int planta, Hospital hospital) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.planta = planta;
        this.hospital = hospital;
        this.numMedicos = 0;
    }
    // UTILIZAMOS SET Y GET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getNumMedicos() {
        return numMedicos;
    }

    public void contadorNumMedicos() {
        this.numMedicos++;
    }
}
