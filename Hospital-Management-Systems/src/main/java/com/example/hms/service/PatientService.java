package com.example.hms.service;

import java.util.List;

import com.example.hms.model.Patient;

public interface PatientService {
public Patient savePatient(Patient patient);
public List<Patient> getAllpatient();

public Patient getPatientById(int id);

//public Patient loginPatient(Patient patient);

public Patient updatePatient(int id, Patient patient);
public void removePatient(int id);
public Patient getById(int patientId);
}
