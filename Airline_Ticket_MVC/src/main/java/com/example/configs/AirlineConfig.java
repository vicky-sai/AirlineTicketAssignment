package com.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.example.model.Booking;
import com.example.model.Flight;



@Configuration 
@EnableWebMvc  
@ComponentScan(basePackages="com.example.controllers") 
public class AirlineConfig implements WebMvcConfigurer {
	
	
	@Bean
	public InternalResourceViewResolver resolver() { 
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/"); 
		resolver.setSuffix(".jsp");
		
		resolver.setViewClass(JstlView.class);
		
		return resolver;
	}
	
	@Bean
	public Booking booking() {
		
		return new Booking();
	}
	
	@Bean
	public ModelAndView mdlView() {
		
		return new ModelAndView();
	}
	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}

	@Bean
	public Flight flight() {
		
		return new Flight();
	}
	
}
