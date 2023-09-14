package com.facu.tpPersist.repositorios;

import com.facu.tpPersist.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}


