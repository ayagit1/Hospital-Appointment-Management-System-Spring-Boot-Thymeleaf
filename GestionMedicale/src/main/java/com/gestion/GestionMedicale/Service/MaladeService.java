package com.gestion.GestionMedicale.Service;

import java.util.List;

import com.gestion.GestionMedicale.Entity.Malade;


public interface MaladeService {
	
	List<Malade> getAllMalades();
	
	Malade saveMalade(Malade malade);
	
	Malade getMaladeById(Long idmal);
	
	Malade updateMalade (Malade malade);
	
	void deleteMaladeById(Long idmal);
}
