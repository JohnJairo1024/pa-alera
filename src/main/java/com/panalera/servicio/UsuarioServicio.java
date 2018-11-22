package com.panalera.servicio;

import java.util.List;

import com.panalera.repositorio.UserJpaRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.panalera.entidad.User;

@Service("usuarioServicio")
public class UsuarioServicio implements EntidadServicio<User>{
	
	private final Log LOG= LogFactory.getLog(UsuarioServicio.class); 
	
	@Autowired
	@Qualifier("userJpaRepository")
	private UserJpaRepository userJpaRepository;
	
	@Override
	public List<User> all() { 
		LOG.info("getting all users!!!");		
		return userJpaRepository.findAll();
	}
	
	@Override
	public User get(int id) {
		return userJpaRepository.getOne(id);
	}
	
	@Override
	public User add(User usuario) { 
		return userJpaRepository.save(usuario);
	}

	@Override
	public int remove(int id) { 
		userJpaRepository.delete(id);
		return 0;
	}

	@Override
	public User update(User usuario) { 
		return userJpaRepository.save(usuario);
	}

	
	public int exists(String username) {		
		return userJpaRepository.exists(username);
	}

	public List<User> findByAuthToken(String authToken){
		return userJpaRepository.findByAuthToken(authToken);
	}

	public List<User> findByUsername(String username){
		return userJpaRepository.findByUsername(username);
	}

}
