package com.example.microserviciousuarios.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "MUNICIPIOS")
public class Municipios {

	@Id
	private int idMunicipio;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idDepartamento")
	@JsonBackReference
	private Departamento idDepartamento;

	public Municipios() {}

	public Municipios(int idMunicipio, String nombre, Departamento idDepartamento) {
		super();
		this.idMunicipio = idMunicipio;
		this.nombre = nombre;
		this.idDepartamento = idDepartamento;
	}

	public int getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
}
