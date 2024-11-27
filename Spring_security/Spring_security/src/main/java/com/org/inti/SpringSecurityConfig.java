package com.org.inti;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {
//	@Autowired
//	HttpSecurity httpSecurity;
//	
//	@Bean
//	public InMemoryUserDetailsManager setupuser() {
//		UserDetails jagga=
//				User
//				.withUsername("jagga")
//				.password("{noop}jagga")
//				.roles("admin","user")
//				.build();
//		UserDetails jagga1=
//				User
//				.withUsername("jagga1")
//				.password("{noop}jagga1")
//				.roles("admin","user")
//				.build();
//		
//		return new InMemoryUserDetailsManager(jagga,jagga1);
//	}
//	@Bean
//	SecurityFilterChain setfilters() throws Exception {
//		//httpSecurity.authorizeHttpRequests().anyRequest().permitAll();
////		httpSecurity.authorizeHttpRequests().requestMatchers("/hi").authenticated();
//		httpSecurity.authorizeHttpRequests().requestMatchers("/bye","/Hello").permitAll();
//		//httpSecurity.authorizeHttpRequests().requestMatchers("/Hello").denyAll();
//	httpSecurity.authorizeHttpRequests().requestMatchers("/hi").authenticated();
//		httpSecurity.formLogin();
//		httpSecurity.httpBasic();
//		return httpSecurity.build();
//	}
//	
//
//	
//	
//	
//	@Bean(name = "mvcHandlerMappingIntrospector")
//	public HandlerMappingIntrospector mvcHandlerMappingIntrospector() {
//	    return new HandlerMappingIntrospector();
//	    
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	@Bean
//     InMemoryUserDetailsManager setuproles() {
//    	 ArrayList<GrantedAuthority> roles=new ArrayList<>();
//    	 roles.add(new SimpleGrantedAuthority("admin"));
//    	 roles.add(new SimpleGrantedAuthority("user"));
//    	 //roles.add(new SimpleGrantedAuthority("admin"));
//    	 
//    	 
//    	 
//    	 UserDetails user=new User("jagga", "abc123", roles);
//    	 InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager();
//    	 inMemoryUserDetailsManager.createUser(user);
//    	 return inMemoryUserDetailsManager;
//     }
//	@Bean
//	PasswordEncoder passwordencoder() {
//	   return NoOpPasswordEncoder.getInstance();
//	}
}