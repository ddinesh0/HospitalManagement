/*package com.example.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hms.model.DoctorLogin;
import com.example.hms.repository.DoctorLoginRepository;
@Service
public class DoctorLoginServiceImpl implements DoctorLoginService{
	@Autowired
	private DoctorLoginRepository doctorLoginRepository;

	@Override
	public DoctorLogin loginDoctor(DoctorLogin doctor) {
		// TODO Auto-generated method stub
		return  doctorLoginRepository.findByUsernameAndPassword(doctor.getUsername(),doctor.getPassword());
	}

	/*@Override
	public Doctor DoctorLogin(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorLoginRepository.findByUsernameAndPassword(doctor.getEmail(),doctor.getPassword());
	}*/
	
//}*/
