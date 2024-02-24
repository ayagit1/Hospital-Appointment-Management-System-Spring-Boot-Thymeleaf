package com.gestion.GestionMedicale.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="Medecin")

public class Medecin {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idmed;
	
	@Column (name = "nomMed", nullable = false)
	private String nomMed;
	@Column (name = "specialite", nullable = false)
	private String specialite;
	@Column (name = "tel", nullable = false)
	private String tel;
	
	
	
	public long getIdmed() {
		return idmed;
	}
	
	
	public Medecin() {
	
	}


	
	public String getNomMed() {
		return nomMed;
	}


	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setIdmed(long idmed) {
		this.idmed = idmed;
	}


	public Medecin(String nomMed, String specialite, String tel) {
		super();
		this.nomMed = nomMed;
		this.specialite = specialite;
		this.tel = tel;
	}


	
	
}

