package com.panalera.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panalera.entidad.DetalleCompra;


@Repository("detalleCompraJpaRepository")
public interface DetalleCompraJpaRepository extends JpaRepository<DetalleCompra, Serializable> {
    List<DetalleCompra> findByOrdenCompraId(int ordenCompraId);
}
