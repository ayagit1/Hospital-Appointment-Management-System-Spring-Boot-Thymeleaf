package com.gestion.GestionMedicale.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Maladie")
public class Maladie {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idmaladie;
	
	@Column (name = "nomMalaladi", nullable = false)
	private String nomMalaladi;

	public Long getIdmaladie() {
		return idmaladie;
	}

	public void setIdmaladie(Long idmaladie) {
		this.idmaladie = idmaladie;
	}

	public String getNomMalaladi() {
		return nomMalaladi;
	}

	public void setNomMalaladi(String nomMalaladi) {
		this.nomMalaladi = nomMalaladi;
	}

	public Maladie(String nomMalaladi) {
		super();
		this.nomMalaladi = nomMalaladi;
	}

	public Maladie() {
		super();
		
	}
	
	

}
