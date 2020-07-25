package com.springframework.entityMangerExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.entityMangerExample.model.Employee;
import com.springframework.entityMangerExample.repo.EmployessRepo;

@Controller
@RequestMapping("/")
public class EmployeeController {
  
	@Autowired
	private EmployessRepo employessRepo;
	
	@RequestMapping("/getEmployee")
	public String getEmployee() {
		List<Employee> empList =employessRepo.findAll();
		System.out.println(empList);
		return "";		
	}
}
