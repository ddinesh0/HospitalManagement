package com.example.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hms.model.Appointment;
import com.example.hms.model.Doctor;
import com.example.hms.model.Patient;
import com.example.hms.service.AppointmentService;
import com.example.hms.service.DoctorService;
import com.example.hms.service.PatientService;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@Autowired 
	private DoctorService doctorService;
	@Autowired
	private PatientService patientService;
	@PostMapping
	public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment appointment){
		return new ResponseEntity<Appointment>(appointmentService.saveAppointment(appointment),HttpStatus.CREATED);
	}
	@GetMapping("/appoinments")
	public List<Appointment> getAllAppointments()
	{
		return appointmentService.getAllApponiments();
	}
	@PutMapping("/{appointmentId}/patients/{patientId}")
	Appointment patientappointmentsToAppointment(@PathVariable int appointmentId,@PathVariable int patientId)//@PathVariable("subjectId") long subjectId
	{
		Appointment appointment=appointmentService.getAppointmentById(appointmentId);
	    Patient patient=patientService.getPatientById(patientId);
	    appointment.patientappointments(patient);//adding the student object to the hashSet object 
	     return appointmentService.saveAppointment(appointment);
	
    }
	/*@PutMapping("/{appointmentId}/doctor/{doctorId}")
	Appointment AssignDoctorToAppointment(@PathVariable int appointmentId,@PathVariable int DoctorId)
	{
		Appointment appointment=appointmentService.getAppointmentById(appointmentId);//getting subject object from table
		Doctor doctor=doctorService.getDoctorById(DoctorId);//
	    doctor.assignDoctor(doctor);//adding teacher 
	     return appointmentService.saveAppointment(appointment);//updating  the existing subject object 
		
	}*/
}
