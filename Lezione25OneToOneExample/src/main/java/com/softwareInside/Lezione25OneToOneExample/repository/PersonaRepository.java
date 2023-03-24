package com.softwareInside.Lezione25OneToOneExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwareInside.Lezione25OneToOneExample.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
