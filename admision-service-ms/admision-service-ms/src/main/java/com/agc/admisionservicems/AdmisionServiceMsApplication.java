package com.agc.admisionservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.agc"})
public class AdmisionServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmisionServiceMsApplication.class, args);
	}

}
