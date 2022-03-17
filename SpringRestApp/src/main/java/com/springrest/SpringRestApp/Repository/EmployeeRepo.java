package com.springrest.SpringRestApp.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.SpringRestApp.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
	public Employee findByEmployeeName(String name);

	public List<Employee> findByEmployeeDepartment(String department);

	public List<Employee> findByEmployeeDesignation(String destignation);

	public List<Employee> findByEmployeeSalary(int salary);

}