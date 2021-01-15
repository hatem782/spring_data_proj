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

@IdClass(CleEtrPatientLit.class)
public class PatientLit {
	private Date dateDebut;
	private Date dateFin;
	
	private double prixTotal;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "patientId")
	private Patient patient;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "litId")
	private Lit lit;

}
