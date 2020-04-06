package com.maipogrande.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA")
public class Categoria {
	
	@Id
	@SequenceGenerator(name = "SequenceIdGenerator", sequenceName = "SEQ_GENERATOR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceIdGenerator")
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@Column(name="CATEGORIA")
	private String categoria;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
