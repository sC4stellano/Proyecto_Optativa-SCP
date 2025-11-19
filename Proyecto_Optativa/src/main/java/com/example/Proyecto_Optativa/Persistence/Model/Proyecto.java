package com.example.Proyecto_Optativa.Persistence.Model;

import java.util.List;

public class Proyecto {
    private int id;
    private String nombre;
    private String estado;
    private List<Developer> desarrolladores;
    private List<Technology> tecnologias;

    // Constructor vacío
    public Proyecto() {
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Developer> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(List<Developer> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public List<Technology> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Technology> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
