package com.gestion.GestionMedicale.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.GestionMedicale.Entity.Malade;

public interface MaladeRepository extends JpaRepository<Malade, Long>{

}
