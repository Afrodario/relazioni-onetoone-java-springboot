package com.softwareInside.Lezione25OneToOneExample.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String cognome;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_id")
	private Pc pc;
	
	//COSTRUTTORE SENZA ID
	public Persona(String nome, String cognome, Pc pc) {
		setNome(nome);
		setCognome(cognome);
		setPc(pc);
	}
}
