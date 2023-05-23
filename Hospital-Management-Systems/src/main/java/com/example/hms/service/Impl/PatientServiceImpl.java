package com.example.hms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hms.exception.ResourceNotFoundException;
import com.example.hms.model.Doctor;
import com.example.hms.model.Patient;
import com.example.hms.repository.PatientRepository;
import com.example.hms.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService{
  @Autowired
  private PatientRepository patientRepository;
	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}
	@Override
	public List<Patient> getAllpatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}
	@Override
	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("patient","id",id));
	}

	/*
	 * @Override public Patient loginPatient(Patient patient) { // TODO
	 * Auto-generated method stub return null; }
	 */
	@Override
	public Patient updatePatient(int id, Patient patient) {
		// TODO Auto-generated method stub
		Patient patient1=getPatientById(id);
		patient1.setName(patient.getName());
		patient1.setAddress(patient.getAddress());
		patient1.setCity(patient.getCity());
		patient1.setContactno(patient.getContactno());
		patient1.setDob(patient.getDob());
		patient1.setCountry(patient.getCountry());
		patient1.setEmail(patient.getEmail());
		patient1.setPassword(patient.getPassword());
		patient1.setState(patient.getState());
		patient1.setGender(patient.getGender());
		
		return patientRepository.save(patient1);
	}
	@Override
	public void removePatient(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}
	@Override
	public Patient getById(int patientId) {
		// TODO Auto-generated method stub
		return patientRepository.findById(patientId).get();
	}

}
