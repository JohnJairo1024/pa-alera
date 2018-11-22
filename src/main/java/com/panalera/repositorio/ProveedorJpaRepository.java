package com.panalera.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panalera.entidad.Proveedor;

import java.util.List;

@Repository("proveedorJpaRepository")
public interface ProveedorJpaRepository extends JpaRepository<Proveedor, Serializable> {
    List<Proveedor> findByRuc(String ruc);

    List<Proveedor> findByRazonSocialContaining(String razonSocial);
}
