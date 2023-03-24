package com.softwareInside.Lezione25OneToOneExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwareInside.Lezione25OneToOneExample.models.Persona;
import com.softwareInside.Lezione25OneToOneExample.service.PersonaService;

@RequestMapping("/api")
@RestController
public class PersonaRestController {

	@Autowired
	PersonaService personaService;
	
	@PostMapping("/crea")
	public boolean aggiungiPersona(@RequestBody Persona persona) {
		return personaService.addPersonaToDB(persona);
	}
	
	@GetMapping("/stampa")
	public List<Persona> stampaListaPersona() {
		return personaService.getAllPersona();
	}
	
}
