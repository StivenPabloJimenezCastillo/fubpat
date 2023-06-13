package org.futbol.model;

import java.util.List;

public class Jugador extends Persona {
    private List<JugadorInscrito>jugadorInscritoList;

    public Jugador(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public String toString() {
        return "Jugador{"+"nombre="+ super.getNombre()+ ", apellido=" + super.getApellido() + '}';
    }
}
