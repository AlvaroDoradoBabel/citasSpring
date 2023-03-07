package com.example.citas.repository.impl;

import com.example.citas.domain.Cita;
import com.example.citas.repository.CitaRepository;

import java.util.ArrayList;
import java.util.List;

public class CitaRepositoryMemory implements CitaRepository {

    private List<Cita> citas;



    public CitaRepositoryMemory() {
        this.citas = new ArrayList<>();
    }

    @Override
    public void alta(Cita cita) {
        citas.add(cita);
    }

    @Override
    public void baja(int indice) {
        citas.remove(indice);
    }

    @Override
    public List<Cita> listar() {
        return citas;
    }
}
