package com.juego.Modelo;

public class combate {
        private Personaje jugador1;
        private Personaje jugador2;
        private Personaje turnoActual;

    /*El primer turno es del p1, el segundo de p2 y así consecutivamente*/

        public combate(Personaje p1, Personaje p2) { //Constructor
            this.jugador1 = p1;
            this.jugador2 = p2;
            this.turnoActual = p1;
        }


}
