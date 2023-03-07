package com.example.citas.repository;

import com.example.citas.domain.Cita;

import java.util.List;

public interface CitaRepository {
    void alta(Cita cita);

    void baja(int indice);

    public List<Cita> listar();
}
