package com.maipogrande.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maipogrande.model.Producto;
import com.maipogrande.service.IProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@PostMapping("/producto/delete")
	public String delete(@RequestParam("id") String id) {
		
		return "producto/list";
	}
	
	@GetMapping("/productos")
	public String list(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "producto/list";
	}

	@GetMapping("/producto/{id}")
	public String index() {
		
		return "producto/index";
	}
	
	@GetMapping("/producto/create")
	public String create() {
		
		return "producto/create";
	}
	
	@GetMapping("/producto/edit/{id}")
	public String edit() {
		
		return "producto/edit";
	}
	
	@PostMapping("/producto/save")
	public String save(Producto prod) {		
		productoService.save(prod);
		return "redirect:/productos";
	}
}
