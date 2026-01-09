public class Paciente {
    //DNI y nombre paciente ligado a medicos y funcion en la clase medico de pacientes que devuelve el numero de pacientes que tiene ese medico
    private String DNI;
    private String nombre;
    private Medico medico;

    public Paciente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
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


}
