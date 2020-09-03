package com.agc.admisionservicems.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.agc.admisionservicems.model.Patient;

public interface PatientDAO {
	
	int insertPatient(UUID id, Patient patient);
	default int insertPerson(Patient patient) {
		UUID id = UUID.randomUUID();
		return insertPatient(id, patient);
	}
	
	List<Patient> selectAllPatients();
	
	Optional<Patient> selectPatientById(UUID id);
	
	int deletePerson(UUID id);
	
	int updatePersonById(UUID id, Patient patient);

}
