package com.gestion.GestionMedicale.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Symptome")
public class Symptome {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idsym;
	
	@Column (name = "nomSym", nullable = false)
	private String nomSym;

	public Long getIdsym() {
		return idsym;
	}

	public void setIdsym(Long idsym) {
		this.idsym = idsym;
	}

	public String getNomSym() {
		return nomSym;
	}

	public void setNomSym(String nomSym) {
		this.nomSym = nomSym;
	}

	public Symptome(String nomSym) {
		super();
		this.nomSym = nomSym;
	}

	public Symptome() {
	
	}
	
	

}
