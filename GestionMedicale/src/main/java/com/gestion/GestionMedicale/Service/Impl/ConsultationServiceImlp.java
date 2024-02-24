package com.gestion.GestionMedicale.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.GestionMedicale.Entity.Consultation;
import com.gestion.GestionMedicale.Repository.ConsultationRepository;
import com.gestion.GestionMedicale.Service.ConsultationService;


@Service
public class ConsultationServiceImlp implements ConsultationService{
	
	private ConsultationRepository consultationRepository;
	
	public ConsultationServiceImlp(ConsultationRepository consultationRepository) {
		super();
		this.consultationRepository=consultationRepository;
	}


	@Override
	public List<Consultation> getAllConsultations() {
	
		return consultationRepository.findAll();
	}

	@Override
	public Consultation saveConsultation(Consultation consultation) {
		
		return consultationRepository.save(consultation);
	}


	@Override
	public Consultation getConsultationById(Long idCons) {
		
		return consultationRepository.findById(idCons).get();
	}


	@Override
	public Consultation updateConsultation(Consultation consultation) {
		
		return consultationRepository.save(consultation);
	}


	@Override
	public void deleteConsultationById(Long idCons) {
	 consultationRepository.deleteById(idCons);
		
	}
	


	

	

	
}

	