/*
 * package com.example.hms.config;
 * 
 * import java.util.Collection; import java.util.Collections;
 * 
 * import org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import com.example.hms.model.Admin;
 * 
 * public class CustomAdminDetails implements UserDetails{ private Admin admin;
 * 
 * public CustomAdminDetails(Admin admin) { super(); this.admin = admin; }
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() { //
 * TODO Auto-generated method stub return Collections.singleton(new
 * SimpleGrantedAuthority(admin.getRole())); }
 * 
 * 
 * 
 * @Override public String getPassword() { // TODO Auto-generated method stub
 * return admin.getPassword(); }
 * 
 * @Override public String getUsername() { // TODO Auto-generated method stub
 * return admin.getUsername(); }
 * 
 * @Override public boolean isAccountNonExpired() { // TODO Auto-generated
 * method stub return true; }
 * 
 * @Override public boolean isAccountNonLocked() { // TODO Auto-generated method
 * stub return true; }
 * 
 * @Override public boolean isCredentialsNonExpired() { // TODO Auto-generated
 * method stub return true; }
 * 
 * @Override public boolean isEnabled() { // TODO Auto-generated method stub
 * return true; }
 * 
 * }
 */