package rpg.model;

public class Personajes_Habilidades {

   private Integer id_personaje;
   private Integer id_habilidad;
   private boolean equipada_combate;

    public Personajes_Habilidades(Integer id_personaje, Integer id_habilidad){

    }

    public Integer getId_personaje() {
        return this.id_personaje;
    }

    public void setId_personaje(Integer id_personaje) {
        this.id_personaje = id_personaje;
    }

    public Integer getId_habilidad() {
        return this.id_habilidad;
    }

    public void setId_habilidad(Integer id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public boolean isEquipada_combate() {
        return this.equipada_combate;
    }

    public void setEquipada_combate(boolean equipada_combate) {
        this.equipada_combate = equipada_combate;
    }
}
