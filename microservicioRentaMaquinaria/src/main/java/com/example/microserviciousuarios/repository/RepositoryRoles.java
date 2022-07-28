package com.example.microserviciousuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microserviciousuarios.entity.CodigoTipoUsuario;

public interface RepositoryRoles extends JpaRepository<CodigoTipoUsuario, Integer>{

}
