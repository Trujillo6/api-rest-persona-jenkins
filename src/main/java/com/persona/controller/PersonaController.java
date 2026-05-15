package com.persona.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.modelo.Persona;
import com.persona.service.PersonaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/personas/api/v1")
@RequiredArgsConstructor
public class PersonaController {

	private final PersonaService service;
	
	@GetMapping("/listar")
	public List<Persona> listarAllPersonas(){
		return service.listarPersonas();
	}
}
