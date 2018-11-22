package com.panalera.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panalera.entidad.PlazoPago;

@Repository("plazoPagoJpaRepository")
public interface PlazoPagoJpaRepository extends JpaRepository<PlazoPago, Serializable> {

}
