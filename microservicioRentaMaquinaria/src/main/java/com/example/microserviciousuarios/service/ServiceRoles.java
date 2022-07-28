package com.example.microserviciousuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.CodigoTipoUsuario;
import com.example.microserviciousuarios.repository.RepositoryRoles;


@Service
public class ServiceRoles {
	
	@Autowired
	private RepositoryRoles repositoryRoles;

	public void crearRoles(CodigoTipoUsuario codigoTipoUsuario) {
		this.repositoryRoles.save(codigoTipoUsuario);
	}
	
	public List<CodigoTipoUsuario> obtenerTodosLosRoles(){
		return this.repositoryRoles.findAll();
	}
	
}
