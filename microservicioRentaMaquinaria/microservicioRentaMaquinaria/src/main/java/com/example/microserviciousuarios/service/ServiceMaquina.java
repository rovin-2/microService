package com.example.microserviciousuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.Maquinaria;
import com.example.microserviciousuarios.repository.RepositoryMaquina;

@Service
public class ServiceMaquina {

	@Autowired
	private RepositoryMaquina repositoryMaquina;
	
	public void crearMaquina(Maquinaria maquinaria) {
		this.repositoryMaquina.save(maquinaria);
	}
	
	public List<Maquinaria> obtenerTodasLasMaquinarias(){
		return this.repositoryMaquina.findAll();
	}
}
