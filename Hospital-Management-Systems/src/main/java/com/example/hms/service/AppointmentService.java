package com.example.hms.service;

import java.util.List;

import com.example.hms.model.Appointment;


public interface AppointmentService  {

	public Appointment saveAppointment(Appointment appointment);

	public List<Appointment> getAllApponiments();


	Appointment getAppointmentById(int appointmentId);

}
