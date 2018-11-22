package com.panalera.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panalera.entidad.OrdenCompra;

@Repository("ordenCompraJpaRepository")
public interface OrdenCompraJpaRepository extends JpaRepository<OrdenCompra, Serializable> {

}
