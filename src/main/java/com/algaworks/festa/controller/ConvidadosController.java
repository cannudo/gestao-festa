package com.algaworks.festa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadosController {
	
	@RequestMapping("/convidados")
	public String listar() {
		/* :thinking_face: Por que a string deve ter exatamente o mesmo nome do arquivo HTML?
		 * Google pesquisar.
		 */
		
		return "ListaConvidados";
	}

}
