package org.futbol.model;

import java.util.List;

public class Competencia {
    //atributos
    private String nombre;



    //relaciones

    private List<Temporada> temporadaList;
    //constructor
    public Competencia(String nombre){
        this.nombre = nombre;
    }
    //setters y getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Temporada> getTemporadaList() {
        return temporadaList;
    }

    public void setTemporadaList(List<Temporada> temporadaList) {
        this.temporadaList = temporadaList;
    }

    public String toString(){
        return "Competencia{"+ "nombre" + nombre + '}';

    }


}
