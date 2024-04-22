package com.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public class EmployeeRepository {
	
	private List<Employee> employees = new ArrayList<>();
	
	public Employee addEmployee(Employee employee) {
		employees.add(employee);
		return employee;
	}
	
	public Employee findById(Long Id) {
		return employees.stream().filter( employee -> employee.id().equals(Id)).findFirst().orElseThrow();
	}
	
	public List<Employee> findAll(){
		return employees;
	}
	
	public List<Employee> findByDepartmentId(Long Id){
		return employees.stream().filter(employee -> employee.departmentId().equals(Id)).toList();
	}

}
