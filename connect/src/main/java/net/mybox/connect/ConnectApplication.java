package net.mybox.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"net.mybox"})
public class ConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectApplication.class, args);
	}
}
