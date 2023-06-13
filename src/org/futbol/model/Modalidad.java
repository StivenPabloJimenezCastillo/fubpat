package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Modalidad {
    //atributos
    private String nombre;
    //relaciones
    private List<Asignacion> asignacionList;
    //constructor
    public Modalidad(String nombre){
        this.nombre = nombre;
        this.asignacionList = new LinkedList<>();
    }
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }

    @Override
    public String toString() {
        return "Modalidad{" + "nombre='" + nombre  + '}';
    }
}
