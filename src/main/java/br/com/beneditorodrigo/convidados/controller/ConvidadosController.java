package br.com.beneditorodrigo.convidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.beneditorodrigo.convidados.model.Convidado;
import br.com.beneditorodrigo.convidados.model.ConvidadoRepositorie;

@RestController
public class ConvidadosController {

	@Autowired
	ConvidadoRepositorie convidadoRepositorie;
	
	@PostMapping("/")
	public Convidado novoConvidado(Convidado convidado) {
		convidadoRepositorie.save(convidado);
		return convidado;
	}
	
	@RequestMapping("/")
	public String exibir() {
		return "Spring Boot";
	}
}
