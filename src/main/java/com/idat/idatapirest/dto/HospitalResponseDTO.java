package com.idat.idatapirest.dto;

public class HospitalResponseDTO {


	private Integer idHospitalRsp;
	private String nombre;
	private String descripcion;
	private String distrito;
	
	public Integer getIdHospitalRsp() {
		return idHospitalRsp;
	}
	public void setIdHospitalRsp(Integer idHospitalRsp) {
		this.idHospitalRsp = idHospitalRsp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
}
