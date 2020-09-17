package com.udemy.springsecurity.demo.config;



import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.udemy.springsecurity.demo")

public class DemoAppConfig {
	
	// set up variable to hold the properties
	
	@Autowired
	private Environment env; // will hold data read from properties files
	
	// set up a logger for diagnostics
	private Logger logger = Logger.getLogger(getClass().getName());
	
	// define a bean for ViewResolver
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	// define a bean for security datasource
	
	@Bean
	public DataSource securityDataSource() {
		
		// create connection pool
		
		// set the jdbc driver class
		
		// log the connection props
		
		// set database connection props
		
		// set connection pool props
		
		return null;
		
	}

}
