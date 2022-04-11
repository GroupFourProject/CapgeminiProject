package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.dao.UserrService;

import com.model.Userr;

@RestController
public class UserrRestController {

	@Autowired
	UserrService service;
	
	
	@GetMapping("/getuserr")
	public List<Userr> getAllUserr()
	{
		return service.findAll();
	}
	
	@PostMapping("/adduserr")
	public String addUserr(@RequestBody Userr userr)
	{
		service.add(userr);
		return "User Added Successfully";
	}
}
