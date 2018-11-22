package com.panalera.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panalera.entidad.Empleado;

import java.util.List;

@Repository("empleadoJpaRepository")
public interface EmpleadoJpaRepository extends JpaRepository<Empleado, Serializable> {
    List<Empleado> findByUserId(int userId);
}
