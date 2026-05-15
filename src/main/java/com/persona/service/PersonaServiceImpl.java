package com.persona.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.persona.modelo.Persona;
import com.persona.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService{
	
	private final PersonaRepository repository;

	@Override
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
