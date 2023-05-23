package com.example.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hms.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
