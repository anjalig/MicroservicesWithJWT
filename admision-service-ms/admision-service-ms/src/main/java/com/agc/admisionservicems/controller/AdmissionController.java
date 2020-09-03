package com.agc.admisionservicems.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agc.admisionservicems.model.Patient;
import com.agc.admissionservicems.service.PatientService;

@RequestMapping("api/v1/patient")
@RestController
public class AdmissionController {
	
	private final PatientService patientService;

	@Autowired
	public AdmissionController(PatientService patientService) {
		super();
		this.patientService = patientService;
	} 
	
	
	
	@PostMapping
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	@GetMapping
	public List<Patient> getAllPatients(){
		return patientService.selectAllPatients();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Patient> getPatientById(@PathVariable("id") UUID id){
		return Optional.ofNullable(patientService.selectPatientById(id).orElse(null));
	}
	
	@DeleteMapping(path="/{id}")
	public void deletePatient(@PathVariable("id") UUID id) {
		patientService.deletePatient(id);
	}
	
	@PutMapping(path ="/{id}")
	public void updatePatient(@PathVariable("id") UUID id, @RequestBody Patient newPatient) {
		patientService.updatePatientByid(id, newPatient);
	}


}
