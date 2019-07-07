package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.service.EmployeeService;

@Controller
public class EmployeeCntroller {
	
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/wish.htm")
	public String wish(Model model) {
		   
		System.out.println("Test");
		     String msg=service.getWish();
		     model.addAttribute("msg",msg);
		      return "employeedetails";
	}

}
