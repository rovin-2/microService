package com.example.microserviciousuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.Municipios;
import com.example.microserviciousuarios.repository.RepositoryMunicipio;

@Service
public class ServiceMunicipio {

	@Autowired
	private RepositoryMunicipio repositoryMunicipio;


	public void crearMunicipio(Municipios municipio) {
		this.repositoryMunicipio.save(municipio);
	}
	
	public List<Municipios> obtenerTodosLosMunicipios(){
		return this.repositoryMunicipio.findAll();
	}
}
