package com.example.microserviciousuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microserviciousuarios.entity.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Integer>{
	
}
