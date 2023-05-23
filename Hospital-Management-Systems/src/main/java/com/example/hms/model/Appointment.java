package com.example.hms.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String patientName;
private int age;
private long contactno;
@DateTimeFormat(pattern="yyyy-mm-dd HH:mm:ss")
private Date date;
private String discription;
@ManyToMany
@JoinTable(
		name="patient_Appointments",
		joinColumns= @JoinColumn(name="appointmentId"),
		inverseJoinColumns=@JoinColumn(name="patientId")
		)
private Set<Patient> patientappointments=new HashSet<>();
@ManyToOne(cascade=CascadeType.ALL)// many subjects will be thought by one teacher
@JoinColumn(name="doctorId", referencedColumnName="id") //id is teacher class primary key
private Doctor doctor;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}


public Set<Patient> getPatientappointments() {
	return patientappointments;
}
public void setPatientappointments(Set<Patient> patientappointments) {
	this.patientappointments = patientappointments;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public void assignDoctor(Doctor doctor)
{
	this.doctor=doctor;
}
public void patientappointments(Patient patient) {
	// TODO Auto-generated method stub
	patientappointments.add(patient);
}


}
