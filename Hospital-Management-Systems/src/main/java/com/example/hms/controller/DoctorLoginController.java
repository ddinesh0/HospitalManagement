/*package com.example.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hms.model.DoctorLogin;
import com.example.hms.service.DoctorLoginService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorLoginController {
	@Autowired
	private DoctorLoginService doctorLoginService;
	 @PostMapping("/login")
	   public ResponseEntity<DoctorLogin> loginDoctor(@RequestBody DoctorLogin doctor){
			return new ResponseEntity<DoctorLogin>(doctorLoginService.loginDoctor(doctor),HttpStatus.FOUND);
		}

}*/
