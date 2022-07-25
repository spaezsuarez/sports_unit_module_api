package com.udistrital.sports.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SportsUnitApiUdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsUnitApiUdApplication.class, args);
	}

}
