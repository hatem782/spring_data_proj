package com.example.demo.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.dao.PatientRepository;
import com.example.demo.entities.Patient;


@Controller
@RequestMapping(value="patients")
public class PatientController {
	@Autowired
	PatientRepository patient;
	
	@GetMapping("/liste")
	public String act1(Model model) {
		List<Patient> patients = patient.findAll();
		model.addAttribute("listePatients", patients);
		return "listerPatients.html";
	}
	
	
	

}
