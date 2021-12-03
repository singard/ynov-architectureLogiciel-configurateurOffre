package com.ynov.architectureLogiciel.apiProduit.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	 @Autowired
	    Environment environment;
	    
	    @Bean
	    public DataSource dataSource() {
	    	
	            final DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	            dataSource.setDriverClassName(environment.getProperty("driverClassName"));
//	            dataSource.setUrl(environment.getProperty("url"));
//	            dataSource.setUsername(environment.getProperty("user"));
//	            dataSource.setPassword(environment.getProperty("password"));
	            
	            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	            dataSource.setUrl("jdbc:mysql://localhost:3306/architecturelogicielproduit");
	            dataSource.setUsername("root");
	            dataSource.setPassword("");
	            
	            return dataSource;
	        
	    }

}
