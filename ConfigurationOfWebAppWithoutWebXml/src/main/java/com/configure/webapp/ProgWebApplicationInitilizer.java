package com.configure.webapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ProgWebApplicationInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

           XmlWebApplicationContext parentWebApplicationContext = null;
           XmlWebApplicationContext childWebApplicationContext = null;
           
           ContextLoaderListener contextLoaderListener = null;
           DispatcherServlet dispatcherServlet = null;
           
           parentWebApplicationContext = new XmlWebApplicationContext();
           parentWebApplicationContext.setConfigLocation("WEB-INF/context-loader.xml");
           contextLoaderListener = new ContextLoaderListener(parentWebApplicationContext);
           
           childWebApplicationContext = new XmlWebApplicationContext();
           childWebApplicationContext.setConfigLocation("WEB-INF/dispatcher.xml");
           dispatcherServlet = new DispatcherServlet(childWebApplicationContext);
	}
}
