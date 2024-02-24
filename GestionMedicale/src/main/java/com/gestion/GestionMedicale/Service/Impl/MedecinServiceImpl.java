package com.gestion.GestionMedicale.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.GestionMedicale.Entity.Medecin;
import com.gestion.GestionMedicale.Repository.MedecinRepository;
import com.gestion.GestionMedicale.Service.MedecinService;


@Service
public class MedecinServiceImpl implements MedecinService{
	
	private MedecinRepository medecinRepository;
	

	public MedecinServiceImpl(MedecinRepository medcinRepository) {
		super();
		this.medecinRepository = medcinRepository;
	}


	@Override
	public List<Medecin> getAllMedecins() {
		
		return medecinRepository.findAll();
	}


	@Override
	public Medecin saveMedecin(Medecin medecin) {
		
		return medecinRepository.save(medecin);
	}


	@Override
	public Medecin getMedecinById(Long idmed) {
		
		return medecinRepository.findById(idmed).get();
	}


	@Override
	public Medecin updateMedecin(Medecin medecin) {
		return medecinRepository.save(medecin);
	}


	@Override
	public void deleteMedecinById(Long idmed) {
		medecinRepository.deleteById(idmed);
		
	}
	 

}
