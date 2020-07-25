package com.springframework.entityMangerExample.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springframework.entityMangerExample.model.Employee;

@Repository
@Transactional
public class EmployessRepo {

	@PersistenceContext
    private EntityManager entityManager;
	
	public long addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee.getId();	
	}
	
	public List<Employee> findAll() {
		Query query=entityManager.createQuery("from Employee");
		return query.getResultList();
	}
}
