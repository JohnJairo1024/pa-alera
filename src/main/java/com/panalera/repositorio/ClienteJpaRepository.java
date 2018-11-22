package com.panalera.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panalera.entidad.Cliente;

@Repository("clienteJpaRepository")
public interface ClienteJpaRepository extends JpaRepository<Cliente, Serializable> {
    List<Cliente> findByRucODni(String RucODni);

    List<Cliente> findByNombreCompletoContaining(String nombreCompleto);
}
