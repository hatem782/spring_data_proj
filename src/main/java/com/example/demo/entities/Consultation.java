package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

//jpa
@Entity

@IdClass(CleEtrConsultations.class)
public class Consultation {
	
	private Date dateConsultaion;
	private String description;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "patientId")
	private Patient patient;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "medecinId")
	private Medecin medecin;

}
