package rpg.model;

public class ClaseDAO {

    private Integer id;
    private String nombre;

    public ClaseDAO(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

