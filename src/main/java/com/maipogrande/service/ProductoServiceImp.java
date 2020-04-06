package com.maipogrande.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.maipogrande.model.Producto;

@Service
public class ProductoServiceImp implements IProductoService {
	
	private List<Producto> lista = null;
	
	public ProductoServiceImp() {		
		this.lista = new LinkedList<Producto>();	
	}

	@Override
	public Producto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return this.lista;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Producto edit(Producto prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto save(Producto prod) {
		try {
			lista.add(prod);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return prod;
	}

}
