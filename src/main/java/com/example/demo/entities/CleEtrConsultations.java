package com.example.demo.entities;

import java.io.Serializable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CleEtrConsultations implements Serializable{
	private Patient patient;
	private Medecin medecin;
}
