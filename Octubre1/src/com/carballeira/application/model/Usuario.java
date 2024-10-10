package com.carballeira.application.model;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String usuario;
	private String contraseña;
	private String estatus;
	
	
	public Usuario(String nombre, String apellidos, String usuario, String contraseña, String estatus) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.estatus = estatus;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public boolean ComprobarUsuario() {
		if(this.getNombre().isEmpty()|| this.getApellidos().isEmpty()|| this.getUsuario().isEmpty()) {
			return false;
			
		}
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", usuario=" + usuario + ", contraseña="
				+ contraseña + ", estatus=" + estatus + "]";
	}
	
	
	
	
}
