package com.unejsi.springbootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.unejsi.springbootcore",
				"com.unejsi.util"})
public class SpringbootcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcoreApplication.class, args);
	}

}
