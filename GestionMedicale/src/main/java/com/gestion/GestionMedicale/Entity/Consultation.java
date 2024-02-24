package com.gestion.GestionMedicale.Entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="Consultation")

	public class Consultation {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idCons;
		
		@DateTimeFormat(pattern="yyyy-MM-dd") 
		private Date dateCons=null;
		
		
		@Column (name = "prix", nullable = false)
		private String prix;
		
		@Column (name = "description", nullable = false)
		private String description;
		
		@ManyToOne
		@JoinColumn(name = "idmed")
		private Medecin medecin;
		
		@ManyToOne
		@JoinColumn(name = "idmal")
		private Malade malade;
		

		public Malade getMalade() {
			return malade;
		}

		public void setMalade(Malade malade) {
			this.malade = malade;
		}

		public Medecin getMedecin() {
			return medecin;
		}

		public void setMedecin(Medecin medecin) {
			this.medecin = medecin;
		}

		public Long getIdCons() {
			return idCons;
		}

		public void setIdCons(Long idCons) {
			this.idCons = idCons;
		}

		public Date getDateCons() {
			return dateCons;
		}

		public void setDateCons(Date dateCons) {
			this.dateCons = dateCons;
		}

		public String getPrix() {
			return prix;
		}

		public void setPrix(String prix) {
			this.prix = prix;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Consultation(Date dateCons, String prix, String description) {
			super();
			this.dateCons = dateCons;
			this.prix = prix;
			this.description = description;
		}

		public Consultation() {
		
		}
		
		
		
		
	
		

}
