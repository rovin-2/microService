package com.example.microserviciousuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.Departamento;
import com.example.microserviciousuarios.repository.RepositoryDepartamento;

@Service
public class ServiceDepartamento {

	@Autowired
	private RepositoryDepartamento repositoryDepartamento;
	
	public void crearDepartamento(Departamento departamento) {
		this.repositoryDepartamento.save(departamento);
	}
	
	public List<Departamento> obtenerTodosDepartamentos(){
		return this.repositoryDepartamento.findAll();
	}
}
