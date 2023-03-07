package com.example.citas;

import com.example.citas.infra.console.ConsoleReader;
import com.example.citas.repository.impl.CitaRepositoryMemory;
import com.example.citas.service.impl.CitaServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasApplication {

	public static void main(String[] args) {

		SpringApplication.run(CitasApplication.class, args);
		/*
		//SIN SPRING
		ConsoleReader consoleReader = new ConsoleReader(new CitaServiceImpl(new CitaRepositoryMemory()));

		//ConsoleReader consoleReader = new ConsoleReader();
		consoleReader.init(); */

	}

}
