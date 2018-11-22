package com.panalera.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panalera.entidad.EstadoTabla;

@Repository("estadoTablaJpaRepository")
public interface EstadoTablaJpaRepository extends JpaRepository<EstadoTabla, Serializable> {
    List<EstadoTabla> findByNombreTabla(String nombreTabla);
}
