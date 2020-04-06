package com.maipogrande.service;

import java.util.List;

import com.maipogrande.model.Categoria;

public interface ICategoriaService {

public Categoria findById(int id);
	
	public List<Categoria> findAll();
	
	public boolean delete(int id);
	
	public Categoria edit(Categoria obj);
	
	public Categoria save(Categoria obj);
	
}
