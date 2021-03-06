package org.hcl.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:database.properties")
public class AppContext {
	@Autowired
	Environment environment;
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
		datasource.setUrl(environment.getProperty("jdbc.url"));
		datasource.setUsername(environment.getProperty("jdbc.username"));
		datasource.setPassword(environment.getProperty("jdbc.password"));
		return datasource;
	}
	@Bean
	public LocalSessionFactoryBean getFactoryBean() {
		LocalSessionFactoryBean factorybean=new LocalSessionFactoryBean();
		factorybean.setDataSource(getDataSource());
		factorybean.setHibernateProperties(getproperties());
		factorybean.setPackagesToScan("org.hcl.entities");
		return factorybean;
		
	}
	public Properties getproperties() {
		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.setProperty("hibernate.format_sql",environment.getProperty("hibernate.format_sql"));
		properties.setProperty("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}
	@Bean
	public HibernateTransactionManager getTranscationManager() {
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(getFactoryBean().getObject());
		return transactionManager;
	}
	
	
}
