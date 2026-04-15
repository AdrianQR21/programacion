package rpg.model;

public class Raza {

    private Integer id;
    private String nombre;
    private Integer bonificador_vida;
    private Integer bonificador_fuerza;

    public Raza(Integer id, String nombre, Integer bonificado_vida, Integer bonificador_fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.bonificador_vida = bonificado_vida;
        this.bonificador_fuerza = bonificador_fuerza;
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

    public Integer getBonificado_vida() {
        return this.bonificador_vida;
    }

    public void setBonificado_vida(Integer bonificado_vida) {
        this.bonificador_vida = bonificado_vida;
    }

    public Integer getBonificador_fuerza() {
        return this.bonificador_fuerza;}

    public void setBonificador_fuerza(Integer bonificador_fuerza) {
        this.bonificador_fuerza = bonificador_fuerza;
    }
}
