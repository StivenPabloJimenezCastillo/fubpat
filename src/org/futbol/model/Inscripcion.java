package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Inscripcion {
    private EquipoInscrito equipoInscrito;
    private List<JugadorInscrito> jugadorInscritoList;
    //constructor
    public Inscripcion(EquipoInscrito equipoInscrito){
        this.equipoInscrito = equipoInscrito;
        this.jugadorInscritoList = new LinkedList<>();
    }

    //metodos
    public  boolean inscribirJugador(Jugador jugador){
        jugadorInscritoList.add(new JugadorInscrito(jugador, this));
        return true;

    }
    public boolean validarJugador(Jugador jugador){
        for (JugadorInscrito jugadorInscrito : jugadorInscritoList) {
            if(jugadorInscrito.getJugador().equals(jugador)){
                return true;
            }
        }
        return false;
    }
    //setters y getters
    public EquipoInscrito getEquipoInscrito() {
        return equipoInscrito;
    }

    public void setEquipoInscrito(EquipoInscrito equipoInscrito) {
        this.equipoInscrito = equipoInscrito;
    }

    public void setJugadorInscritoList(List<JugadorInscrito> jugadorInscritoList) {
        this.jugadorInscritoList = jugadorInscritoList;
    }

    public List<JugadorInscrito> getJugadorInscritoList() {
        return jugadorInscritoList;
    }
}
