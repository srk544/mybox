package net.mybox.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/*@Component
 @PropertySource("classpath:application.properties")*/
public class DBConnectionProperties {

	private String host, port, user, password;

	@Autowired
	Environment env;

	@Autowired
	public DBConnectionProperties(String host, String port, String user,String password) {
		this.host=host;
		this.port=port;
		this.user = user;
		this.password = password;
	}

	public String host() {
		return host;
	}

	public String port() {
		return port;
	}

	public String user() {
		return user;
	}

	public String password() {
		return password;
	}
}