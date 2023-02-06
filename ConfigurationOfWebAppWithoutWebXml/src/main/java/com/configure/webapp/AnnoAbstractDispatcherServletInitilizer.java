package com.configure.webapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.mvc.config.RootConfig;
import com.mvc.config.springmvc;

public class AnnoAbstractDispatcherServletInitilizer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
	    
		AnnotationConfigApplicationContext rootApplicationContext = null;
		rootApplicationContext = new AnnotationConfigApplicationContext();
		rootApplicationContext.register(RootConfig.class);
		return (WebApplicationContext) rootApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {".htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		
		AnnotationConfigApplicationContext servletApplicationContext = null;
		servletApplicationContext = new AnnotationConfigApplicationContext();
		servletApplicationContext.register(springmvc.class);
		return (WebApplicationContext) servletApplicationContext;
	}

}
