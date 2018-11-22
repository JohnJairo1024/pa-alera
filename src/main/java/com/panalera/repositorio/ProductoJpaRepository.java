package com.panalera.repositorio;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.panalera.entidad.Producto;

import java.util.List;

@Repository("productoJpaRepository")
public interface ProductoJpaRepository extends JpaRepository<Producto, Serializable> {
    List<Producto> findById(int id);

    List<Producto> findByDescripcionContaining(String descripcion);

    List<Producto> findByEstadoId(String estadoId);
}
