package com.gestion.GestionMedicale.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.GestionMedicale.Entity.Malade;
import com.gestion.GestionMedicale.Repository.MaladeRepository;
import com.gestion.GestionMedicale.Service.MaladeService;


@Service
public class MaladeServiceImpl implements MaladeService{
	
	private MaladeRepository maladeRepository;
	
	

	public MaladeServiceImpl(MaladeRepository maladeRepository) {
		super();
		this.maladeRepository=maladeRepository;
		
	}

	@Override
	public List<Malade> getAllMalades() {
		
		return maladeRepository.findAll();
	}

	@Override
	public Malade saveMalade(Malade malade) {
		return maladeRepository.save(malade);
	}

	@Override
	public Malade getMaladeById(Long idmal) {
		
		return maladeRepository.findById(idmal).get();
	}

	@Override
	public Malade updateMalade(Malade malade) {
	
		return maladeRepository.save(malade);
	}

	@Override
	public void deleteMaladeById(Long idmal) {
		maladeRepository.deleteById(idmal);
		
	}

}
