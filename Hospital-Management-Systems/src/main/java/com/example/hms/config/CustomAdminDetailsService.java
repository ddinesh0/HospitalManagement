/*
 * package com.example.hms.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.example.hms.model.Admin; import
 * com.example.hms.repository.AdminRepository;
 * 
 * @Service public class CustomAdminDetailsService implements
 * UserDetailsService{
 * 
 * @Autowired private AdminRepository adminRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { // TODO Auto-generated method stub Admin
 * admin=adminRepository.findByUsername(username); if(admin==null) { throw new
 * UsernameNotFoundException("admin not found"); } return new
 * CustomAdminDetails(admin); }
 * 
 * }
 */
