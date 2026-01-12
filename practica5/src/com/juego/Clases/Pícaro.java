package com.juego.Clases;
/*public Pícaro(){
        super(0,0,3,105);

     }*/
public class Pícaro implements Clase{
    @Override
    public int getBonifiacionFuerza() {
        return 0;
    }

    @Override
    public int getBonificacionInteligencia() {
        return 0;
    }

    @Override
    public int getBonificacionDestreza() {
        return 3;
    }

    @Override
    public int getVidaMax() {
        return 105;
    }


}
