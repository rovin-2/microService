package com.formacionbdi.springboot.app.item.models;

import java.util.Date;

public class Producto {
	
	private Long id;
	private String nombre;
	private Double precio;
	private Date createAT;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAT() {
		return createAT;
	}
	public void setCreateAT(Date createAT) {
		this.createAT = createAT;
	};
	
	
	

}
