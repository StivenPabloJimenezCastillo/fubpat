package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Temporada {
    //atributos
    private String nombre;
    //relaciones
    private List<Asignacion> asignacionList;
    private Competencia competencia;
    private List<EquipoInscrito> equipoInscritoList;
    //constructor
    public Temporada(Competencia competencia, String nombre){
        this.competencia = competencia;
        this.nombre = nombre;
        this.asignacionList = new LinkedList<>();
        this.equipoInscritoList = new LinkedList<>();

    }
    //metodos
    public boolean validarJugador(Jugador jugador){
        for (EquipoInscrito equipoInscrito : equipoInscritoList) {
            if(equipoInscrito.validarJugador(jugador)){
                return true;
            }
        }
        return false;
    }
    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EquipoInscrito> getEquipoInscritoList() {
        return equipoInscritoList;
    }

    public void setEquipoInscritoList(List<EquipoInscrito> equipoInscritoList) {
        this.equipoInscritoList = equipoInscritoList;
    }

    public String  getCompetencia() {
        return competencia.getNombre();
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }
    //to string

    @Override
    public String toString() {
        return "Temporada{" + "nombre=" + nombre + ",competencia" + competencia + ", asignacionList=" + asignacionList + '}';
    }

}