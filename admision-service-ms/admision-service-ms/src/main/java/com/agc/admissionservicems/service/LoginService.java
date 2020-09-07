package com.agc.admissionservicems.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Value("{jwt.secret}")
	private String secret;
	public boolean validateUser(String username, String password) {
		return username.equals(secret);
	}

}
