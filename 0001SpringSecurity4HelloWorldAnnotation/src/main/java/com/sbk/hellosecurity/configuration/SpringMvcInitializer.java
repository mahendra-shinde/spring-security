package com.sbk.hellosecurity.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { HelloWorldConfiguration.class };
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}

/*Notice that above initializer class extends 
 * AbstractAnnotationConfigDispatcherServletInitializer 
 * which is the base class for all WebApplicationInitializer implementations. 
 * Implementations of WebApplicationInitializer configures ServletContext programatically,
 *  for Servlet 3.0 environments. It means we won’t be using web.xml 
 *  and we will deploy the app on Servlet 3.0 container.*/
