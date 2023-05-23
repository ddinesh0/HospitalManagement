package com.example.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hms.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

}
