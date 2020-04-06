package com.maipogrande.service;

import java.util.List;

import com.maipogrande.model.Producto;

public interface IProductoService {
	
	public Producto findById(int id);
	
	public List<Producto> findAll();
	
	public boolean delete(int id);
	
	public Producto edit(Producto prod);
	
	public Producto save(Producto prod);
	
}
