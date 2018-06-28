package net.mybox.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


@Configuration
public class ApplicationConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public DBConnectionProperties dBConnectionProperties(){
		String host = env.getProperty("mybox.host");
		String port = env.getProperty("mybox.port");
		String username = env.getProperty("mybox.username");
		String password = env.getProperty("mybox.password");
		return new DBConnectionProperties(host,port,username,password);
	}
}
