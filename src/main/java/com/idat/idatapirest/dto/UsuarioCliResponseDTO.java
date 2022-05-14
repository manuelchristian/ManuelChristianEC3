package com.idat.idatapirest.dto;

public class UsuarioCliResponseDTO {
	
	private String token;

	
	public UsuarioCliResponseDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
		
}
