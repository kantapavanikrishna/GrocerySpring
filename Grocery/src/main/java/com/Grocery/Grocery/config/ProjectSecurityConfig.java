package com.Grocery.Grocery.config;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.securityContext().requireExplicitSave(false)
        .and().cors().configurationSource(new CorsConfigurationSource() {
        public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
            CorsConfiguration config = new CorsConfiguration();
            config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
            config.setAllowedMethods(Collections.singletonList("*"));
            config.setAllowCredentials(true);
            config.setAllowedHeaders(Collections.singletonList("*"));
            config.setMaxAge(3600L);
            return config;
        }
    }
        )
        .and().csrf().ignoringAntMatchers("/users","/users/{id}","/cart/add","/orders/add","/creditcard/add","/welcome","/fruits","/add","/orders","/cart","/category","/creditcard","/dry","/pulses","/seller","/veg","/seller/add").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
				.and().authorizeRequests()
				.antMatchers().authenticated()
				.antMatchers("/users","/users/{id}","/cart/add","/orders/add","/creditcard/add","/welcome","/fruits","/add","/orders","/cart","/category","/creditcard","/dry","/pulses","/seller","/veg","/seller/add").permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();
	}
	

	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
