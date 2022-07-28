package com.example.microserviciousuarios.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "MAQUINA")
public class Maquinaria implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
	private int idMaquina;
	private String nombre;
	private int minHorasRenta;
	private int maxHorasRenta;
	private float costoPorHora;
	private String imagen;
	private Date fechaInicioRenta;
	private Date fechaFinRenta;
	private int contadorAlquilerMaquina;
	private float dineroGenerado;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	@JsonBackReference
	private Usuario idUsuario;
	
	@ManyToOne
	@JoinColumn(name="idCodigoEstado")
	@JsonBackReference
	private CodigoEstado idCodigoEstado;
	
	@ManyToOne
	@JoinColumn(name="idMunicipio")
	@JsonBackReference
	private Municipios idMunicipio;
	
	@ManyToOne
	@JoinColumn(name="idTipoMaquinaria")
	@JsonBackReference
	private TipoMaquinaria idTipoMaquinaria;

	public Maquinaria() {}

	public Maquinaria(int idMaquina, String nombre, int minHorasRenta, int maxHorasRenta, float costoPorHora,
			String imagen, Date fechaInicioRenta, Date fechaFinRenta, int contadorAlquilerMaquina,
			float dineroGenerado, Usuario idUsuario, CodigoEstado idCodigoEstado, Municipios idMunicipio,
			TipoMaquinaria idTipoMaquinaria) {
		super();
		this.idMaquina = idMaquina;
		this.nombre = nombre;
		this.minHorasRenta = minHorasRenta;
		this.maxHorasRenta = maxHorasRenta;
		this.costoPorHora = costoPorHora;
		this.imagen = imagen;
		this.fechaInicioRenta = fechaInicioRenta;
		this.fechaFinRenta = fechaFinRenta;
		this.contadorAlquilerMaquina = contadorAlquilerMaquina;
		this.dineroGenerado = dineroGenerado;
		this.idUsuario = idUsuario;
		this.idCodigoEstado = idCodigoEstado;
		this.idMunicipio = idMunicipio;
		this.idTipoMaquinaria = idTipoMaquinaria;
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMinHorasRenta() {
		return minHorasRenta;
	}

	public void setMinHorasRenta(int minHorasRenta) {
		this.minHorasRenta = minHorasRenta;
	}

	public int getMaxHorasRenta() {
		return maxHorasRenta;
	}

	public void setMaxHorasRenta(int maxHorasRenta) {
		this.maxHorasRenta = maxHorasRenta;
	}

	public float getCostoPorHora() {
		return costoPorHora;
	}

	public void setCostoPorHora(float costoPorHora) {
		this.costoPorHora = costoPorHora;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFechaInicioRenta() {
		return fechaInicioRenta;
	}

	public void setFechaInicioRenta(Date fechaInicioRenta) {
		this.fechaInicioRenta = fechaInicioRenta;
	}

	public Date getFechaFinRenta() {
		return fechaFinRenta;
	}

	public void setFechaFinRenta(Date fechaFinRenta) {
		this.fechaFinRenta = fechaFinRenta;
	}

	public int getContadorAlquilerMaquina() {
		return contadorAlquilerMaquina;
	}

	public void setContadorAlquilerMaquina(int contadorAlquilerMaquina) {
		this.contadorAlquilerMaquina = contadorAlquilerMaquina;
	}

	public float getDineroGenerado() {
		return dineroGenerado;
	}

	public void setDineroGenerado(float dineroGenerado) {
		this.dineroGenerado = dineroGenerado;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public CodigoEstado getIdCodigoEstado() {
		return idCodigoEstado;
	}

	public void setIdCodigoEstado(CodigoEstado idCodigoEstado) {
		this.idCodigoEstado = idCodigoEstado;
	}

	public Municipios getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Municipios idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public TipoMaquinaria getIdTipoMaquinaria() {
		return idTipoMaquinaria;
	}

	public void setIdTipoMaquinaria(TipoMaquinaria idTipoMaquinaria) {
		this.idTipoMaquinaria = idTipoMaquinaria;
	}

}
