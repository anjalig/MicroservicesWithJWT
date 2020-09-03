package com.agc.admisionservicems.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.agc.admisionservicems.model.Patient;

@Repository("patientDAO")
public class PatientDataAccessService implements PatientDAO{

	List<Patient> DB = new ArrayList<>();
	@Override
	public int insertPatient(UUID id, Patient patient) {
		DB.add(new Patient(id,patient.getName(), patient.getNationality()));
		return 0;
	}

	@Override
	public List<Patient> selectAllPatients() {
		
		return DB;
	}

	@Override
	public Optional<Patient> selectPatientById(UUID id) {
		
		return DB.stream().filter(a->a.getId().equals(id)).findFirst();
	}

	@Override
	public int deletePerson(UUID id) {
		Optional<Patient> patient = selectPatientById(id);
		if(!patient.isPresent())
		{
			return 0;
		}
		DB.remove(patient.get());
		return 1;
	}

	@Override
	public int updatePersonById(UUID id, Patient patient) {
		return selectPatientById(id).map(p->{
			int indexOfPatient = DB.indexOf(p);
			if(indexOfPatient >=0)
			{
				DB.set(indexOfPatient, new Patient(id, patient.getName(), patient.getNationality()));
				return 1;
			}
			return 0;
		}).orElse(0);
		
	}

}
