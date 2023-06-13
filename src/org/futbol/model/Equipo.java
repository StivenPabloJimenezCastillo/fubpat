package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Equipo {
    //atributos
    private String nombre;
    //relaciones
    private List<EquipoInscrito>equipoInscritoList;
    //constructor
    public Equipo(String nombre){
        equipoInscritoList = new LinkedList<>();
        this.nombre = nombre;
    }

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

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + '}';
    }
}