package com.springBoot.thirdProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.thirdProject.Model.Employee;
import com.springBoot.thirdProject.repository.EmployeeRepository;

@Service

public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAll() {
		
		return employeeRepository.findAll();
	}

	
	

	public Employee addEmployee(Employee emp) {
		
		return employeeRepository.insert(emp);
	}

}
