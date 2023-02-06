package com.configure.webapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mvc.config.RootConfig;
import com.mvc.config.springmvc;

public class ProgAnnotationConfigWebAppInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {springmvc.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {".htm"};
	}

}
