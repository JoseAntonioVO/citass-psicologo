package com.soltel.psico.config;

import java.beans.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class WebSecurityConfig {
	
	   @Bean
	    public SecurityFilterChain filtro(HttpSecurity http) throws Exception {
	        http
	            // Esta configuración es bastante permisiva, pero entra en conflicto con MiConfiguracionCors.java
	            //.cors(cors -> cors.configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues()))
	            .csrf(csrf -> csrf.disable()) // Deshabilitar CSRF
	            .authorizeHttpRequests(auth -> auth
	            		.requestMatchers("/**").permitAll() 	// Permitir solicitudes a /clientes y /reservas
	                .anyRequest().authenticated())
	            .formLogin(form -> form
	                .defaultSuccessUrl("/inicio", true));
	                
	        return http.build();
	    }
}