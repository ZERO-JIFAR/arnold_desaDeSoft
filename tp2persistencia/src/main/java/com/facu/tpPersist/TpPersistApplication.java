package com.facu.tpPersist;

import com.facu.tpPersist.entidades.Persona;
import com.facu.tpPersist.repositorios.PersonaRepositorio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class TpPersistApplication {
	@Autowired
	PersonaRepositorio personaRepositorio;
	public static void main(String[] args) {
		SpringApplication.run(TpPersistApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PersonaRepositorio personaRepositorio) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");
			Persona persona = new Persona();
			persona.setNombre("Juan");
			persona.setApellido("Pérez");
			persona.setEdad(30);

			// Guardar el objeto Persona en la base de datos
//        PersonaRepository personaRepository = context.getBean(PersonaRepository.class);
			personaRepositorio.save(persona);

			// Recuperar el objeto Persona desde la base de datos
			Persona personaRecuperada = personaRepositorio.findById(persona.getId()).orElse(null);
			if (personaRecuperada != null) {
				System.out.println("Nombre: " + personaRecuperada.getNombre());
				System.out.println("Apellido: " + personaRecuperada.getApellido());
				System.out.println("Edad: " + personaRecuperada.getEdad());
			}

		};

	}


}
