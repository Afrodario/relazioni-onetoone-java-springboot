package com.softwareInside.Lezione25OneToOneExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareInside.Lezione25OneToOneExample.models.Persona;
import com.softwareInside.Lezione25OneToOneExample.repository.PersonaRepository;

import jakarta.validation.Valid;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	public boolean addPersonaToDB(@Valid Persona persona) {
		try {
			personaRepository.save(persona);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public List<Persona> getAllPersona() {
		return personaRepository.findAll();
	}
	
}
