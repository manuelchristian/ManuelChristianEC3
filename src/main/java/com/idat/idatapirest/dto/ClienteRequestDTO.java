package com.idat.idatapirest.dto;

public class ClienteRequestDTO {

	private Integer idClienteRqs;
	private String nombreCliente;
	private String celular;
	
	public Integer getIdClienteRqs() {
		return idClienteRqs;
	}
	public void setIdClienteRqs(Integer idClienteRqs) {
		this.idClienteRqs = idClienteRqs;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
