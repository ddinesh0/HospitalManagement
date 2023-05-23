package com.example.hms.service;

import java.util.List;


import com.example.hms.model.Admin;

public interface AdminService {
public Admin saveAdmin(Admin admin);
public List<Admin> getAllAdmins();
public Admin updateAdmin(String username, Admin admin);
public Admin loginAdmin(Admin admin);
}
