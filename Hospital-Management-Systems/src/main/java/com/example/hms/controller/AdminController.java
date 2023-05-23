package com.example.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hms.model.Admin;
import com.example.hms.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
 @Autowired
 private AdminService adminService;
 @PostMapping
 public ResponseEntity<Admin>saveAdmin(@RequestBody Admin admin){
	 return new ResponseEntity<Admin> (adminService.saveAdmin(admin),HttpStatus.CREATED);
 }
 
 @GetMapping("/get")
 public List<Admin>getAllAdmins(){
	 return adminService.getAllAdmins();
 }
}
