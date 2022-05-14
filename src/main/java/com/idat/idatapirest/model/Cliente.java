package com.idat.idatapirest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;


@Table(name="clients")
@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 6026109738059984351L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombreCliente;
	private String celular;
		
	@OneToOne(mappedBy = "clients")
	private UsuarioCliente usuarioCliente;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="hospital_cliente",
	joinColumns = @JoinColumn(name="id_cliente", nullable = false, unique = true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clients (id_cliente)")),
	inverseJoinColumns =  @JoinColumn(name="id_hospital", nullable = false, unique = true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_hospital) references hospital (id_hospital)"))
	)
	private List<Hospital> hospital = new ArrayList<>();


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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


	public UsuarioCliente getUsuarioCliente() {
		return usuarioCliente;
	}


	public void setUsuarioCliente(UsuarioCliente usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}


	public List<Hospital> getHospital() {
		return hospital;
	}


	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}


	

	
}
