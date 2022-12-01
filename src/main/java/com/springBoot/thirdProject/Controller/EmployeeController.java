package com.springBoot.thirdProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.thirdProject.Model.Employee;
import com.springBoot.thirdProject.Service.EmployeeService;

@RestController
@RequestMapping("/employeee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		
		return employeeService.getAll();
		
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp){
		
		return employeeService.addEmployee(emp);
		
	}
	
	
	
}
