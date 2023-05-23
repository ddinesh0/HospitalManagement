package com.example.hms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hms.exception.ResourceNotFoundException;
import com.example.hms.model.Appointment;
import com.example.hms.repository.AppointmentRepository;
import com.example.hms.service.AppointmentService;


@Service
public class AppointServiceImpl implements AppointmentService{
	@Autowired
    private AppointmentRepository appointmentRepository;
	@Override
	public Appointment saveAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	@Override
	public List<Appointment> getAllApponiments() {
		return appointmentRepository.findAll();
	}
	@Override
	public Appointment getAppointmentById(int appointmentId) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(appointmentId).orElseThrow(()->new ResourceNotFoundException("AppointmentService","appointmentid",appointmentId));
	}
	
}
