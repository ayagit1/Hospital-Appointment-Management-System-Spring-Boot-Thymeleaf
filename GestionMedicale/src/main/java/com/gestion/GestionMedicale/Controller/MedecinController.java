package com.gestion.GestionMedicale.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.gestion.GestionMedicale.Entity.Medecin;
import com.gestion.GestionMedicale.Service.MedecinService;

@Controller
public class MedecinController {
	
	@Autowired
	private MedecinService medecinService;

	public MedecinController(MedecinService medecinService) {
		super();
		this.medecinService = medecinService;
	}
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("medecins", medecinService.getAllMedecins());
		return "index";
		
	}
	@GetMapping("/medecins")
	public String listMedecins(Model model) {
		model.addAttribute("medecins", medecinService.getAllMedecins());
		return "medecins";
		
	}
	
	@GetMapping("/medecins/new")
	public String createMedecinForm(Model model) {
		
		Medecin medecin = new Medecin();
		model.addAttribute("medecin", medecin);
		return "create_medecin";
		
	}
	
	@PostMapping("/medecins")
	public String saveMedecin(@ModelAttribute("medecin") Medecin medecin) {
		medecinService.saveMedecin(medecin);
		return "redirect:/medecins";
	}
	
	@GetMapping("/medecins/edit/{idmed}")
	public String editMedecinForm(@PathVariable("idmed") Long idmed, Model model) {
		model.addAttribute("medecin", medecinService.getMedecinById(idmed));
		return "edit_medecin";
		
	}
	

	
	@PostMapping("/medecins/{idmed}" )
	public String updateMedecin(@PathVariable("idmed") Long idmed,
		@ModelAttribute("medecin") Medecin medecin, Model model	) {
		
		Medecin existinMedecin = medecinService.getMedecinById(idmed);
		
		existinMedecin.setNomMed(medecin.getNomMed());
		existinMedecin.setSpecialite(medecin.getSpecialite());
		existinMedecin.setTel(medecin.getTel());
				
		
		
		medecinService.updateMedecin(existinMedecin);
		return "redirect:/medecins";
	}
	
	@GetMapping("/medecins/{idmed}" )
	public String deteteMedecin(@PathVariable Long idmed) {
		
		medecinService.deleteMedecinById(idmed);
		return "redirect:/medecins";
		
	}

}
