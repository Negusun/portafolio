package com.maipogrande.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maipogrande.model.Categoria;
import com.maipogrande.repository.CategoriaRepository;

@Service
public class CategoriaServiceImp implements ICategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepo;

	@Override
	public Categoria findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Categoria edit(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria save(Categoria categoria) {
		categoriaRepo.save(categoria);
		return categoria;
	}

}
