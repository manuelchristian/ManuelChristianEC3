package com.idat.idatapirest.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "usarioClients")
@Entity
public class UsuarioCliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String usuario;
	private String password;
	private String rol;
	
	
	@OneToOne
	@JoinColumn(name="id_cliente", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clients (id_cliente)"))
	private Cliente clients;


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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


	public Cliente getClients() {
		return clients;
	}


	public void setClients(Cliente clients) {
		this.clients = clients;
	}

	
}
