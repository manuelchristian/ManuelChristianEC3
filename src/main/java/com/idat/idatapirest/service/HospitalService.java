package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.dto.HospitalRequestDTO;
import com.idat.idatapirest.dto.HospitalResponseDTO;

public interface HospitalService {

	public void guardarProducto(HospitalRequestDTO p);
	public void eliminarProducto(Integer id);
	public void editarProducto(HospitalRequestDTO p);
	public List<HospitalResponseDTO> listarProductos();
	public HospitalResponseDTO productById(Integer id);
	
}
