package com.panalera.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panalera.entidad.DetalleVenta;


@Repository("detalleVentaJpaRepository")
public interface DetalleVentaJpaRepository extends JpaRepository<DetalleVenta, Serializable> {
    List<DetalleVenta> findByNotaVentasId(int notaVentasId);

    List<DetalleVenta> findByFacturaId(int facturaId);
}
