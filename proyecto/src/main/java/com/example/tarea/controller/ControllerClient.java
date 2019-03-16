package com.example.tarea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClient {
	
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	@RequestMapping(method=RequestMethod.POST, value="/registrar")
	public String setRegistro(@ModelAttribute("cliente") Client client, Model model) {
		model.addAttribute("cliente", client);
		return "registrados";
	}
}
