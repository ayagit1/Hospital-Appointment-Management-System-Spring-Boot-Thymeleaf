package com.gestion.GestionMedicale.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestion.GestionMedicale.Entity.Consultation;
import com.gestion.GestionMedicale.Entity.Malade;
import com.gestion.GestionMedicale.Entity.Medecin;
import com.gestion.GestionMedicale.Repository.MaladeRepository;
import com.gestion.GestionMedicale.Repository.MedecinRepository;
import com.gestion.GestionMedicale.Service.ConsultationService;


@Controller
public class ConsultationController {
	
	@Autowired
	private ConsultationService consultationService;
	
	@Autowired
	private MaladeRepository maladrepo;
	
	@Autowired
	private MedecinRepository medrepo;

	public ConsultationController(ConsultationService consultationService) {
		super();
		this.consultationService = consultationService;
	}

	@GetMapping("/consultations")
	private String listConsultations(Model model) {
		model.addAttribute("consultations", consultationService.getAllConsultations());
		return "consultations";
		
	}
	
	@GetMapping("/consultations/new")
	public String createConsultationForm(Model model) {
		
		List<Malade> listmal =  maladrepo.findAll();
		List<Medecin>listmed = medrepo.findAll();
		Consultation consultation = new Consultation();
		model.addAttribute("consultation", consultation);
		model.addAttribute("listmal", listmal);
		model.addAttribute("listmed", listmed);
		return "create_consultation";
		
	}
	
	@PostMapping("/consultations")
	public String saveConsultation(@ModelAttribute("consultation") Consultation consultation) {
		consultationService.saveConsultation(consultation);
		return "redirect:/consultations";

}
	@GetMapping("/consultations/edit/{idCons}")
	public String editConsultationForm(@PathVariable("idCons") Long idCons, Model model) {
		model.addAttribute("consultation", consultationService.getConsultationById(idCons));
		return "edit_consultation";
		
	}
	

	
	@PostMapping("/consultations/{idCons}" )
	public String updateConsultation(@PathVariable("idCons") Long idCons,
		@ModelAttribute("consultation") Consultation consultation, Model model	) {
		
		Consultation existinConsultation = consultationService.getConsultationById(idCons);
		
		existinConsultation.setDateCons(consultation.getDateCons());
		existinConsultation.setPrix(consultation.getPrix());
		existinConsultation.setDescription(consultation.getDescription());
		
				
		
		
		consultationService.updateConsultation(existinConsultation);
		return "redirect:/consultations";
	}
	
	@GetMapping("/consultations/{idCons}" )
	public String deteteMedecin(@PathVariable Long idCons) {
		
		consultationService.deleteConsultationById(idCons);
		return "redirect:/consultations";
		
	}
}
