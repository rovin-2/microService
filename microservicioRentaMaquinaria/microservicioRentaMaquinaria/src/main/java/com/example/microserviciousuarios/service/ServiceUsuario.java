package com.example.microserviciousuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciousuarios.entity.Usuario;
import com.example.microserviciousuarios.repository.RepositoryUsuario;

@Service
public class ServiceUsuario {

	@Autowired
	private RepositoryUsuario repositoryUsuario;
	
	public void crearUsuario(Usuario usuario) {
		this.repositoryUsuario.save(usuario);
	}
	
	public List<Usuario> obtenerTodosUsuarios(){
		return this.repositoryUsuario.findAll();
	}
}
