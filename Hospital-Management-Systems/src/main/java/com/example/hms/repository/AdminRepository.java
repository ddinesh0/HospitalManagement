package com.example.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hms.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String>{

	public Admin findByUsername(String username);
   //public Admin findByUsernameAndPassword(String username,String password);

}
