package com.gestion.GestionMedicale.Service;

import java.util.List;

import com.gestion.GestionMedicale.Entity.Medecin;

public interface MedecinService {
	List<Medecin> getAllMedecins();
	
	Medecin saveMedecin(Medecin medecin);
	
	Medecin getMedecinById(Long idmed);
	
	Medecin updateMedecin (Medecin medecin);
	
	void deleteMedecinById(Long idmed);

}
