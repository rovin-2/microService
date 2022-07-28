package com.example.microserviciousuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.TipoMaquinaria;
import com.example.microserviciousuarios.repository.RepositoryTipoMaquinaria;

@Service
public class ServiceTipoMaquinaria {

	@Autowired
	private RepositoryTipoMaquinaria repositoryTipoMaquinaria;
	
	public void crearTipoMaquinaria(TipoMaquinaria tipoMaquinaria) {
		this.repositoryTipoMaquinaria.save(tipoMaquinaria);
	}
	
}
