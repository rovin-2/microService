package com.example.microserviciousuarios.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CODIGOS")
public class CodigoTipoUsuario {
	
	@Id
	private int idCodigo;
	private String nombre;
	
	public CodigoTipoUsuario() {}

	public CodigoTipoUsuario(int idCodigo, String nombre) {
		super();
		this.idCodigo = idCodigo;
		this.nombre = nombre;
	}

	public int getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(int idCodigo) {
		this.idCodigo = idCodigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
