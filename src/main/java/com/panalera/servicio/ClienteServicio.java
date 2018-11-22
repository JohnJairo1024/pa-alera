package com.panalera.servicio;

import java.util.List;

import com.panalera.repositorio.ClienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.panalera.entidad.Cliente;

@Service("clienteServicio")
public class ClienteServicio implements EntidadServicio<Cliente> {

    /*Injectando el repositorio de la entidad cliente*/
    @Autowired
    @Qualifier("clienteJpaRepository")
    private ClienteJpaRepository clienteJpaRepository;

    @Override
    public List<Cliente> all() {
        return clienteJpaRepository.findAll();
    }

    @Override
    public Cliente get(int id) {
        // TODO Auto-generated method stub
        return clienteJpaRepository.getOne(id);
    }

    @Override
    public Cliente add(Cliente cliente) {
        // TODO Auto-generated method stub
        return clienteJpaRepository.save(cliente);
    }

    @Override
    public int remove(int id) {
        clienteJpaRepository.delete(id);
        return 0;
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteJpaRepository.save(cliente);
    }


    public List<Cliente> findByRucODni(String rucODni) {
        return clienteJpaRepository.findByRucODni(rucODni);
    }


    public List<Cliente> findByNombreCompleto(String nombre) {
        return clienteJpaRepository.findByNombreCompletoContaining(nombre);
    }


}
