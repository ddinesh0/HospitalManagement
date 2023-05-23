package com.example.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hms.model.Doctor;
import com.example.hms.repository.DoctorRepository;
@Service
public  class DoctorServiceImpl implements DoctorService{
     @Autowired
     DoctorRepository doctorRepository;
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	@Override
	public List<Doctor> getAlldoctors() {
		return doctorRepository.findAll();
	}
	@Override
	public Doctor getDoctorById(int doctor_id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctor_id).get();
	}
	@Override
	public Doctor loginDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.findByEmailAndPassword(doctor.getEmail(),doctor.getPassword());
	}
	@Override
	public Doctor updateDoctor(int id, Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removeDoctor(int id) {
		// TODO Auto-generated method stub
		
	}

}
