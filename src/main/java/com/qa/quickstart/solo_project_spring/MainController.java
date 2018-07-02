package com.qa.quickstart.solo_project_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.quickstart.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService service;
	
	@RequestMapping("/Main")
	public String main_page()
	{
		return service.retrieveString();
	}
}

