package com.jpm.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jpm.hr.entity.Employee;
import com.jpm.hr.exceptions.HrExceptions;
import com.jpm.hr.services.HrServices;

@Controller
public class HrControllerImpl {
	
	@Autowired
	@Qualifier("HrService")
	private HrServices services;
	
	//http://localhost:8082/home
	@RequestMapping("/home")
	public String getHomePage(){
		
		return "Home";
		
	}
	
	@RequestMapping("/empDetails")
	public ModelAndView getEmpDetails() throws HrExceptions{
		
		Employee emp = services.getEmpDetails(100);
		ModelAndView amv = new ModelAndView("ViewDetails");  //this is the jsp name
		amv.addObject("emp",emp);
		return amv;
	}

}
