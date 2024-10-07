package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repository.Convidados;

@Controller
public class ConvidadosController {
	@Autowired
	private Convidados convidados;

	@RequestMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados.todos());
		return mv;
	}

	@RequestMapping(value = "/convidados", method = RequestMethod.POST)
	public String salvar(Convidado novoConvidado) {
		this.convidados.adicionar(novoConvidado);
		return "redirect:/convidados";
	}
	
	public String listarLegado() {
		/* :thinking_face: Por que a string deve ter exatamente o mesmo nome do arquivo HTML?
		 * Google pesquisar.
		 */
		
		return "ListaConvidados";
		/* "ListaConvidados" é o termo que o Spring MVC vai buscar nos templates */
	}

}
