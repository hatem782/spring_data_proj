package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.dao.MedecinRepository;
import com.example.demo.entities.Medecin;

@Controller
@RequestMapping(value="medecins")
public class MedecinController {
	@Autowired
	MedecinRepository medecin;
	
	@GetMapping("/liste")
	public String act1(Model model) {
		List<Medecin> medecins = medecin.findAll();
		model.addAttribute("listeMedecins", medecins);
		return "listerMedecins.html";
	}
}
