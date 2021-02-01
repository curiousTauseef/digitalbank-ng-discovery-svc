package io.digisic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DigitalbankNgDiscoverySvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalbankNgDiscoverySvcApplication.class, args);
	}

}
