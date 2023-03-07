package com.example.citas.domain;

import java.util.Date;

public class Cita {

    private String nombre;
    private String apellidos;
    private Date fecha;

    public Cita(){

    }
    public Cita(String nombre, String apellidos, Date fecha){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFecha() {
        return fecha;
    }
}
