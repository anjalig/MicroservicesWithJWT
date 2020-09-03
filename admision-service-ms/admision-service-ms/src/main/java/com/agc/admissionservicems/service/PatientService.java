package com.agc.admissionservicems.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.agc.admisionservicems.dao.PatientDAO;
import com.agc.admisionservicems.model.Patient;

@Service
public class PatientService {
	
	private final PatientDAO patientDAO;

	@Autowired
	public PatientService(@Qualifier("patientDAO") PatientDAO patientDAO) {
		super();
		this.patientDAO = patientDAO;
	}
	
	public int addPatient(Patient patient) {
		return patientDAO.insertPerson(patient);
	}

	public List<Patient> selectAllPatients(){
		return patientDAO.selectAllPatients();
	}
	
	public Optional<Patient> selectPatientById(UUID id)
	{
		return  patientDAO.selectPatientById(id);
		}
	
	public int deletePatient(UUID id)
	{
		return patientDAO.deletePerson(id);
	}

	public int updatePatientByid(UUID id, Patient updated)
	{
		return patientDAO.updatePersonById(id, updated);
	}
	

}
