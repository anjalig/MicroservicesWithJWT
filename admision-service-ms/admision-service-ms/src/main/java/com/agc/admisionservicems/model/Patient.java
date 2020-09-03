package com.agc.admisionservicems.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Patient {
	
	private UUID id;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Patient(@JsonProperty("id") UUID id, @JsonProperty("name") String name,@JsonProperty("nationality") String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	private String name;
	private String nationality;

}
