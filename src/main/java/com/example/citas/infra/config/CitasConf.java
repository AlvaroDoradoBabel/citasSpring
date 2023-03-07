package com.example.citas.infra.config;

import com.example.citas.infra.console.ConsoleReader;
import com.example.citas.repository.CitaRepository;
import com.example.citas.repository.impl.CitaRepositoryMemory;
import com.example.citas.service.CitaService;
import com.example.citas.service.impl.CitaServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitasConf {
    //Le estoy diciendo a spring que me genere una citaRepositoryMemory con esta configuracion

    @Bean
    CitaRepository getCitaRepository(){
        return new CitaRepositoryMemory();
    }
    @Bean
    CitaService getCitaService(){
        return new CitaServiceImpl(getCitaRepository());
    }
    @Bean
    ConsoleReader getConsoleReader(){
        return new ConsoleReader(getCitaService());
    }

}
