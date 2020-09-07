package com.agc.admisionservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(scanBasePackages = {"com.agc"})
@EnableConfigServer
public class AdmisionServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmisionServiceMsApplication.class, args);
	}

}
