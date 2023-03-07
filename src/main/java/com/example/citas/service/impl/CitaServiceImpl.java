package com.example.citas.service.impl;

import com.example.citas.domain.Cita;
import com.example.citas.repository.CitaRepository;
import com.example.citas.service.CitaService;

import java.util.List;

public class CitaServiceImpl implements CitaService {

    CitaRepository citaRepository;

    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public void alta(Cita cita){
        citaRepository.alta(cita);
    }

    public void baja(int indice){
        citaRepository.baja(indice);
    }

    public List<Cita> listar(){
        return citaRepository.listar();
    }
}
