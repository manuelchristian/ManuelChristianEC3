package com.idat.idatapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.dto.HospitalRequestDTO;
import com.idat.idatapirest.dto.HospitalResponseDTO;
import com.idat.idatapirest.service.HospitalService;

@RestController
@RequestMapping("/hospital/v1")
public class HospitalController {

	@Autowired
	private HospitalService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<HospitalResponseDTO>>listar(){
		
		return new ResponseEntity<List<HospitalResponseDTO>>(service.listarProductos(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody HospitalRequestDTO producto){
		service.guardarProducto(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
	public @ResponseBody ResponseEntity<HospitalResponseDTO> productById(@PathVariable Integer id){
		HospitalResponseDTO product = service.productById(id);
		if(product != null) {
			return new ResponseEntity<HospitalResponseDTO>(product, HttpStatus.OK);

		}
		return new ResponseEntity<HospitalResponseDTO>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		HospitalResponseDTO product = service.productById(id);
		if(product != null) {
			service.eliminarProducto(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody HospitalRequestDTO producto){
		HospitalResponseDTO product = service.productById(producto.getIdHospitalRqs());
		if(product != null) {
			service.editarProducto(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	
}
