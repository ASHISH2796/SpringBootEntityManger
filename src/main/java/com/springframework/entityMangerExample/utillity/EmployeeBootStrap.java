package com.springframework.entityMangerExample.utillity;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springframework.entityMangerExample.model.Employee;
import com.springframework.entityMangerExample.repo.EmployessRepo;

@Component
public class EmployeeBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private final EmployessRepo employessRepo;
	
	public EmployeeBootStrap(EmployessRepo employessRepo) {
		this.employessRepo = employessRepo;
	}


@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("BootStraping data....");
		
		System.out.println("Ashish Id : "+ employessRepo.addEmployee(new Employee("Ashish","SDE")));
		System.out.println("Ashish Id : "+ employessRepo.addEmployee(new Employee("Rakesh","Tester")));
		System.out.println("Ashish Id : "+ employessRepo.addEmployee(new Employee("Akash","Analyst")));
		System.out.println("Ashish Id : "+ employessRepo.addEmployee(new Employee("Job","SDE")));
	}

}
