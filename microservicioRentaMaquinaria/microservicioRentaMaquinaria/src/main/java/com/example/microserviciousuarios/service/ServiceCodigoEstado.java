package com.example.microserviciousuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.CodigoEstado;
import com.example.microserviciousuarios.repository.RepositoryCodigoEstado;

@Service
public class ServiceCodigoEstado {

	private RepositoryCodigoEstado repositoryCodigoEstado;
	
	public void crearCodigoEstado(CodigoEstado codigoEstado) {
		this.repositoryCodigoEstado.save(codigoEstado);
	}
	
	public List<CodigoEstado> obtenerTodosEstados(){
		return this.repositoryCodigoEstado.findAll();
	}
}
