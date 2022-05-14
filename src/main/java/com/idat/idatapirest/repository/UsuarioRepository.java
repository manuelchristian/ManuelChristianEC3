package com.idat.idatapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.idatapirest.model.UsuarioCliente;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCliente, Integer>{
	
	
	UsuarioCliente findByUsuario(String usuario);
	

}
