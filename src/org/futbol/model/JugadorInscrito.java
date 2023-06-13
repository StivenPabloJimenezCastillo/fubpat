package org.futbol.model;

public class JugadorInscrito {
    private Inscripcion inscripcion;
    private Jugador jugador;

    //constructor
    public JugadorInscrito(Jugador jugador, Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
        this.jugador = jugador;
    }
    //setters y getters


    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    //to String
    @Override
    public String toString() {
        return jugador.toString();
    }
}
