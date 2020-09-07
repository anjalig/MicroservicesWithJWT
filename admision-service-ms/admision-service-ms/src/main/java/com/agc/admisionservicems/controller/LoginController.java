package com.agc.admisionservicems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.agc.admissionservicems.service.JwtuserDeatilsService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	JwtuserDeatilsService jwtuserDeatilsService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(ModelMap model) {
		return "login";
	}
	
}
