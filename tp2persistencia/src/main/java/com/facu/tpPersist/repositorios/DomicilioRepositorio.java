package com.facu.tpPersist.repositorios;

import com.facu.tpPersist.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepositorio extends JpaRepository<Domicilio, Long> {
}
