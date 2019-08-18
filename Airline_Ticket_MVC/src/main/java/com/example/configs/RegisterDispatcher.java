package com.example.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RegisterDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {AirlineConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
