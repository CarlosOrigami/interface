package com.carballeira.application.controller;

import com.carballeira.application.model.Usuario;
import com.carballeira.application.view.FormularioView;

public class FormularioController {
	private Usuario usuario;
	private FormularioView vista;
	public FormularioController(Usuario usuario, FormularioView vista) {
		super();
		this.usuario = usuario;
		this.vista = vista;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public FormularioView getVista() {
		return vista;
	}
	public void setVista(FormularioView vista) {
		this.vista = vista;
	}
	
	public void comprobar () {
		if (this.usuario.ComprobarUsuario()){
			this.vista.anadirUsuario(this.usuario);
			
	
		}
	}

}
