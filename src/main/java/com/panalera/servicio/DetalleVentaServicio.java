package com.panalera.servicio;

import java.util.List;

import com.panalera.repositorio.DetalleVentaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.panalera.entidad.DetalleVenta;


@Service("detalleVentaServicio")
public class DetalleVentaServicio implements EntidadServicio<DetalleVenta> {
    /*Injectando el repositorio de la entidad cliente*/
    @Autowired
    @Qualifier("detalleVentaJpaRepository")
    private DetalleVentaJpaRepository detalleVentaJpaRepository;


    @Override
    public List<DetalleVenta> all() {
        // TODO Auto-generated method stub
        return detalleVentaJpaRepository.findAll();
    }

    @Override
    public DetalleVenta get(int id) {
        // TODO Auto-generated method stub
        return detalleVentaJpaRepository.getOne(id);
    }

    @Override
    public DetalleVenta add(DetalleVenta detalleVenta) {
        // TODO Auto-generated method stub
        return detalleVentaJpaRepository.save(detalleVenta);
    }

    @Override
    public int remove(int id) {
        // TODO Auto-generated method stub
        detalleVentaJpaRepository.delete(id);
        return 0;
    }

    @Override
    public DetalleVenta update(DetalleVenta detalleVenta) {
        // TODO Auto-generated method stub
        return detalleVentaJpaRepository.save(detalleVenta);
    }

    public List<DetalleVenta> findByNotaVentasId(int notaVentasId) {
        return detalleVentaJpaRepository.findByNotaVentasId(notaVentasId);
    }

    public List<DetalleVenta> findByFacturaId(int facturaId) {
        return detalleVentaJpaRepository.findByFacturaId(facturaId);
    }
}
