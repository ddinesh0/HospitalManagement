/*package com.example.hms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class WebSecurutyConfiguration extends WebSecurityConfigurerAdapter{
@Autowired
private UserDetailsService userDetailsService;
@Bean
AuthenticationProvider authenticationProvider()
{
	DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
	provider.setUserDetailsService(userDetailsService);
	provider.setPasswordEncoder(new BCryptPasswordEncoder());
	return provider;
}
protected void configre(HttpSecurity http) throws Exception
{
	http
	.cors()
	.and()
	.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
	.antMatchers(HttpMethod.OPTIONS).permitAll()
	//.anyRequest().authenticated();
	.antMatchers("/home")
	.hasAuthority("ADMIN")
	.antMatchers("/admin")//URL
	.hasAnyAuthority("ADMIN")
	.anyRequest()
	.authenticated()
	.and()
	//.formLogin();*/
/*.httpBasic();
	//formLogin()
	}
}

*/