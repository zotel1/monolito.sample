package com.fullstack.curso.entities;

import java.util.UUID;

public class Instructor {

    private UUID id;
    private String nombre;
    private String apellido;

    public Instructor(String nombre, String apellido){
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
