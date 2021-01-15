package com.example.demo.entities;

import java.io.Serializable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CleEtrPatientLit implements Serializable{
	
	private Patient patient;
	private Lit lit;
	
}
