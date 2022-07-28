package com.example.microserviciousuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microserviciousuarios.entity.CodigoTipoUsuario;
import com.example.microserviciousuarios.entity.Departamento;
import com.example.microserviciousuarios.entity.Maquinaria;
import com.example.microserviciousuarios.entity.Municipios;
import com.example.microserviciousuarios.entity.Usuario;
import com.example.microserviciousuarios.service.ServiceCodigoEstado;
import com.example.microserviciousuarios.service.ServiceDepartamento;
import com.example.microserviciousuarios.service.ServiceMaquina;
import com.example.microserviciousuarios.service.ServiceMunicipio;
import com.example.microserviciousuarios.service.ServiceRoles;
import com.example.microserviciousuarios.service.ServiceTipoMaquinaria;
import com.example.microserviciousuarios.service.ServiceUsuario;

@RestController
@RequestMapping("/api/rentaMaquinaria")
public class Controlador {
	
	@Autowired
	private ServiceUsuario serviceUsuario;
	
	@Autowired
	private ServiceRoles serviceRoles;
	
	@Autowired
	private ServiceMaquina serviceMaquina;
	
	@Autowired
	private ServiceTipoMaquinaria serviceTipoMaquinaria;
	
	@Autowired
	private ServiceDepartamento serviceDepartamento;
	
	@Autowired
	private ServiceMunicipio serviceMunicipio;
	
	@Autowired
	private ServiceCodigoEstado serviceCodigoEstado;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Usuario>> getLista() {
		List<Usuario> lista = serviceUsuario.obtenerTodosUsuarios();
		return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/lista/roles")
	public ResponseEntity<List<CodigoTipoUsuario>> getListaRoles() {
		List<CodigoTipoUsuario> lista = serviceRoles.obtenerTodosLosRoles();
		return new ResponseEntity<List<CodigoTipoUsuario>>(lista, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/nuevo/usuario")
	public ResponseEntity<?> nuevo(@Validated @RequestBody Usuario nuevoUsuario) {
		Usuario usuario = new Usuario(nuevoUsuario.getIdUsuario(), nuevoUsuario.getPrimerNombre(),
				nuevoUsuario.getSegundoNombre(), nuevoUsuario.getPrimerApellido(), nuevoUsuario.getSegundoApellido(),
				nuevoUsuario.getContraseña(), nuevoUsuario.getTelefono(), nuevoUsuario.getCorreo(), nuevoUsuario.getCodigoTiposUsuario());

		serviceUsuario.crearUsuario(usuario);
		return new ResponseEntity(new Mensaje("usuario guardado"), HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/nuevo/rol")
	public ResponseEntity<?> nuevo(@Validated @RequestBody CodigoTipoUsuario tipoUsuario) {
		CodigoTipoUsuario codigotipoUsuario = new CodigoTipoUsuario(tipoUsuario.getIdCodigo(), tipoUsuario.getNombre());

		serviceRoles.crearRoles(codigotipoUsuario);
		return new ResponseEntity(new Mensaje("rol guardado"), HttpStatus.CREATED);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/nuevo/Municipio")
	public ResponseEntity<?> nuevo(@Validated @RequestBody Municipios nuevoMunicipio) {
		Municipios municipio = new Municipios(nuevoMunicipio.getIdMunicipio(), nuevoMunicipio.getNombre(), nuevoMunicipio.getIdDepartamento());

		serviceMunicipio.crearMunicipio(municipio);
		return new ResponseEntity(new Mensaje("municipio guardado"), HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/nuevo/departamento")
	public ResponseEntity<?> nuevo(@Validated @RequestBody Departamento nuevoDepa) {
		Departamento departamento = new Departamento(nuevoDepa.getIdDepartamento(), nuevoDepa.getNombre());

		serviceDepartamento.crearDepartamento(departamento);
		return new ResponseEntity(new Mensaje("departamento guardado"), HttpStatus.CREATED);
	}
}
