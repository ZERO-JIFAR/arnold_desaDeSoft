package com.facu.tpPersist.controladores;

import com.facu.tpPersist.repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/personas")

public class PersonaControlador {

    @Autowired
    private PersonaRepositorio personaRepositorio;
/*
    @GetMapping("tpPersist")
    public ResponseEntity<String> getTp(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Saludos terricola");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error.Intente despues\"}");
        }
    }

    @GetMapping("subRuta")
    public ResponseEntity<String> getChau(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Hasta la vista beby");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error.Intente despues\"}");
        }
    }
*/
    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(personaRepositorio.findAll());
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error.Intente despues\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(personaRepositorio.findById(1L));
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error.Intente despues\"}");
        }
    }

    @PostMapping()
    public ResponseEntity<String> create(@RequestBody String persona){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Devuelvo persona creada" + persona);
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error.Intente despues\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id,@RequestBody String persona){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Devuelvo persona actualizada" + persona);
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error.Intente despues\"}");
        }
    }
}
