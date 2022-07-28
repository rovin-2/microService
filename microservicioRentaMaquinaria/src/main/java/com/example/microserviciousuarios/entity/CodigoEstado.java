package com.example.microserviciousuarios.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CODIGOESTADO")
public class CodigoEstado {

	@Id
	private int idCodigoEstado;
	private String nombre;
	
	public CodigoEstado() {}

	public CodigoEstado(int idCodigoEstado, String nombre) {
		super();
		this.idCodigoEstado = idCodigoEstado;
		this.nombre = nombre;
	}

	public int getIdCodigoEstado() {
		return idCodigoEstado;
	}

	public void setIdCodigoEstado(int idCodigoEstado) {
		this.idCodigoEstado = idCodigoEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
