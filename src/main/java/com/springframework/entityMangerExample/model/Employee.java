package com.springframework.entityMangerExample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private String designation;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
}
