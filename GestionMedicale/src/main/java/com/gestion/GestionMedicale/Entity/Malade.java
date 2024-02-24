package com.gestion.GestionMedicale.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="Malade")
public class Malade {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idmal;
	
	@Column (name = "nomMal", nullable = false)
	private String nomMal;
	
	
	@Column (name = "dateN", nullable = false)
	
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date dateN;
	@Column (name = "tel_mal", nullable = false)
	private String tel_mal;
	
	


	public Malade() {
	
	}


	public Long getIdmal() {
		return idmal;
	}


	public void setIdmal(Long idmal) {
		this.idmal = idmal;
	}


	public String getNomMal() {
		return nomMal;
	}


	public void setNomMal(String nomMal) {
		this.nomMal = nomMal;
	}


	public Date getDateN() {
		return dateN;
	}


	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}


	public String getTel_mal() {
		return tel_mal;
	}


	public void setTel_mal(String tel_mal) {
		this.tel_mal = tel_mal;
	}


	public Malade(String nomMal, Date dateN, String tel_mal) {
		super();
		this.nomMal = nomMal;
		this.dateN = dateN;
		this.tel_mal = tel_mal;
	}
	
	

}
