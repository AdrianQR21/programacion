package rpg.model;

public class CiudadDAO {

    private Integer id;
    private String nombre;
    private Integer nivel_minimo_acceso;

    public CiudadDAO(Integer id, String nombre, Integer nivel_minimo_acceso){
        this.id = id;
        this.nombre = nombre;
        this.nivel_minimo_acceso = nivel_minimo_acceso;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel_minimo_acceso(){
        return this.nivel_minimo_acceso;
    }

    public void setNivel_minimo_acceso(Integer nivel_minimo_acceso) {
        this.nivel_minimo_acceso = nivel_minimo_acceso;
    }

}
