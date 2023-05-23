package com.example.hms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hms.model.Admin;
import com.example.hms.model.Doctor;
import com.example.hms.repository.AdminRepository;
import com.example.hms.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository adminRepository;
    
	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}
	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
	@Override
	public Admin updateAdmin(String username, Admin admin) {
		// TODO Auto-generated method stub
		Admin admin1=getAdminByUsername(username);
		admin1.setPassword(admin.getPassword());
		return adminRepository.save(admin);
	}
	private Admin getAdminByUsername(String username) {
		// TODO Auto-generated method stub
		Admin admin=getAdminByUsername(username);
		return adminRepository.findByUsername(username);
	}
	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.findByUsername(admin.getUsername());
	}
	

}
