package com.gestion.GestionMedicale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestion.GestionMedicale.Repository.MedecinRepository;


@SpringBootApplication
public class GestionMedicaleApplication implements CommandLineRunner{
	

	public static void main(String[] args) {
		SpringApplication.run(GestionMedicaleApplication.class, args);
	}
	
	@Autowired
	private MedecinRepository medecinRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
	}

	public MedecinRepository getMedecinRepository() {
		return medecinRepository;
	}

	public void setMedecinRepository(MedecinRepository medecinRepository) {
		this.medecinRepository = medecinRepository;
	}

}
