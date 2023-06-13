package org.futbol.model;

import java.util.List;

public class EquipoInscrito {
    //relaciones

    private Equipo equipo;
    private Inscripcion inscripcion;
    private List<Partido> partidoLocalList;
    private List<Partido> partidoVisitanteList;
    private Temporada temporada;


    public EquipoInscrito(Equipo equipo, Temporada temporada) {
        this.equipo = equipo;
        this.temporada = temporada;
        this.inscripcion = new Inscripcion(this);
    }
    // setters y getters
    public Inscripcion getInscripcion() {
        return inscripcion;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {

        this.equipo = equipo;
    }

    public Temporada getTemporada() {

        return temporada;
    }

    public void setTemporada(Temporada temporada) {

        this.temporada = temporada;
    }
    //metodos
    public boolean inscribirJugador(Jugador jugador){
        inscripcion.inscribirJugador(jugador);
        return true;
    }
    public boolean validarJugador(Jugador jugador) {
        return inscripcion.validarJugador(jugador);
    }

    //tostring
    @Override
    public String toString() {
        return equipo.toString();
    }


}

