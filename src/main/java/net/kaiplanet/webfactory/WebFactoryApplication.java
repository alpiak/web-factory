package net.kaiplanet.webfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WebFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFactoryApplication.class, args);
	}

}
