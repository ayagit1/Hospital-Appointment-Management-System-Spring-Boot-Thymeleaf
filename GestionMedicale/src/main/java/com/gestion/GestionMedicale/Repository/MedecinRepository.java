package com.gestion.GestionMedicale.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.GestionMedicale.Entity.Medecin;



public interface MedecinRepository extends JpaRepository<Medecin, Long>{
	
	

}
