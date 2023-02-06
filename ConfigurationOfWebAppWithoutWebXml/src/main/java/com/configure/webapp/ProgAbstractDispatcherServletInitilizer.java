package com.configure.webapp;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ProgAbstractDispatcherServletInitilizer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext serApplicationContext = null;
		serApplicationContext = new XmlWebApplicationContext();
		serApplicationContext.setConfigLocation("WEB-INF/dispatcher.xml");
		return serApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { ".html" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {

		XmlWebApplicationContext rootApplicationContext = null;
		rootApplicationContext = new XmlWebApplicationContext();
		rootApplicationContext.setConfigLocation("WEB-INF/application.xml");
		return rootApplicationContext;
	}

}
