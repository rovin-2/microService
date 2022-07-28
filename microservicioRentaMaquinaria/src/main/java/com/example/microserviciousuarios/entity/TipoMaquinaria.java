package com.example.microserviciousuarios.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOMAQUINARIA")
public class TipoMaquinaria {

	@Id
	private int idTipoMaquinaria;
	private String nombre;
	
	public TipoMaquinaria() {}

	public TipoMaquinaria(int idTipoMaquinaria, String nombre) {
		super();
		this.idTipoMaquinaria = idTipoMaquinaria;
		this.nombre = nombre;
	}

	public int getIdTipoMaquinaria() {
		return idTipoMaquinaria;
	}

	public void setIdTipoMaquinaria(int idTipoMaquinaria) {
		this.idTipoMaquinaria = idTipoMaquinaria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
