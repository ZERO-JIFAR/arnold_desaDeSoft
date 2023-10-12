package com.example.demo;

import com.example.demo.entities.*;
import com.example.demo.repositories.AutorRepository;
import com.example.demo.repositories.LocalidadRepository;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class ApiRestApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
