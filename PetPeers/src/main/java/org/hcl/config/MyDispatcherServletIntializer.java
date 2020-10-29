package org.hcl.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] {AppContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {MvcConfig.class};

	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };

	}
}
