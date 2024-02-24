package com.gestion.GestionMedicale.Service;

import java.util.List;

import com.gestion.GestionMedicale.Entity.Consultation;



public interface ConsultationService {
	List<Consultation> getAllConsultations();
	
Consultation saveConsultation(Consultation consultation);

Consultation getConsultationById(Long idCons);

Consultation updateConsultation(Consultation consultation); 

void deleteConsultationById(Long idCons);



}
