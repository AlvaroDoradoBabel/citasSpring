package com.example.citas.service;

import com.example.citas.domain.Cita;

import java.util.List;

public interface CitaService {
    void alta(Cita cita);

    void baja(int indice);

    public List<Cita> listar();
}
