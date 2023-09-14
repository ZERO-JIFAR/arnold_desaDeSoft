package com.facu.tpPersist.repositorios;

import com.facu.tpPersist.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
}
