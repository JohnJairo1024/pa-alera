package com.panalera.servicio;

import java.util.List;

import com.panalera.repositorio.EmpleadoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.panalera.entidad.Empleado;


@Service("empleadoServicio")
public class EmpleadoServicio implements EntidadServicio<Empleado> {

    /*Injectando el repositorio de la empleado cliente*/
    @Autowired
    @Qualifier("empleadoJpaRepository")
    private EmpleadoJpaRepository empleadoJpaRepository;

    @Override
    public List<Empleado> all() {
        // TODO Auto-generated method stub
        return empleadoJpaRepository.findAll();
    }

    @Override
    public Empleado get(int id) {
        // TODO Auto-generated method stub
        return empleadoJpaRepository.getOne(id);
    }

    @Override
    public Empleado add(Empleado empleado) {
        // TODO Auto-generated method stub
        return empleadoJpaRepository.save(empleado);
    }

    @Override
    public int remove(int id) {
        // TODO Auto-generated method stub
        empleadoJpaRepository.delete(id);
        return 0;
    }

    @Override
    public Empleado update(Empleado empleado) {
        // TODO Auto-generated method stub
        return empleadoJpaRepository.save(empleado);
    }

    public List<Empleado> findByUserId(int userId) {
        return this.empleadoJpaRepository.findByUserId(userId);
    }

}
