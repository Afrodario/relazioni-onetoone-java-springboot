package com.softwareInside.Lezione25OneToOneExample.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Monitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String marca;
	@Min(value = 30)
	private double pollici;
	
	//COSTRUTTORE SENZA ID
	public Monitor(String marca, double pollici) {
		setMarca(marca);
		setPollici(pollici);
	}
}

