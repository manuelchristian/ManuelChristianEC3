package com.idat.idatapirest.dto;

public class UsuarioCliRequestDTO {

	private Integer idUsuarioRqs;
	private String usuario;
	private String password;
	private String rol;
	
	
	
	public UsuarioCliRequestDTO() {
		super();
	}
	public Integer getIdUsuarioRqs() {
		return idUsuarioRqs;
	}
	public void setIdUsuarioRqs(Integer idUsuarioRqs) {
		this.idUsuarioRqs = idUsuarioRqs;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
}
