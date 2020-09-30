package com.dxcfs.eurekapub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxcfs.eurekapub.model.Employee;

@RestController
public class PublisherController {
	
	
	@RequestMapping(value="/getemployee")
	public Employee getEmployee()
	{
	return new Employee("Harshu", 25000);
	}
	

}
