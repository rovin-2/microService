package com.example.microserviciousuarios.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="USUARIOS")
public class Usuario {
	
	@Id
	private int idUsuario;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String contraseña;
	private String telefono;
	private String correo;

	@ManyToOne
	@JoinColumn(name="idCodigo")
	@JsonBackReference
	private CodigoTipoUsuario codigoTiposUsuario;
	
	public Usuario() {}

	public Usuario(int idUsuario, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String contraseña, String telefono, String correo, CodigoTipoUsuario idCodigo) {
		super();
		this.idUsuario = idUsuario;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.contraseña = contraseña;
		this.telefono = telefono;
		this.correo = correo;
		this.codigoTiposUsuario = idCodigo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public CodigoTipoUsuario getCodigoTiposUsuario() {
		return codigoTiposUsuario;
	}

	public void setCodigoTiposUsuario(CodigoTipoUsuario codigoTiposUsuario) {
		this.codigoTiposUsuario = codigoTiposUsuario;
	}

	
}
