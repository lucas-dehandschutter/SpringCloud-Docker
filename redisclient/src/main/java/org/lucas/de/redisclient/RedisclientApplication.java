package org.lucas.de.redisclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisclientApplication.class, args);
	}
}
