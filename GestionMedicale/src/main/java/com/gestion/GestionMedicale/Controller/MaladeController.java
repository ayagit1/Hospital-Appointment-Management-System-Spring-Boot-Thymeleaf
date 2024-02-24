package com.gestion.GestionMedicale.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestion.GestionMedicale.Entity.Malade;
import com.gestion.GestionMedicale.Entity.Medecin;
import com.gestion.GestionMedicale.Repository.MedecinRepository;
import com.gestion.GestionMedicale.Service.MaladeService;


@Controller
public class MaladeController {
	
	@Autowired
	private MaladeService maladeService;

	@Autowired
	private MedecinRepository medecinrepo;
	
	
	public MaladeController(MaladeService maladeService) {
		super();
		this.maladeService = maladeService;
	}
	

	@GetMapping("/malades")
	public String listMalades(Model model) {
		model.addAttribute("malades", maladeService.getAllMalades());
		return "malades";
		
	}
	
	@GetMapping("/malades/new")
	public String createMaladeForm(Model model) {
		
		List<Medecin> listmed =  medecinrepo.findAll();
		Malade malade = new Malade();
		model.addAttribute("malade", malade);
		model.addAttribute("listmed", listmed);
		return "create_malade";
		
	}
	
	@PostMapping("/malades")
	public String saveMalade(@ModelAttribute("malade") Malade malade) {
		maladeService.saveMalade(malade);
		return "redirect:/malades";
	}
	
	@GetMapping("/malades/edit/{idmal}")
	public String editMaladeForm(@PathVariable("idmal") Long idmal, Model model) {
		model.addAttribute("malade", maladeService.getMaladeById(idmal));
		return "edit_malade";
		
	}
	

	
	@PostMapping("/malades/{idmal}" )
	public String updateMalade(@PathVariable("idmal") Long idmal,
		@ModelAttribute("malade") Malade malade, Model model	) {
		
		Malade existinMalade = maladeService.getMaladeById(idmal);
		
		existinMalade.setNomMal(malade.getNomMal());
		existinMalade.setDateN(malade.getDateN());
		existinMalade.setTel_mal(malade.getTel_mal());
				
		
		
		maladeService.updateMalade(existinMalade);
		return "redirect:/malades";
	}
	
	@GetMapping("/malades/{idmal}" )
	public String deteteMalade(@PathVariable Long idmal) {
		
		maladeService.deleteMaladeById(idmal);
		return "redirect:/malades";
		
	}


}
