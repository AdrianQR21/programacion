import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;

public class Hospital {

    private String nombre;
    private String CIF;
    private ArrayList<Areas> areas;

    public Hospital(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.areas = new ArrayList<>();
    }
    // UTILIZAMOS GET Y SET

    public ArrayList<Areas> getAreas() {
        return areas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setAreas(ArrayList<Areas> areas) {
        this.areas = areas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }
}
