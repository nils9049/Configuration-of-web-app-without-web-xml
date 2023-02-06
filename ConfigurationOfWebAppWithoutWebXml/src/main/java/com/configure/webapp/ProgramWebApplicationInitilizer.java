package com.configure.webapp;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ProgramWebApplicationInitilizer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createRootApplicationContext() {

		XmlWebApplicationContext rootApplicationContext = null;
		rootApplicationContext = new XmlWebApplicationContext();
		rootApplicationContext.setConfigLocation("WEB-INF/context-application.xml");

		return rootApplicationContext;
	}

	@Override
	protected WebApplicationContext createServletApplicationContext() {

		XmlWebApplicationContext servletApplicationContext = null;
		servletApplicationContext = new XmlWebApplicationContext();
		servletApplicationContext.setConfigLocation("WEB-INF/servlet.xml");
		return servletApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { ".htm" };
	}

}
