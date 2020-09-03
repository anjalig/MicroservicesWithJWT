package com.agc.admisionservicems.model;

import java.io.Serializable;

public class JwtResponse implements Serializable{

	private static final long serialVersionUID = -139461945789367085L;
	private final String jwttoken;
	
	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getJwttoken() {
		return jwttoken;
	}
	

}
