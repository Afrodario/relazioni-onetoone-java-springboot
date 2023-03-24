package com.softwareInside.Lezione25OneToOneExample.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String marca;
	@Min(value = 200)
	private double prezzo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "monitor_id")
	private Monitor monitor;
	
	//COSTRUTTORE SENZA ID
	public Pc(String marca, double prezzo, Monitor monitor) {
		setMarca(marca);
		setPrezzo(prezzo);
		setMonitor(monitor);
	}
}
