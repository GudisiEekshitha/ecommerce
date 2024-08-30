package com.wipro.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	@Order(SecurityProperties.BASIC_AUTH_ORDER)
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		//http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
		//http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
		http.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/balance","/statement","/loan").authenticated()
				.requestMatchers("/home","/contact").permitAll());
		
		
		http.formLogin(withDefaults());
		http.httpBasic(withDefaults());
		
	//	http.formLogin(flc->flc.disable());
		//http.formLogin(hbc->hbc.disable());
		
		return http.build();
		
		//******************************************
		
		
	}
}
