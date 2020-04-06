package com.maipogrande.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Pagina principal - Maipo Grande");
		return "home";
	}
	
	@GetMapping("/detalle/{id}")
	public String home(@PathVariable("id") int id, Model model) {
		model.addAttribute("title", "Pagina principal - Maipo Grande");
		model.addAttribute("id", id);
		return "home";
	}
	
}
