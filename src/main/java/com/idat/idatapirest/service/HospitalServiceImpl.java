package com.idat.idatapirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.dto.HospitalRequestDTO;
import com.idat.idatapirest.dto.HospitalResponseDTO;
import com.idat.idatapirest.model.Hospital;
import com.idat.idatapirest.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository repository;
	
	@Override
	public void guardarProducto(HospitalRequestDTO p) {
		Hospital producto = new Hospital();
		producto.setIdHospital(p.getIdHospitalRqs());
		producto.setNombre(p.getNombre());
		producto.setDescripcion(p.getDescripcion());
		producto.setDistrito(p.getDistrito());
		repository.save(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void editarProducto(HospitalRequestDTO p) {
		Hospital producto = new Hospital();
		producto.setIdHospital(p.getIdHospitalRqs());
		producto.setNombre(p.getNombre());
		producto.setDescripcion(p.getDescripcion());
		producto.setDistrito(p.getDistrito());
		
		repository.saveAndFlush(producto);
	}

	@Override
	public List<HospitalResponseDTO> listarProductos() {

		List<Hospital> producto = repository.findAll();
		
		List<HospitalResponseDTO> dto = new ArrayList<HospitalResponseDTO>();
		HospitalResponseDTO hospitalDto = null;
		
		
		for (Hospital products : producto) {
			hospitalDto = new HospitalResponseDTO();
			hospitalDto.setIdHospitalRsp(products.getIdHospital());
			hospitalDto.setNombre(products.getNombre());
			hospitalDto.setDescripcion(products.getDescripcion());
			hospitalDto.setDistrito(products.getDistrito());
			
			dto.add(hospitalDto);
		}
		
		return dto;
	}

	@Override
	public HospitalResponseDTO productById(Integer id) {
		
		Hospital products = repository.findById(id).orElse(null);
		HospitalResponseDTO hospitalDto = new HospitalResponseDTO();
		
		hospitalDto = new HospitalResponseDTO();
		hospitalDto = new HospitalResponseDTO();
		hospitalDto.setIdHospitalRsp(products.getIdHospital());
		hospitalDto.setNombre(products.getNombre());
		hospitalDto.setDescripcion(products.getDescripcion());
		hospitalDto.setDistrito(products.getDistrito());
		
		return hospitalDto;
	}

}
